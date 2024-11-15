package org.example.ElevatorSystem.Strategies.LiftCallingStrategy;

import org.example.ElevatorSystem.Entities.ElevatorController;

import java.util.List;

public interface LiftCallingInterface {
    ElevatorController getLiftController(List<ElevatorController> elevatorController);

}
