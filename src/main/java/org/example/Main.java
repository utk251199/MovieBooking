package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1,"ChillGuy");

        Movie movie = new Movie("LOL",Language.ENGLISH,Format.FORMAT_2D,Genre.ACTION,200.0);
        List<Movie> movies = new ArrayList<>();
        movies.add(movie);

        Screen screen = new Screen(1,100);
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
        closestTheatre.createBooking(1,user1,show);
    }
}