package org.example.TicTacToe;

public enum BoardPiece {
    CROSS("X"),
    NOUGHTS("O");
    private final String type;

    BoardPiece(String type) {
        this.type = type;
    }

    public String getType() {return this.type;}
}
