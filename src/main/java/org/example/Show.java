package org.example;

import java.time.LocalTime;

public class Show {
    private Movie movie;
    private Screen screen;
    private LocalTime showTime;

    public Show(Movie movie, Screen screen, LocalTime showTime) {
        this.movie = movie;
        this.screen = screen;
        this.showTime = showTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public LocalTime getShowTime() {
        return showTime;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setShowTime(LocalTime showTime) {
        this.showTime = showTime;
    }
}
