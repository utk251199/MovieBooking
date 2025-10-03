package org.example;

import java.util.List;

public class MovieManager {

    private List<Show> showList;

    MovieManager(List<Show> showList){
        this.showList = showList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
