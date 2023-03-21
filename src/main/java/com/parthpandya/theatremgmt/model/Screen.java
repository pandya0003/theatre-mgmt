package com.parthpandya.theatremgmt.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Table(name = "screen")
@Entity
public class Screen {
	
    @Id
    @GeneratedValue
    @Column(name = "screen_id")
    @JsonProperty("id")
    long id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cinema_id")
    Cinema cinema;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id")
    Movie movie;
    
    @Column(name = "show_time")
    String showTime;
    //other props - screen type - 2d, 3d; total seats, seat type etc
    public Screen() {}
    
	public Screen(long id) {
		super();
		this.id = id;
	}

	public Screen(long id, Cinema cinema, Movie movie, String showTime) {
		super();
		this.id = id;
		this.cinema = cinema;
		this.movie = movie;
		this.showTime = showTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	
}
