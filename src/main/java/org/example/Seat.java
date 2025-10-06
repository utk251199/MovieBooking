package org.example;

public class Seat {

    private int seatId;
    private String row;
    private SeatCategory seatCategory;

    Seat(int seatId, String row, SeatCategory seatCategory){
        this.seatId = seatId;
        this.row = row;
        this.seatCategory = seatCategory;
    }

    public int getSeatId() {
        return seatId;
    }
    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }
    public String getRow() {
        return row;
    }
    public void setRow(String row) {
        this.row = row;
    }
    public SeatCategory getSeatCategory() {
        return seatCategory;
    }
    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
}
