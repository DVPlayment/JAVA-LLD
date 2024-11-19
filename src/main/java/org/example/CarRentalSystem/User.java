package org.example.CarRentalSystem;

public class User {
    private int id;
    private String name;
    private Location location;

    public User(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Location getLocation() {
        return location;
    }

}
