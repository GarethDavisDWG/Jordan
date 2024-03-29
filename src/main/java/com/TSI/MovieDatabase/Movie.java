package com.TSI.MovieDatabase;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "film", schema = "sakila")
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int film_id;

    private String title;
    private int releaseYr;
    private int length;
    private String genre;
    private ArrayList<Object> cast;

    public Movie(String title, int releaseYr, int length, String genre) {
        this.title = title;
        this.releaseYr = releaseYr;
        this.length = length;
        this.genre = genre;
    }
    public Movie(){

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYr() {
        return releaseYr;
    }

    public void setReleaseYr(int releaseYr) {
        this.releaseYr = releaseYr;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFilm_id(){return film_id;}

    public void setFilm_id(){this.film_id = film_id; }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Object> getCast() {
        return cast;
    }

    public void setCast(ArrayList<Object> cast) {
        this.cast = cast;
    }

}

