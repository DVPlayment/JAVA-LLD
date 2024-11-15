package org.example.ElevatorSystem.Dispatchers;

import org.example.ElevatorSystem.Entities.ElevatorController;

import java.util.List;

public class InternalBtnDispatcher {
    private final List<ElevatorController> elevatorControllers;
    public InternalBtnDispatcher(List<ElevatorController> elevatorControllers) {
        this.elevatorControllers = elevatorControllers;
    }

    public void submitElevatorRequest(int floorNumber, int elevatorId) {
        for (ElevatorController elevatorController : elevatorControllers) {
            if (elevatorController.getElevatorId() == elevatorId) {
                System.out.println("Internal button pressed at floor " + elevatorController.getElevatorCar().currentFloor);
                elevatorController.submitRequest(floorNumber);
            }
        }
    }

}
