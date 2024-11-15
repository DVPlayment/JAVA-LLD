package org.example.ElevatorSystem.Dispatchers;

import org.example.ElevatorSystem.Entities.ElevatorController;
import org.example.ElevatorSystem.Strategies.LiftCallingStrategy.LiftCallingInterface;

import java.util.List;

public class ExternalBtnDispatcher {
    private List<ElevatorController> elevatorControllers;

    public ExternalBtnDispatcher(List<ElevatorController> elevatorControllers) {
        this.elevatorControllers = elevatorControllers;
    }

    public void submitElevatorRequest(int floorNumber, LiftCallingInterface liftCallingStrategy) {
        ElevatorController ec = liftCallingStrategy.getLiftController(this.elevatorControllers);
        ec.submitRequest(floorNumber);
    }
}
