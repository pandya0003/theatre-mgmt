package com.parthpandya.theatremgmt.service;

import java.util.List;
import java.util.Optional;

import com.parthpandya.theatremgmt.model.Screen;
import com.parthpandya.theatremgmt.model.Transaction;
import com.parthpandya.theatremgmt.model.Cinema;
import com.parthpandya.theatremgmt.model.Order;

public interface CustomerService {
    List<Cinema> getAllShowsByMovieAndCity(String movie, String city);
    List<Screen> getAllShowsByMovieAndGeoCoordinates(String movieSelected, String[] geoCoordinates);
	Transaction checkout(Order purchaseOrder);
}
