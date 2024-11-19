package org.example.CarRentalSystem;

import org.example.CarRentalSystem.Vehicle.Vehicle;

import java.util.UUID;

public class Bill {
    private final UUID id;
    private final Reservation reservation;
    public Bill(Reservation reservation) {
        this.id = UUID.randomUUID();
        this.reservation = reservation;
    }

    public double CalculateHourlyCost() {
        Vehicle vehicle = reservation.getVehicle();
        return reservation.getBookingDurationInHr() * vehicle.getHourlyPrice();
    }

    public double CalculateMinutelyCost() {
        Vehicle vehicle = reservation.getVehicle();
        return reservation.getBookingDurationInMin() * vehicle.getMinutelyPrice();
    }
}
