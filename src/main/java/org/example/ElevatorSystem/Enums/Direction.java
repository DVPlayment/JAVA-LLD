package org.example.ElevatorSystem.Enums;

public enum Direction {
    UP("up"),
    DOWN("down");

    private final String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }
}
