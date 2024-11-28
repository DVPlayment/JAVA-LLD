package org.example.MovieTicketBookingSystem.Entities;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;

public class Screen {
    private UUID id;
    private List<Show> shows;

    public Screen() {
        this.id = UUID.randomUUID();
        this.shows = new ArrayList<>();
    }

    public void addShow(Show show) {
        this.shows.add(show);
    }

    public List<Show> getShows() {
        return shows;
    }
}
