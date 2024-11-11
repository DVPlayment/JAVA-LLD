package org.example.ParkingLot.Parkingspotmanager;

import org.example.ParkingLot.Parkingspot.ParkingSpotFourWheeler;
import org.example.ParkingLot.Spotfinder.FindParkingSpace;
import org.example.ParkingLot.Others.Vehicle;


public class ParkingSpotFourWheelerManager extends ParkingSpotManager {

    private final FindParkingSpace findParkingSpace;

    public ParkingSpotFourWheelerManager(FindParkingSpace findParkingSpace) {
        this.findParkingSpace = findParkingSpace;
    }

    public void addParkingSpot(ParkingSpotFourWheeler parkingSpot) {
        super.addParkingSpot(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpotFourWheeler parkingSpot){
        super.removeParkingSpot(parkingSpot);
    }

    public void addVehicle(Vehicle vehicle) {
        super.addVehicle(findParkingSpace, vehicle);
    }
}
