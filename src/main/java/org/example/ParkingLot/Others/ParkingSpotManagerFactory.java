package org.example.ParkingLot.Others;

import org.example.ParkingLot.Enums.VehicleType;
import org.example.ParkingLot.Parkingspotmanager.ParkingSpotFourWheelerManager;
import org.example.ParkingLot.Parkingspotmanager.ParkingSpotManager;
import org.example.ParkingLot.Parkingspotmanager.ParkingSpotTwoWheelerManager;
import org.example.ParkingLot.Spotfinder.FindRandomAvailableParkingSpot;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkingSpotManagerByVType(VehicleType type){
        return switch (type) {
            case TWO_WHEELER -> new ParkingSpotTwoWheelerManager(new FindRandomAvailableParkingSpot());
            case FOUR_WHEELER -> new ParkingSpotFourWheelerManager(new FindRandomAvailableParkingSpot());
            default -> throw new IllegalArgumentException("Unsupported vehicle type: " + type.getType());
        };
    }
}
