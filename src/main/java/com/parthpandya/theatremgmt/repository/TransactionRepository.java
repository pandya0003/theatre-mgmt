package com.parthpandya.theatremgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parthpandya.theatremgmt.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}