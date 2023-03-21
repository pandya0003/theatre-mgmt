package com.parthpandya.theatremgmt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.parthpandya.theatremgmt.model.Cinema;
import com.parthpandya.theatremgmt.model.Movie;
import com.parthpandya.theatremgmt.model.Order;
import com.parthpandya.theatremgmt.model.Screen;
import com.parthpandya.theatremgmt.model.Transaction;
import com.parthpandya.theatremgmt.payment.AbstractPayment;
import com.parthpandya.theatremgmt.repository.CinemaRepository;
import com.parthpandya.theatremgmt.repository.MovieRepository;
import com.parthpandya.theatremgmt.repository.ScreenRepository;
import com.parthpandya.theatremgmt.repository.TransactionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	private MovieRepository movieRepository;
	private CinemaRepository cinemaRepository;
	private ScreenRepository screenRepository;
	private TransactionRepository transactionRepository;
	
	
	@Autowired
    public CustomerServiceImpl(MovieRepository movieRepository, CinemaRepository cinemaRepository,
			ScreenRepository screenRepository, TransactionRepository transactionRepository) {
		super();
		this.movieRepository = movieRepository;
		this.cinemaRepository = cinemaRepository;
		this.screenRepository = screenRepository;
		this.transactionRepository = transactionRepository;
	}

	public List<Cinema> getAllShowsByMovieAndCity(String movie, String city) {
        List<Movie> movieSelection = movieRepository.findByMovieName(movie);
        if(!movieSelection.isEmpty()) {
        	List<Cinema> cinemas = cinemaRepository.findAllByCity(city);
        	cinemas = cinemas.stream()
     	           .filter(e -> e.getMovies().stream().anyMatch(m -> m.getMovieName().equals(movie)))
     	           .collect(Collectors.toList());
        	return cinemas;
        } else {
        	return new ArrayList<>();
        }
    }

    public List<Screen> getAllShowsByMovieAndGeoCoordinates(String movieSelected, String[] geoCoordinates) {
        //TODO.PP
        return new ArrayList<>();
    }

	@Override
	public Transaction checkout(Order order) {
		Optional<Screen> s = this.screenRepository.findById(order.getScreen().getId());
		if(s.isPresent()) 
			order.setScreen(s.get());
		
		Optional<Transaction> newBooking = AbstractPayment.checkoutBooking(order);
		return this.transactionRepository.save(newBooking.get());
	}

}
