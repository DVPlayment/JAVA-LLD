package org.example.CarRentalSystem.Vehicle;

import org.example.CarRentalSystem.Enums.VehicleType;

public class Car extends Vehicle{
    public Car(int vehicleNumber, int average, int cc, double hourlyPrice, double minutelyPrice) {
        super(vehicleNumber, VehicleType.CAR, average, cc, hourlyPrice, minutelyPrice);
    }
}
