package org.example.CarRentalSystem.Vehicle;

import org.example.CarRentalSystem.Enums.VehicleType;

public class Vehicle {
    private int vehicleNumber;
    private VehicleType vehicleType;
    private int average;
    private int cc;
    private double hourlyPrice;
    private double minutelyPrice;

    public Vehicle(int vehicleNumber, VehicleType vehicleType, int average, int cc, double hourlyPrice, double minutelyPrice) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.average = average;
        this.cc = cc;
        this.hourlyPrice = hourlyPrice;
        this.minutelyPrice = minutelyPrice;
    }
    public int getVehicleNumber() {
        return vehicleNumber;
    }
    public String getVehicleType() {
        return vehicleType.getType();
    }
    public int getAverage() {
        return average;
    }
    public int getCc() {
        return cc;
    }
    public double getHourlyPrice() {
        return hourlyPrice;
    }
    public double getMinutelyPrice() {
        return minutelyPrice;
    }


}
