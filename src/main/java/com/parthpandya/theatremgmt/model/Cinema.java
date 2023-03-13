package com.parthpandya.theatremgmt.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "cinema")
@Entity
public class Cinema {
    @Id
    @GeneratedValue
    @Column(name = "cinema_id")
    long id;
        
    @Column(name = "cinema_name")
    String cinemaName;
    
    @Column(name = "start_time")
    float startTime;
    
    @Column(name = "close_time")
    float closeTime;
    
    @OneToOne(mappedBy = "cinema", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Address address;
    
    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Movie> movies = new ArrayList<>();

    
	public Cinema() {
	}

	public Cinema(String cinemaName, float startTime, float closeTime) {
		this.cinemaName = cinemaName;
		this.startTime = startTime;
		this.closeTime = closeTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getcinemaName() {
		return cinemaName;
	}

	public void setcinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public float getStartTime() {
		return startTime;
	}

	public void setStartTime(float startTime) {
		this.startTime = startTime;
	}

	public float getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(float closeTime) {
		this.closeTime = closeTime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	} 
}