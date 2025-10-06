package org.example;

import java.util.List;

public class Booking {

    private int bookingId;
    private User user;
    private Theatre theatre;
    private Show show;
    private List<Seat> selectedSeats;

    public void createBooking(int bookingId,User user,Theatre theatre, Show show, List<Seat> selectedSeats){
        this.bookingId = bookingId;
        this.user = user;
        this.theatre = theatre;
        this.show = show;
        this.selectedSeats = selectedSeats;
    }
}
