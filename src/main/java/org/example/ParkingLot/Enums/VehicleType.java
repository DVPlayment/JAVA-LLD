package org.example.ParkingLot.Enums;

public enum VehicleType {
    TWO_WHEELER("two_wheeler"),
    FOUR_WHEELER("four_wheeler");

    private final String type;

    VehicleType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
