package org.example.ParkingLot.Parkingspot;

import org.example.ParkingLot.Others.Vehicle;

import java.util.UUID;

public interface ParkingSpot {
    Vehicle getVehicle();
    Boolean isEmpty();
    void parkVehicle(Vehicle vehicle);
    void removeVehicle();
    int getPrice();
    UUID getId();
}
