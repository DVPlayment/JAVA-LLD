package org.example.ParkingLot.Parkingspot;

import org.example.ParkingLot.Others.Vehicle;

import java.util.UUID;

public class ParkingSpotFourWheeler implements ParkingSpot {
    private Vehicle vehicle;
    private Boolean isEmpty;
    private int price;
    private final UUID id;

    public ParkingSpotFourWheeler(int price, UUID id) {
        this.isEmpty = true;
        this.price = price;
        this.id = id;
    }


    @Override
    public Vehicle getVehicle() {
        return this.vehicle;
    }

    @Override
    public Boolean isEmpty() {
        return this.isEmpty;
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        this.isEmpty = false;
        this.vehicle = vehicle;
    }

    @Override
    public void removeVehicle() {
        this.isEmpty = true;
        this.vehicle = null;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public UUID getId() {
        return this.id;
    }
}
