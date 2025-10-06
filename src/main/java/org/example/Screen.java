package org.example;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private int screenId;
    private List<Seat> seats;

    Screen(int screenId){
        this.screenId = screenId;
        seats = new ArrayList<>();
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }


}
