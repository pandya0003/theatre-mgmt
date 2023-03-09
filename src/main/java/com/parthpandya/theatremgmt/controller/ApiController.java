package com.parthpandya.theatremgmt.controller;

import com.parthpandya.theatremgmt.model.Screen;
import com.parthpandya.theatremgmt.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/screens")
    public List<Screen> listAllShows(String movieSelected, String[] geoCoordinates, Optional<String> currentCity) {
        if(currentCity.isPresent()) {
            return this.movieService.getAllShowsByMovieAndCity(movieSelected, currentCity);
        } else {
            return this.movieService.getAllShowsByMovieAndGeoCoordinates(movieSelected, geoCoordinates);
        }

    }
}