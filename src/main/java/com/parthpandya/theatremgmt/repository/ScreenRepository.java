package com.parthpandya.theatremgmt.repository;

import org.springframework.data.repository.CrudRepository;

import com.parthpandya.theatremgmt.model.Screen;

public interface ScreenRepository extends CrudRepository<Screen, Long> { 
}