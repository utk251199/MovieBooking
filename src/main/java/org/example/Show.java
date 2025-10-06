package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Show {
    private Movie movie;
    private Screen screen;
    private LocalTime showTime;
    private List<Seat> bookedSeats;

    public Show(Movie movie, Screen screen, LocalTime showTime) {
        this.movie = movie;
        this.screen = screen;
        this.showTime = showTime;
        bookedSeats = new ArrayList<>();
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

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public List<Integer> getBookedSeatIds() {
        return bookedSeats.stream().map(Seat::getSeatId).toList();
    }
}
