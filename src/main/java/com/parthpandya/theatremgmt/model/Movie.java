package com.parthpandya.theatremgmt.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue
    @Column(name = "movie_id")
    private long id;
    
    //TODO.Change to lazy. Performance killer
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cinema_id")
    @JsonIgnore
    Cinema cinema;
    
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Screen> screens = new ArrayList<>();

    @Column(name = "movie_name")
    String movieName;

    @Column(name = "movie_type")
    String movieType;

    @Column(name = "show_release_date")
    String showReleaseDate;

    @Column(name = "show_end_date")
    String showEndDate;

    @Column(name = "total_duration")
    int totalDuration;
    
    @Column(name = "price")
    int price;
    
    public Movie(){}
	
    public Movie(String movieName, String movieType, String showReleaseDate, String showEndDate,
			int totalDuration, int price) {
		this.movieName = movieName;
		this.movieType = movieType;
		this.showReleaseDate = showReleaseDate;
		this.showEndDate = showEndDate;
		this.totalDuration = totalDuration;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getShowReleaseDate() {
		return showReleaseDate;
	}

	public void setShowReleaseDate(String showReleaseDate) {
		this.showReleaseDate = showReleaseDate;
	}

	public String getShowEndDate() {
		return showEndDate;
	}

	public void setShowEndDate(String showEndDate) {
		this.showEndDate = showEndDate;
	}

	public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
