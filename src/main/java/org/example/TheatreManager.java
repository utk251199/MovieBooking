package org.example;

import java.util.List;

public class TheatreManager {

    List<Theatre> theatres;

    TheatreManager(List<Theatre> theatres){
        this.theatres = theatres;
    }

    public Theatre filterByPinCode(int pinCode){
        for(Theatre theatre: theatres){
            if(theatre.getLocation().getPinCode() == pinCode)
                return theatre;
        }
        return null;
    }

}
