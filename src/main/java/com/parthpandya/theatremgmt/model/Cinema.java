package com.parthpandya.theatremgmt.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
import jakarta.persistence.Transient;

@Table(name = "cinema")
@Entity
@NamedQuery(name = "Cinema.findAllByCity", query = "SELECT t FROM Cinema t where t.address.city = ?1")
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
    
    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Screen> screens = new ArrayList<>();

    //TODO.needs to attach movie session based on duration and start time
    @Transient
    private List<Integer> shows = IntStream.iterate((int) 6, i -> i + 3).limit(6).boxed().collect(Collectors.toList());

	public Cinema() {
		
	}

	public Cinema(String cinemaName, float startTime, float closeTime) {
		super();
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

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
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

	public List<Integer> getShows() {
		return shows;
	}

	@Override
	public String toString() {
		return "Cinema [id=" + id + ", cinemaName=" + cinemaName + ", startTime=" + startTime + ", closeTime="
				+ closeTime + ", address=" + address + ", movies=" + movies + ", screens=" + screens + ", shows="
				+ shows + "]";
	}
	
	
}