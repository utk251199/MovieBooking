package org.example;

public class Booking {

    private int bookingId;
    private User user;
    private Theatre theatre;
    private Show show;

    public void createBooking(int bookingId,User user,Theatre theatre, Show show){
        this.bookingId = bookingId;
        this.user = user;
        this.theatre = theatre;
        this.show = show;
    }
}
