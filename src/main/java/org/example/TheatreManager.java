package org.example;

import java.util.List;

public class TheatreManager {

    List<Theatre> theatres;

    TheatreManager(List<Theatre> theatres){
        this.theatres = theatres;
    }

    public void addTheatre(Theatre theatre){
        theatres.add(theatre);
    }

    public void removeTheatre(Theatre theatre){
        theatres.remove(theatre);
    }

    public Theatre filterByPinCode(int pinCode){
        for(Theatre theatre: theatres){
            if(theatre.getLocation().getPinCode() == pinCode)
                return theatre;
        }
        return null;
    }

}
