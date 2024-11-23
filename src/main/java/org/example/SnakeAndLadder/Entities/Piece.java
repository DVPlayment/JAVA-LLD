package org.example.SnakeAndLadder.Entities;

import org.example.SnakeAndLadder.Enums.PieceType;

public class Piece {
    private final PieceType pieceType;
    private Cell cell;
    public Piece(PieceType pieceType, Cell cell) {
        this.pieceType = pieceType;
        this.cell = cell;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
    public Cell getCell() {
        return cell;
    }
    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
