package org.example.ElevatorSystem.Enums;

public enum Status {
    MOVING("moving"),
    STATIC("static");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
