package com.parthpandya.theatremgmt.service;

import java.util.ArrayList;
import java.util.List;

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

    	System.out.println("MCount:" + movieSelection.size());
        if(!movieSelection.isEmpty()) {
        	List<Cinema> cinemas = new ArrayList<Cinema>();
        	cinemaRepository.findAll().forEach(cinemas::add);

        	System.out.println("Count:" + movieSelection.get(0).getId());
        	/*cinemas = cinemas.stream()
        	           .filter(e -> e.getMovies().stream().anyMatch(m -> m.getId() == movieSelection.get(0).getId()))
        	           .collect(Collectors.toList());
        	*/
        	for(Movie m: cinemas.get(0).getMovies()) {
        		System.out.println(m.getMovieName());
        	}
	        /*for(int i=6; i<24;i++) { 
	        	if(i+totalDuration < 24)
	        		this.movieSessions.add((float) (i+totalDuration)); 
	        }*/
	    	 
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
