package com.parthpandya.theatremgmt.service;

import java.util.List;
import java.util.Optional;

import com.parthpandya.theatremgmt.model.Screen;
import com.parthpandya.theatremgmt.model.Cinema;

public interface CustomerService {
    List<Cinema> getAllShowsByMovieAndCity(String movie, String city);
    List<Screen> getAllShowsByMovieAndGeoCoordinates(String movieSelected, String[] geoCoordinates);
}
