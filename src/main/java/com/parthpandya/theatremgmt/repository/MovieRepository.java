package com.parthpandya.theatremgmt.repository;

import com.parthpandya.theatremgmt.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
    Movie findByMovieName(String movie);
}