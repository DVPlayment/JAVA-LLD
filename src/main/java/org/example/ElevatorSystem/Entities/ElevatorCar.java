package org.example.ElevatorSystem.Entities;

import org.example.ElevatorSystem.Enums.Direction;
import org.example.ElevatorSystem.Enums.Status;

public class ElevatorCar {
    private final int id;
    public int currentFloor;
    public Direction direction;
    private Display display;
    public Status status;
    private final InternalBtn internalBtn;


    public ElevatorCar(int id, InternalBtn internalBtn, Direction direction, int currentFloor) {
        this.id = id;
        this.internalBtn = internalBtn;
        this.status = Status.STATIC;
        this.display = new Display();
        this.currentFloor = currentFloor;
        this.direction = direction;
    }

    public void move(Destination destination) {
        System.out.print("Moving elevator car: ");
        destination.log();
        this.status = Status.MOVING;
        this.currentFloor = destination.destinationFloor;
        this.direction = destination.direction;
        this.display.setDirection(destination.direction);
        this.display.setFloorNumber(destination.destinationFloor);
    }

    public Display getDisplay(){
        return this.display;
    }

    public InternalBtn getInternalBtn() {
        return this.internalBtn;
    }

    public int getId() {
        return id;
    }

}
