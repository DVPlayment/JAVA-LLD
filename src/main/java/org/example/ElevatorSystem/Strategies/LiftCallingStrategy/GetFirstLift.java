package org.example.ElevatorSystem.Strategies.LiftCallingStrategy;

import org.example.ElevatorSystem.Entities.ElevatorController;

import java.util.List;

public class GetFirstLift implements LiftCallingInterface{

    @Override
    public ElevatorController getLiftController(List<ElevatorController> elevatorController) {
        return elevatorController.getFirst();
    }
}
