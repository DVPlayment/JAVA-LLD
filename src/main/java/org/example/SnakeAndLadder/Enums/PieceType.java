package org.example.SnakeAndLadder.Enums;

public enum PieceType {
    CROSS("X"),
    NOUGHTS("O"),
    ARROW("^");

    private final String symbol;
    PieceType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
