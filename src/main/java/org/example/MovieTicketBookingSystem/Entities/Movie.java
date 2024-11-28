package org.example.MovieTicketBookingSystem.Entities;

public class Movie {
    private int id;
    private String title;
    private int durationInMins;
    public Movie(int id, String title, int durationInMins) {
         this.id = id;
         this.title = title;
         this.durationInMins = durationInMins;
    }

    public int getDurationInMins() {
        return durationInMins;
    }

    public String getTitle() {
        return title;
    }
}
