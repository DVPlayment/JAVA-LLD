package org.example.ElevatorSystem.Entities;

import org.example.ElevatorSystem.Dispatchers.InternalBtnDispatcher;

public class InternalBtn {
    private final int elevatorId;

    public InternalBtn(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public void pressButton(int destinationFloor, InternalBtnDispatcher internalBtnDispatcher) {
        System.out.println("Internal button pressed!");
        internalBtnDispatcher.submitElevatorRequest(destinationFloor, elevatorId);
    }


}
