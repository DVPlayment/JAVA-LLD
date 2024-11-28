package org.example.MovieTicketBookingSystem.Entities;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private Location location;

    public User(String name, Location location) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.location = location;
    }

    public String getCity() {
        return location.getCity();
    }
}
