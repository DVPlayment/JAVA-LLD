package org.example.MovieTicketBookingSystem.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Theatre {
    private UUID id;
    private Location location;
    private List<Screen> screens;

    public Theatre(Location location) {
        this.id = UUID.randomUUID();
        this.location = location;
        this.screens = new ArrayList<Screen>();
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public String getCity() {
        return location.getCity();
    }

    public void addScreen(Screen screen) {
        this.screens.add(screen);
    }

}
