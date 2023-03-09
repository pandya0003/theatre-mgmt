package com.parthpandya.theatremgmt.model;

import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

public class Screen {
    @Id
    @GeneratedValue
    int id;
    String screenId;
    Timestamp showTime;
    String showName;
    //other props - screen type - 2d, 3d; total seats, seat type etc
}
