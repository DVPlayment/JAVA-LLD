package org.example.CarRentalSystem.Vehicle;

import org.example.CarRentalSystem.Enums.VehicleType;

public class Bike extends Vehicle {
    public Bike(int vehicleNumber, int average, int cc, double hourlyPrice, double minutelyPrice) {
        super(vehicleNumber, VehicleType.BIKE, average, cc, hourlyPrice, minutelyPrice);
    }
}
