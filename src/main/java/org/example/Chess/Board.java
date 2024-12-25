package org.example.Chess;

import org.example.Chess.Enums.Color;
import org.example.Chess.Piece.*;

import java.util.List;

public class Board {
    private Cell[][] board;
    private int[] size;
    private List<Piece> pieces;

    public Board(int[] size) {
        this.size = size;
        this.board = new Cell[size[0]][size[1]];
        initializeBoard();
    }

    private void assignPiecesAndPawns(Color color) {
        // black on top 0, white at bottom 7
        int nrows = size[0];
        int ncols = size[1];
        int pieceRow = 0;
        int pawnRow = 1;
        if (color == Color.WHITE) {
            pieceRow = nrows - 1;
            pawnRow = pieceRow - 1;
        }
        // place pieces
        this.board[pieceRow][0].setPiece(new Rook(color));
        this.board[pieceRow][ncols-1].setPiece(new Rook(color));
        this.board[pieceRow][1].setPiece(new Knight(color));
        this.board[pieceRow][ncols-2].setPiece(new Knight(color));
        this.board[pieceRow][2].setPiece(new Bishop(color));
        this.board[pieceRow][ncols-3].setPiece(new Bishop(color));

        this.board[pieceRow][3].setPiece(new Queen(color));
        this.board[pieceRow][ncols-4].setPiece(new King(color));

        // place pawns
        for (int col = 0; col < ncols; col++) {
            this.board[pawnRow][col].setPiece(new Pawn(color));
        }

    }

    private void initializeBoard(){
        // create the board of cells
        for (int i=0; i<size[0]; i++) {
            for (int j=0; j<size[1]; j++) {
                this.board[i][j] = new Cell(i, j);
            }
        }

        // create and add pieces of black & white in the board
        assignPiecesAndPawns(Color.BLACK);
        assignPiecesAndPawns(Color.WHITE);

    }

    public Cell[][] getBoard() {
        return board;
    }
    public int[] getSize() {
        return size;
    }

}
