package org.example.Chess.Piece;

import org.example.Chess.Board;
import org.example.Chess.Cell;
import org.example.Chess.Enums.Color;
import org.example.Chess.Enums.PieceType;

import static java.lang.Math.abs;

public class King implements Piece{
    private final PieceType pieceType;
    private final Color color;


    public King(Color color) {
        this.pieceType = PieceType.KING;
        this.color = color;
    }

    @Override
    public boolean isValidMove(Cell sourceCell, Cell targetCell, Board board) {

        int sourceRow = sourceCell.getRow();
        int sourceCol = sourceCell.getCol();
        int targetRow = targetCell.getRow();
        int targetCol = targetCell.getCol();
        Cell[][] chessBoard = board.getBoard();
        int[] size = board.getSize();

        // Check if the move is within one square in any direction
        if (abs(sourceRow - targetRow) > 1 || abs(sourceCol - targetCol) > 1) {
            return false; // Not a valid King move
        }

        return true;
    }

    public String getPieceType() {
        return pieceType.getType();
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
