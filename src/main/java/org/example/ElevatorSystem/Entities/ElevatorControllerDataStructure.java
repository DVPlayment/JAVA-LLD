package org.example.ElevatorSystem.Entities;

import org.example.ElevatorSystem.Enums.Direction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ElevatorControllerDataStructure {
    private List<Integer> pendingRequests;
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public ElevatorControllerDataStructure() {
        this.pendingRequests = new ArrayList<>();
        this.minHeap = new PriorityQueue<>();
        this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    // LOOK algo : based on direction, we'll pop from heaps and store in pendingReqs
    public void addRequest(int request, int currentFloor, Direction direction) {
        if (direction == Direction.UP) {
            if ( request >= currentFloor ) {
                minHeap.add(request);
            } else {
                pendingRequests.add(request);
            }
        } else {
            if ( request <= currentFloor ) {
                maxHeap.add(request);
            } else {
                pendingRequests.add(request);
            }
        }
    }

    public Destination getNextDestination(Direction direction) {
        if (minHeap.isEmpty() && maxHeap.isEmpty() && pendingRequests.isEmpty()) {
            System.out.println("No more Elevator requests available");
            return null;
        }
        if (direction == Direction.UP) {
            if (minHeap.isEmpty()) {
                // reverse direction
                maxHeap.addAll(pendingRequests);
                pendingRequests.clear();
                return new Destination(maxHeap.poll(), Direction.DOWN);
            } else {
                return new Destination(minHeap.poll(), Direction.UP);
            }
        } else {
            if (maxHeap.isEmpty()) {
                // reverse direction
                minHeap.addAll(pendingRequests);
                pendingRequests.clear();
                return new Destination(minHeap.poll(), Direction.UP);
            } else {
                return new Destination(maxHeap.poll(), Direction.DOWN);
            }
        }
    }

}
