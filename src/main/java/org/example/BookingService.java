package org.example;

import java.util.ArrayList;
import java.util.List;

public class BookingService {

    private List<Booking> bookings;

    BookingService(){
        bookings = new ArrayList<>();
    }


    public void createBooking(int bookingId,User user, Theatre theatre, Show show){
        Booking booking = new Booking();
        booking.createBooking(bookingId,user,theatre,show);
        bookings.add(booking);
    }
}
