package org.example.SnakeAndLadder.Entities;

import org.example.SnakeAndLadder.Entities.BoardEntities.Ladder;
import org.example.SnakeAndLadder.Entities.BoardEntities.Snake;

import java.util.List;

public class Board {
    protected Cell[][] board;
    protected int[] size;

    public Board( int n_rows, int n_cols ) {
        this.size = new int[]{n_rows, n_cols};
        this.board = new Cell[n_rows][n_cols];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < this.size[0]; i++) {
            for (int j = 0; j < this.size[1]; j++) {
                this.board[i][j] = new Cell(i,j);
            }
        }
    }

    public boolean isWinner(Piece piece) {
        Cell cell = piece.getCell();
        int[] coords = cell.getCoordinates();
        return coords[0] == size[0] - 1 && coords[1] == size[1] - 1;
    }


}
