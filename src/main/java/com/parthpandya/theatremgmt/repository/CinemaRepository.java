package com.parthpandya.theatremgmt.repository;

import org.springframework.data.repository.CrudRepository;

import com.parthpandya.theatremgmt.model.Cinema;

public interface CinemaRepository extends CrudRepository<Cinema, Long> {
	//List<Cinema> findAllByCity(String city);
}