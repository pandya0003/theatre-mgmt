package com.parthpandya.theatremgmt.model;

import com.parthpandya.theatremgmt.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;
import java.util.List;

@Table(name = "movie")
@Entity
public class Movie {

    @Autowired
    MovieService movieService;
    public List<Screen> airedScreens(String movieName) {
        return this.movieService.getAllScreenSessions(movieName);
    }

    public enum MovieStatus {
        Movie_Available,
        Movie_NotAvailable;
    }

    public enum MovieType {
        ENGLISH,
        HINDI;
    }

    @Id
    @GeneratedValue
    int id;
    String theaterId;
    String movieName;
    MovieType movieType;
    MovieStatus movieStatus;
    Date showReleaseDate;
    Date showEndDate;
    int totalDuration;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public MovieStatus getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
    }

    public Date getShowReleaseDate() {
        return showReleaseDate;
    }

    public void setShowReleaseDate(Date showReleaseDate) {
        this.showReleaseDate = showReleaseDate;
    }

    public Date getShowEndDate() {
        return showEndDate;
    }

    public void setShowEndDate(Date showEndDate) {
        this.showEndDate = showEndDate;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }
}
