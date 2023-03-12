package com.parthpandya.theatremgmt.repository;

import com.parthpandya.theatremgmt.model.Screen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ScreenRepository extends CrudRepository<Screen, Long> {
}