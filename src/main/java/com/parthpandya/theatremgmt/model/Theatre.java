package com.parthpandya.theatremgmt.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "theatre")
@Entity
public class Theatre {
    @Id
    @GeneratedValue
    long id;
    int theaterId;
    String theaterName;
    //Address address;

}