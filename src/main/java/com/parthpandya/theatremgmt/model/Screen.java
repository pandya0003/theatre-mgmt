package com.parthpandya.theatremgmt.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name = "screen")
@Entity
public class Screen {
	
    @Id
    @GeneratedValue
    long id;
    
    String screenId;
    Timestamp showTime;
    String showName;
    //other props - screen type - 2d, 3d; total seats, seat type etc
}
