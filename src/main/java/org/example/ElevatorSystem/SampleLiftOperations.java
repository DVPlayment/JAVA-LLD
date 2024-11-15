package org.example.ElevatorSystem;

import org.example.ElevatorSystem.Dispatchers.ExternalBtnDispatcher;
import org.example.ElevatorSystem.Dispatchers.InternalBtnDispatcher;
import org.example.ElevatorSystem.Entities.*;
import org.example.ElevatorSystem.Enums.Direction;
import org.example.ElevatorSystem.Strategies.LiftCallingStrategy.GetFirstLift;
import org.example.ElevatorSystem.Strategies.LiftCallingStrategy.LiftCallingInterface;

import java.util.ArrayList;
import java.util.List;

public class SampleLiftOperations {

    public void operate() {
        // init
        int floorNumber = 0;
        ElevatorCar elevatorCar1 = new ElevatorCar(1, new InternalBtn(1), Direction.UP, floorNumber); // default direction is UP, curr floor is 0
        List<ElevatorController> elevatorControllers = new ArrayList<>();
        elevatorControllers.add(new ElevatorController(elevatorCar1));

        InternalBtnDispatcher internalBtnDispatcher = new InternalBtnDispatcher(elevatorControllers);
        ExternalBtnDispatcher externalBtnDispatcher = new ExternalBtnDispatcher(elevatorControllers);
        LiftCallingInterface firstLiftStrategy = new GetFirstLift();

        Building building = new Building();
        for (int i=0;i<3;i++) {
            ExternalBtn externalBtn = new ExternalBtn(externalBtnDispatcher, floorNumber+i);
            building.addFloor(new Floor(floorNumber+i, externalBtn));
        }

        // request

        // external btn request, should go to floor 1 -> floor 2
        List<Floor> floors = building.getFloors();
        Floor third_floor = floors.get(2);
        third_floor.externalBtn.pressButton(firstLiftStrategy);

        Floor second_floor = floors.get(1);
        second_floor.externalBtn.pressButton(firstLiftStrategy);

        // move elevator
        for (ElevatorController ec : elevatorControllers) {
            ec.moveElevator();
        }

        // internal btn request
        ElevatorController elevatorController = elevatorControllers.getFirst();
        InternalBtn internalBtn = elevatorController.getElevatorCar().getInternalBtn();
        internalBtn.pressButton(0, internalBtnDispatcher);

        // move elevator
        for (ElevatorController ec : elevatorControllers) {
            ec.moveElevator();
        }

    }
}
