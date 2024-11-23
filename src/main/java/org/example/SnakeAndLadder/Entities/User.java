package org.example.SnakeAndLadder.Entities;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private final Piece piece;

    public User(Piece piece, String name) {
        this.piece = piece;
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Piece getPiece() {
        return piece;
    }

}
