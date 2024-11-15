package org.example.ElevatorSystem.Entities;

public class Floor {
    private final int id;
    public final ExternalBtn externalBtn;

    public Floor(int id, ExternalBtn externalBtn) {
        this.id = id;
        this.externalBtn = externalBtn;
    }

    public int getId() {
        return id;
    }

}
