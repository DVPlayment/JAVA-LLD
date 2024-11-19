package org.example.CarRentalSystem;

import org.example.CarRentalSystem.Enums.Status;
import org.example.CarRentalSystem.Vehicle.Vehicle;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Vehicle vehicle;
    private Date bookingStartTime;
    private Date bookingEndTime;
    private Status status;

    public Reservation(Vehicle vehicle, Date bookingStartTime, Date bookingEndTime) {
        this.vehicle = vehicle;
        this.bookingStartTime = bookingStartTime;
        this.bookingEndTime = bookingEndTime;
        this.status = Status.RESERVED;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public long getBookingDurationInMin(){
        long durationInMillis = bookingEndTime.getTime() - bookingStartTime.getTime();
        return TimeUnit.MILLISECONDS.toMinutes(durationInMillis);
    }

    public long getBookingDurationInHr(){
        long durationInMillis = bookingEndTime.getTime() - bookingStartTime.getTime();
        return TimeUnit.MILLISECONDS.toHours(durationInMillis);
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }
}
