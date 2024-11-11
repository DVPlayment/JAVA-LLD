package org.example.ParkingLot.Others;

import org.example.ParkingLot.Enums.VehicleType;
import org.example.ParkingLot.Financemodule.PriceStrategy;
import org.example.ParkingLot.Parkingspotmanager.ParkingSpotFourWheelerManager;
import org.example.ParkingLot.Parkingspotmanager.ParkingSpotTwoWheelerManager;

import java.util.Date;

public class ExitGate {
    private final ParkingSpotTwoWheelerManager ps2m;
    private final ParkingSpotFourWheelerManager ps4m;

    public ExitGate(ParkingSpotTwoWheelerManager ps2m, ParkingSpotFourWheelerManager ps4m) {
        this.ps2m = ps2m;
        this.ps4m = ps4m;
    }

    public double getCost(Ticket tkt, PriceStrategy priceStrategy) {
        Date currentTime = new Date();
        Date tktTime = tkt.getTimestamp();
        long timeTakenInMillis = currentTime.getTime() - tktTime.getTime();
        return priceStrategy.getCost(timeTakenInMillis);
    }

    public void removeVehicleFromParkingSpace(Vehicle vehicle) {
        if (vehicle.getVehicleType()== VehicleType.TWO_WHEELER) {
            ps2m.removeVehicle(vehicle);
        } else if (vehicle.getVehicleType() == VehicleType.FOUR_WHEELER) {
            ps4m.removeVehicle(vehicle);
        } else {
            throw new RuntimeException("Unsupported vehicle type");
        }
    }

    public boolean Payment() {
        return true;
    }

}
