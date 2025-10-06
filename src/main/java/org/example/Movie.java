package org.example;

public class Movie {

    private String movieName;
    private Language language;
    private Format format;
    private Genre genre;

    public Movie(String movieName, Language language, Format format, Genre genre) {
        this.movieName = movieName;
        this.language = language;
        this.format = format;
        this.genre = genre;
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
}

enum Format {
    FORMAT_2D,
    FORMAT_2D_IMAX,
    FORMAT_3D,
    FORMAT_3D_IMAX,
    FORMAT_4DX
}

enum Genre {

    ACTION,
    COMEDY,
    FICTION,
    ANIMATION,
    THRILLER
}

enum Language {

    ENGLISH,
    HINDI
}

