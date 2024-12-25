package org.example.Chess;

import org.example.Chess.Piece.Piece;

public class PieceMovingManager {
    private final Board board;
    private final int[] size;

    public PieceMovingManager(Board board) {
        this.board = board;
        this.size = board.getSize();
    }

    public void movePiece(Cell sourceCell, Cell targetCell, Player player) {
        if (validateMove(sourceCell, targetCell, player)) {
            Piece targetPiece = targetCell.getPiece();
            Piece sourcePiece = sourceCell.getPiece();
            // kill
            if (targetPiece != null) {
                System.out.println("It's a kill! Target piece: " + targetPiece.getPieceType() + " of color " + targetPiece.getColor() + " is killed.");
            }
            targetCell.setPiece(sourcePiece);
            sourceCell.setPiece(null);
        }

    }

    private boolean validateMove(Cell sourceCell, Cell targetCell, Player player) {
        // check if coords in bounds
        int sourceRow = sourceCell.getRow();
        int sourceCol = sourceCell.getCol();
        int targetRow = targetCell.getRow();
        int targetCol = targetCell.getCol();

        if (sourceRow < 0 || sourceRow >= size[0] || sourceCol < 0 || sourceCol > size[1] || targetRow < 0 || targetRow >= size[0] || targetCol < 0 || targetCol > size[1]) {
            System.out.println("Invalid coordinates");
            return false;
        }

        if (sourceCell.getPiece() == null) {
            System.out.println("No piece exist at source cell");
            return false;
        }

        // see if player is moving the right piece acc to color
        if (player.getColor() != sourceCell.getPiece().getColor()){
            System.out.println("Unauthorized move!");
            return false;
        }

        // piecewise cond: if dest has a piece of same color, throw error, IF of diff color call move and  mark a kill ELSE just move
        Piece sourcePiece = sourceCell.getPiece();
        Piece targetPiece = targetCell.getPiece();

        if (targetPiece != null && sourcePiece.getColor() == targetPiece.getColor()) {
            System.out.println("Collision with same color piece on destination, invalid move");
            return false;
        }
        return sourcePiece.isValidMove(sourceCell, targetCell, this.board);
    }
}
