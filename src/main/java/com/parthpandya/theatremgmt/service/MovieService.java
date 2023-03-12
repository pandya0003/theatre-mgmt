package com.parthpandya.theatremgmt.service;

import java.util.List;
import java.util.Optional;

import com.parthpandya.theatremgmt.model.Screen;

public interface MovieService {
    List<Screen> getAllShowsByMovieAndCity(String movie, Optional<String> city);
    List<Screen> getAllShowsByMovieAndGeoCoordinates(String movieSelected, String[] geoCoordinates);
}
