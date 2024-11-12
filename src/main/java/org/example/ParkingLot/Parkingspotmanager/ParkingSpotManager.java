package org.example.ParkingLot.Parkingspotmanager;

import org.example.ParkingLot.Parkingspot.ParkingSpot;
import org.example.ParkingLot.Spotfinder.FindParkingSpace;
import org.example.ParkingLot.Others.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {

    public List<ParkingSpot> parkingSpots;

    public ParkingSpotManager(){
        this.parkingSpots = new ArrayList<>();
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.removeIf(ps -> ps.getId().equals(parkingSpot.getId()));
    }

    public void addVehicle(FindParkingSpace findParkingSpace, Vehicle vehicle) {
        ParkingSpot parkingSpot = findParkingSpace.findParkingSpot(parkingSpots);
        if (parkingSpot == null) {
            throw new RuntimeException("Parking spot not available!");
        }
        parkingSpot.parkVehicle(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        for (int i=0;i<parkingSpots.size();i++) {
            ParkingSpot ps = parkingSpots.get(i);
            if (ps.getVehicle().getNumber().equals(vehicle.getNumber())) {
                ps.removeVehicle();
                break;
            }
        }
    }

}
