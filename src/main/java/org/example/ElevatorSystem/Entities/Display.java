package org.example.ElevatorSystem.Entities;

import org.example.ElevatorSystem.Enums.Direction;

public class Display {
    public Direction direction;
    public int floorNumber;

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

}
