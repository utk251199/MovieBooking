package org.example;

import java.time.LocalTime;

public class Movie {

    private String movieName;
    private Language language;
    private Format format;
    private Genre genre;
    private double price;

    // Constructor with important fields
    public Movie(String movieName, Language language, Format format, Genre genre, double price) {
        this.movieName = movieName;
        this.language = language;
        this.format = format;
        this.genre = genre;
        this.price = price;
    }

    // All Getters and Setters
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
