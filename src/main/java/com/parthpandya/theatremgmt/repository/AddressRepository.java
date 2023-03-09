package com.parthpandya.theatremgmt.repository;

import com.parthpandya.theatremgmt.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
}