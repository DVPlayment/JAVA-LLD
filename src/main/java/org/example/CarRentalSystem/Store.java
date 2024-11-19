package org.example.CarRentalSystem;

import org.example.CarRentalSystem.Enums.VehicleType;
import org.example.CarRentalSystem.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Store {
    private InventoryManager inventoryManager;
    private Location location;
    private UUID id;
    public Store(InventoryManager inventoryManager, Location location) {
        this.inventoryManager = inventoryManager;
        this.location = location;
        this.id = UUID.randomUUID();
    }
    public void addVehicles(Vehicle vehicle) {
        inventoryManager.addVehicles(vehicle);
    }
    public void removeVehicles(Vehicle vehicle) {
        inventoryManager.removeVehicle(vehicle);
    }
    public Location getLocation() {
        return location;
    }
    public UUID getId() {
        return id;
    }
    public List<Vehicle> getVehicleByType(String type) {
        List<Vehicle> vehicles = new ArrayList<>();
        for (Vehicle vehicle : inventoryManager.getVehicles()) {
            if (vehicle.getVehicleType().equals(type)) {
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }

    public Reservation createReservation(Vehicle vehicle, Date bookingStartTime, Date bookingEndTime) {
        return new Reservation(vehicle, bookingStartTime, bookingEndTime);
    }

}
