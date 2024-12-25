package org.example.Chess.Piece;

import org.example.Chess.Board;
import org.example.Chess.Cell;
import org.example.Chess.Enums.Color;

public interface Piece {
    boolean isValidMove(Cell sourceCell, Cell targetCell, Board board);
    String getPieceType();
    Color getColor();
}
