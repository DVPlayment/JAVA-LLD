package org.example.ElevatorSystem.Entities;

import org.example.ElevatorSystem.Dispatchers.ExternalBtnDispatcher;
import org.example.ElevatorSystem.Strategies.LiftCallingStrategy.LiftCallingInterface;

public class ExternalBtn {
    private final ExternalBtnDispatcher externalBtnDispatcher;
    private final int floorNumber;

    public ExternalBtn(ExternalBtnDispatcher externalBtnDispatcher, int floorNumber) {
        this.externalBtnDispatcher = externalBtnDispatcher;
        this.floorNumber = floorNumber;
    }

    public void pressButton(LiftCallingInterface liftCallingStrategy){
        System.out.println("External button pressed at floor " + floorNumber);
        externalBtnDispatcher.submitElevatorRequest(this.floorNumber, liftCallingStrategy);
    }
}