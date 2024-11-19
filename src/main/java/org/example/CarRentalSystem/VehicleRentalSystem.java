package org.example.CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    List<Store> stores;
    List<User> users;

    public VehicleRentalSystem() {
        stores = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addStore(Store store) {
        stores.add(store);
    }
    public void addUser(User user) {
        users.add(user);
    }

    public List<Store> getStores() {
        return stores;
    }
    public List<User> getUsers() {
        return users;
    }
    public void removeStore(Store store) {
        stores.remove(store);
    }

    public void removeUser(User user) {
        users.remove(user);
    }



}
