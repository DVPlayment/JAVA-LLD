package org.example.Chess.Piece;

import org.example.Chess.Board;
import org.example.Chess.Cell;
import org.example.Chess.Enums.Color;
import org.example.Chess.Enums.PieceType;

import static java.lang.Math.abs;

public class Rook implements Piece{
    private final PieceType pieceType;
    private final Color color;

    public Rook(Color color) {
        this.pieceType = PieceType.KNIGHT;
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

        // Ensure the move is vert/hor
        if ( targetRow != sourceRow && targetCol != sourceCol ) {
            return false;
        }

        int rowDirection = 0;
        int colDirection = 0;

        if (targetRow > sourceRow) {
            rowDirection = 1;
        } else if (targetRow < sourceRow) {
            rowDirection = -1;
        }

        if (targetCol > sourceCol) {
            colDirection = 1;
        } else if (targetCol < sourceCol) {
            colDirection = -1;
        }

        int row = sourceRow + rowDirection;
        int col = sourceCol + colDirection;

        while (row!=targetRow || col!=targetCol) {
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

    @Override
    public String getPieceType() {
        return pieceType.getType();
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
