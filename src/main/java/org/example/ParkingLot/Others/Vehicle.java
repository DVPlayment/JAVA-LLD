package org.example.ParkingLot.Others;

import org.example.ParkingLot.Enums.VehicleType;

public class Vehicle {
    private final String number;
    private final VehicleType vehicleType;

    Vehicle(String number, VehicleType vehicleType) {
        this.number = number;
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
