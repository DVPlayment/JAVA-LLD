package org.example.TicTacToe;

public class Player {
    private final String name;
    private final BoardPiece boardPiece;

    public Player(String name, BoardPiece boardPiece) {
        this.name = name;
        this.boardPiece = boardPiece;
    }

    public String getName() {return name;}

    public BoardPiece getBoardPiece() {return boardPiece;}
}
