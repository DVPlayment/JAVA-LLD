package org.example.ElevatorSystem.Entities;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Floor> floors;

    public Building() {
        this.floors = new ArrayList<>();
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }
}
