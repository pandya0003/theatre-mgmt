package com.parthpandya.theatremgmt.controller;

import com.parthpandya.theatremgmt.model.Screen;
import com.parthpandya.theatremgmt.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    private MovieService movieService;
    
    @Autowired
    public ApiController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/screens")
    public List<Screen> listAllShows(String movieSelected, String[] geoCoordinates, Optional<String> currentCity) {
        if(currentCity.isPresent()) {
            return this.movieService.getAllShowsByMovieAndCity(movieSelected, currentCity);
        } else {
            //return this.movieService.getAllShowsByMovieAndGeoCoordinates(movieSelected, geoCoordinates);
            return new ArrayList<>();
        }
    }
}