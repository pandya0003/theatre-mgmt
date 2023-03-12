package com.parthpandya.theatremgmt.service;

import com.parthpandya.theatremgmt.model.Movie;
import com.parthpandya.theatremgmt.model.Screen;
import com.parthpandya.theatremgmt.repository.MovieRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Autowired
	@Qualifier("movieRepository")
    private MovieRepository movieRepository;

    public List<Screen> getAllShowsByMovieAndCity(String movie, Optional<String> city) {
        List<Movie> movieSelection = movieRepository.findByMovieName(movie);
        //Address address = addressRepository.findByCity(city);
        return new ArrayList<>();//movieSelection.airedScreens(city.get());
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
