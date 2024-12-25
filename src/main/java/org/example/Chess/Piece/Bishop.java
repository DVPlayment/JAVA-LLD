package org.example.Chess.Piece;

import org.example.Chess.Board;
import org.example.Chess.Cell;
import org.example.Chess.Enums.Color;
import org.example.Chess.Enums.PieceType;

import static java.lang.Math.abs;

public class Bishop implements Piece{
    private final PieceType pieceType;
    private final Color color;


    public Bishop(Color color) {
        this.pieceType = PieceType.BISHOP;
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

        // Ensure the move is diagonal
        if (abs(targetRow - sourceRow) != abs(targetCol - sourceCol)) {
            return false;
        }

        int rowDirection = (targetRow > sourceRow) ? 1 : -1;
        int colDirection = (targetCol > sourceCol) ? 1 : -1;

        int row = sourceRow + rowDirection;
        int col = sourceCol + colDirection;

        while (row != targetRow && col != targetCol) {
            if (row < 0 || row >= size[0] || col < 0 || col >= size[1]) {
                return false; // Out of bounds during traversal
            }

            if (chessBoard[row][col].getPiece() != null) {
                return false; // Obstruction found
            }
            row += rowDirection;
            col += colDirection;
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
