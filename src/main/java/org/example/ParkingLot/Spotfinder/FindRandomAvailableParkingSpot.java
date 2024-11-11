package org.example.ParkingLot.Spotfinder;

import org.example.ParkingLot.Parkingspot.ParkingSpot;

import java.util.List;

public class FindRandomAvailableParkingSpot implements FindParkingSpace{
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots) {
        for (ParkingSpot ps: parkingSpots) {
            if (ps.isEmpty()) {
                return ps;
            }
        }
        return null;
    }
}
