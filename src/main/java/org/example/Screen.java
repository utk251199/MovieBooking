package org.example;

public class Screen {

    private int screenId;
    private int totalSeats;

    Screen(int screenId, int totalSeats){
        this.screenId = screenId;
        this.totalSeats = totalSeats;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

}
