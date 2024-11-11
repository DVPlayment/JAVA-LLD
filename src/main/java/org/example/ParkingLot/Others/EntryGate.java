package org.example.ParkingLot.Others;

import org.example.ParkingLot.Enums.VehicleType;
import org.example.ParkingLot.Parkingspotmanager.ParkingSpotFourWheelerManager;
import org.example.ParkingLot.Parkingspotmanager.ParkingSpotTwoWheelerManager;

public class EntryGate {
    // ticket gen
    private final ParkingSpotTwoWheelerManager ps2m;
    private final ParkingSpotFourWheelerManager ps4m;

    public EntryGate(ParkingSpotTwoWheelerManager ps2m, ParkingSpotFourWheelerManager ps4m) {
        this.ps2m = ps2m;
        this.ps4m = ps4m;
    }

    public Ticket generateTicket(Vehicle vehicle) {
        if (vehicle.getVehicleType()==VehicleType.TWO_WHEELER) {
            ps2m.addVehicle(vehicle);
        } else if (vehicle.getVehicleType() == VehicleType.FOUR_WHEELER) {
            ps4m.addVehicle(vehicle);
        } else {
            throw new RuntimeException("Unsupported vehicle type");
        }
        return new Ticket(vehicle);
    }
}
