package com.parthpandya.theatremgmt.repository;

import com.parthpandya.theatremgmt.model.Movie;
import com.parthpandya.theatremgmt.model.Screen;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ScreenRepository extends CrudRepository<Screen, Long> {
}