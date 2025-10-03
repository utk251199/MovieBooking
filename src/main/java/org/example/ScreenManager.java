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

    public void addScreen(Screen screen){
        screenList.add(screen);
    }

    public void removeScreen(Screen screen){
        screenList.remove(screen);
    }
}
