package org.example;

import java.util.List;

public class ScreenManager {

    private List<Screen> screenList;

    ScreenManager(List<Screen> screenList){
        this.screenList = screenList;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }
}
