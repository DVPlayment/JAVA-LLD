package org.example.Chess.Piece;

import org.example.Chess.Board;
import org.example.Chess.Cell;
import org.example.Chess.Enums.Color;
import org.example.Chess.Enums.PieceType;

public class Knight implements Piece {
    private final PieceType pieceType;
    private final Color color;

    public Knight(Color color) {
        this.pieceType = PieceType.KNIGHT;
        this.color = color;
    }

    @Override
    public boolean isValidMove(Cell sourceCell, Cell targetCell, Board board) {
        int sourceRow = sourceCell.getRow();
        int sourceCol = sourceCell.getCol();
        int targetRow = targetCell.getRow();
        int targetCol = targetCell.getCol();

        // x+1, x-1, y+2, y-2
        if ( (targetRow == sourceRow-1 || targetRow == sourceRow+1) && (targetCol == sourceCol-2 || targetCol == sourceCol+2) ) {
            return true;
        }
        return false;
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
