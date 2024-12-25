package org.example.Chess.Enums;

public enum PieceType {
    ROOK("rook"),
    BISHOP("bishop"),
    KNIGHT("knight"),
    PAWN("pawn"),
    KING("king"),
    QUEEN("queen");
    private final String type;

    PieceType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
