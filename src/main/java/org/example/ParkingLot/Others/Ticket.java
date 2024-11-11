package org.example.ParkingLot.Others;

import org.example.ParkingLot.Parkingspot.ParkingSpot;

import java.util.Date;

public class Ticket {
    public Vehicle vehicle;
    public Date timestamp;

    Ticket(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.timestamp = new Date();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
