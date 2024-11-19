package org.example.CarRentalSystem;

import org.example.CarRentalSystem.Vehicle.Bike;
import org.example.CarRentalSystem.Vehicle.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();
        InventoryManager im = new InventoryManager();
        im.addVehicles(new Car(101, 15, 1500, 500.0, 10.0));
        im.addVehicles(new Car(102, 20, 1200, 400.0, 8.0));
        im.addVehicles(new Bike(102, 70, 700, 100.0, 2.0));
        Location location = new Location("Block-4, Riverfront", "NYC", "Bihar", "99999");

        vehicleRentalSystem.addStore(new Store(im, location));
        vehicleRentalSystem.addUser(new User(1, "DV", location));

        // get cars options for user
        List<Store> storeList = vehicleRentalSystem.getStores();
        for (Store store : storeList) {
            if (store.getLocation().equals(location)) {
                System.out.println("Cars:");
                System.out.println(store.getVehicleByType("car"));
            }
        }

    }
}
