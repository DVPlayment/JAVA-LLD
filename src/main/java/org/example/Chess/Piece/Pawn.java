package org.example.Chess.Piece;

import org.example.Chess.Board;
import org.example.Chess.Cell;
import org.example.Chess.Enums.Color;
import org.example.Chess.Enums.PieceType;

import static java.lang.Math.abs;

public class Pawn implements Piece{
    private final PieceType pieceType;
    private final Color color;

    public Pawn(Color color) {
        this.pieceType = PieceType.KNIGHT;
        this.color = color;
    }

    @Override
    public boolean isValidMove(Cell sourceCell, Cell targetCell, Board board) {
        int sourceRow = sourceCell.getRow();
        int sourceCol = sourceCell.getCol();
        int targetRow = targetCell.getRow();
        int targetCol = targetCell.getCol();

        Piece piece = sourceCell.getPiece();

        if (this.color == Color.WHITE) {
            // move up
            if ( sourceRow-targetRow == 1 && abs(targetCol-sourceCol) <= 1 ) {
                return true;
            }
        } else {
            // move down
            if ( targetRow-sourceRow == 1 && abs(targetCol-sourceCol) <= 1 ) {
                return true;
            }
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
