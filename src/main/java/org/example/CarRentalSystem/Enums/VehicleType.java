package org.example.CarRentalSystem.Enums;

public enum VehicleType {
    CAR("car"),
    BIKE("bike");

    private String type;

    VehicleType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
