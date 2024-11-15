package org.example.ElevatorSystem.Entities;

import org.example.ElevatorSystem.Enums.Direction;

public class Destination {
    public int destinationFloor;
    public Direction direction;

    public Destination(int destinationFloor, Direction direction) {
        this.destinationFloor = destinationFloor;
        this.direction = direction;
    }

    public void log() {
        System.out.println("Destination: " + destinationFloor + ", moving in direction " + direction.getDirection());
    }
}
