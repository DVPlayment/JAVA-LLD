package org.example.ParkingLot.Parkingspotmanager;

import org.example.ParkingLot.Parkingspot.ParkingSpotTwoWheeler;
import org.example.ParkingLot.Spotfinder.FindParkingSpace;
import org.example.ParkingLot.Others.Vehicle;


public class ParkingSpotTwoWheelerManager extends ParkingSpotManager {

    private final FindParkingSpace findParkingSpace;

    public ParkingSpotTwoWheelerManager(FindParkingSpace findParkingSpace) {
        this.findParkingSpace = findParkingSpace;
    }

    public void addParkingSpot(ParkingSpotTwoWheeler parkingSpot) {
        super.addParkingSpot(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpotTwoWheeler parkingSpot){
        super.removeParkingSpot(parkingSpot);
    }

    public void addVehicle(Vehicle vehicle) {
        super.addVehicle(findParkingSpace, vehicle);
    }
}
