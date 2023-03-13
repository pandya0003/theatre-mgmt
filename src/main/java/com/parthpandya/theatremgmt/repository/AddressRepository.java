package com.parthpandya.theatremgmt.repository;

import org.springframework.data.repository.CrudRepository;

import com.parthpandya.theatremgmt.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
