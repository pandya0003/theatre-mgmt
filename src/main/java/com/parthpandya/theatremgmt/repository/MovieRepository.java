package com.parthpandya.theatremgmt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.parthpandya.theatremgmt.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
    List<Movie> findByMovieName(String movie);
}