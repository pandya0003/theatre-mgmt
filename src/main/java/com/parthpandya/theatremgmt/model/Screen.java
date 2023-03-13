package com.parthpandya.theatremgmt.model;

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
    
    String cinemaId;
    String showTime;
    String movieId;
    //other props - screen type - 2d, 3d; total seats, seat type etc
    public Screen(String cinemaId, String showTime, String movieId) {
		super();
		this.cinemaId = cinemaId;
		this.showTime = showTime;
		this.movieId = movieId;
	}
    
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getcinemaId() {
		return cinemaId;
	}

	public void setcinemaId(String cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
}
