package org.example.ElevatorSystem.Entities;

import org.example.ElevatorSystem.Enums.Status;

public class ElevatorController {
    private ElevatorCar elevatorCar;
    public ElevatorControllerDataStructure ecds;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        this.ecds = new ElevatorControllerDataStructure();
    }

    public void submitRequest(int reqFloor){
        ecds.addRequest(reqFloor, elevatorCar.currentFloor, elevatorCar.direction);
    }

    public void moveElevator(){
        while (true) {
            Destination destination = ecds.getNextDestination(elevatorCar.direction);
            if (destination == null) {
                elevatorCar.status = Status.STATIC;
                break;
            }
            elevatorCar.move(destination);
        }
    }

    public int getElevatorId() {
        return elevatorCar.getId();
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }
}
