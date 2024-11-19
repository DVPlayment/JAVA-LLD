package org.example.CarRentalSystem;

import org.example.CarRentalSystem.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    List<Vehicle> vehicles;
    public InventoryManager(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    public InventoryManager() {
        this.vehicles = new ArrayList<>();
    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public void addVehicles(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }
     // more depends on usecase
}
