package org.example;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private Location location;
    private MovieManager movieManager;
    private List<Booking> bookings;


    Theatre(Location location, MovieManager movieManager){
        this.location = location;
        this.movieManager = movieManager;
        this.bookings = new ArrayList<>();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public MovieManager getScreenManager() {
        return movieManager;
    }

    public List<Show> getAllShows(){
        return movieManager.getShowList();
    }

    public void createBooking(int bookingId,User user, Show show){
        Booking booking = new Booking();
        booking.createBooking(bookingId,user,this,show);
        bookings.add(booking);
    }
}
