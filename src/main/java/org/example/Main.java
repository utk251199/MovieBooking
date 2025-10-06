package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1,"ChillGuy");

        Movie movie = new Movie("LOL",Language.ENGLISH,Format.FORMAT_2D,Genre.ACTION);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie);

        List<Seat> seats = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat(i,"A",SeatCategory.CLASSIC);
            seats.add(seat);
        }
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat(i,"B",SeatCategory.GOLD);
            seats.add(seat);
        }
        for (int i = 70; i < 80; i++) {
            Seat seat = new Seat(i,"C",SeatCategory.RECLINER);
            seats.add(seat);
        }

        Screen screen = new Screen(1);
        screen.setSeats(seats);
        List<Screen> screenList = new ArrayList<>();
        screenList.add(screen);

        Show show = new Show(movie,screen, LocalTime.of(10,30));
        List<Show> showList = new ArrayList<>();
        showList.add(show);

        MovieManager movieManager = new MovieManager(showList);

        Location location = new Location("Somewhere",32316,"Hyd");
        Theatre theatre = new Theatre(location, movieManager);
        List<Theatre> theatres = new ArrayList<>();
        theatres.add(theatre);
        TheatreManager tm = new TheatreManager(theatres);

        Theatre closestTheatre = tm.filterByPinCode(32316);
        closestTheatre.getAllShows();

        Seat selectedSeat = new Seat(26,"A",SeatCategory.CLASSIC);
        List<Seat> selectedSeats = new ArrayList<>();
        selectedSeats.add(selectedSeat);
        BookingService bookingService = new BookingService();
        bookingService.createBooking(1,user1,closestTheatre,show,selectedSeats);
    }
}