package org.example;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private Location location;
    private MovieManager movieManager;


    Theatre(Location location, MovieManager movieManager){
        this.location = location;
        this.movieManager = movieManager;
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
}
