package com.parthpandya.theatremgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.google.gson.Gson;
import com.parthpandya.theatremgmt.model.Cinema;
import com.parthpandya.theatremgmt.model.Order;
import com.parthpandya.theatremgmt.model.Transaction;
import com.parthpandya.theatremgmt.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class ApiController {

    private CustomerService movieService;
    
    @Autowired
    public ApiController(CustomerService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/screens")
    public List<Cinema> listAllShows(String movieSelected, String[] geoCoordinates, Optional<String> currentCity) {
        String city = currentCity.isPresent() ? currentCity.get(): "Lakeland";
        try {
        	return this.movieService.getAllShowsByMovieAndCity(movieSelected, city);
        } catch (Exception ex) {
        	throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Exception occurred", ex);
        }
        
    }
    
    //TODO.order can be separate dto here but using existing pojo
    @PostMapping("/checkout")
    public ResponseEntity<String> checkout(@Valid @RequestBody String order) {
    	Order purchaseOrder = new Gson().fromJson(order, Order.class);
    	try {
    		Transaction result = this.movieService.checkout(purchaseOrder); 
            return new ResponseEntity<>("Booking transaction# "+ String.valueOf(result.getId()), HttpStatus.CREATED);
        } catch (Exception ex) {
        	//TODO.Move to global controller advise
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Exception occurred", ex);
        }
    }
}