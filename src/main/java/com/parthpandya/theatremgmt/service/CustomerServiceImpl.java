package com.parthpandya.theatremgmt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.parthpandya.theatremgmt.model.Cinema;
import com.parthpandya.theatremgmt.model.Movie;
import com.parthpandya.theatremgmt.model.Screen;
import com.parthpandya.theatremgmt.repository.CinemaRepository;
import com.parthpandya.theatremgmt.repository.MovieRepository;
import com.parthpandya.theatremgmt.repository.ScreenRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	@Qualifier("movieRepository")
    private MovieRepository movieRepository;
	
	@Autowired
	@Qualifier("cinemaRepository")
    private CinemaRepository cinemaRepository;

	@Autowired
	@Qualifier("screenRepository")
    private ScreenRepository screenRepository;
	
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

    public List<Screen> getAllScreenSessions(String movieName) {
        //TODO.PP
        return new ArrayList<>();
    }

}
