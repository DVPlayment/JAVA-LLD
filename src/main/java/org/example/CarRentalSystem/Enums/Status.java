package org.example.CarRentalSystem.Enums;

public enum Status {
    RESERVED("reserved"), // completed the reservation
    COMPLETED("completed"), // completed the reservation & payment
    CANCELLED("cancelled"); // cancelled the reservation

    private String status;
    Status(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

}
