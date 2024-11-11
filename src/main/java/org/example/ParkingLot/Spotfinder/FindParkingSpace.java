package org.example.ParkingLot.Spotfinder;

import org.example.ParkingLot.Parkingspot.ParkingSpot;
import org.example.ParkingLot.Parkingspotmanager.ParkingSpotManager;

import java.util.List;

public interface FindParkingSpace {
    ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots);
}
