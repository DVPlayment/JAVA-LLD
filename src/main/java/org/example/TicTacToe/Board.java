package org.example.TicTacToe;

public class Board {
    private final int[] size = new int[2];
    private final BoardPiece[][] board;

    public Board(int row, int col) {
        this.size[0] = row;
        this.size[1] = col;
        this.board = new BoardPiece[row][col];
    }
    public int[] getSize() {return size;}

    public BoardPiece[][] getBoard() {return board;}

    public BoardPiece getBoardPiece(int row, int col) {
        if (!coordinateInBounds(row, col)) {
            System.out.println("Cannot place/fetch board piece as slot out of bounds");
            return null;
        }
        return board[row][col];
    }

    public void setBoardPiece(int row, int col, BoardPiece piece) {board[row][col] = piece;}

    public boolean coordinateInBounds(int row, int col) {return (!(row < 0 || row >= size[0] || col <0 || col >= size[1]));}

    public boolean canPlacePiece(int row, int col) {
        if (!coordinateInBounds(row, col)) {
            System.out.println("Cannot place/fetch board piece as slot out of bounds");
            return false;
        }

        if (getBoardPiece(row, col) != null) {
            System.out.println("Cannot place board piece as slot not empty");
            return false;
        }
        return true;
    }

    private int getEmptyCells() {
        int emptyCells = 0;
        for (int row = 0; row < size[0]; row++) {
            for (int col = 0; col < size[1]; col++) {
                if (getBoardPiece(row, col) == null) {
                    emptyCells++;
                }
            }
        }
        return emptyCells;
    }

    public boolean isBoardFilled() {
        int emptyCells = getEmptyCells();
        return emptyCells == 0;
    }

    public boolean checkForWinner(BoardPiece piece) {
        // check rows
        boolean rowMatch, colMatch, rightDiagonalMatch, leftDiagonalMatch;
        rowMatch = true;
        for (int row = 0; row < size[0]; row++) {
            rowMatch = true;
            for (int col = 0; col < size[1]; col++) {
                if (board[row][col] != piece) {
                    rowMatch = false;
                    break;
                }
            }
        }
        // check cols
        colMatch = true;
        for (int col = 0; col < size[1]; col++) {
            colMatch = true;
            for (int row = 0; row < size[0]; row++) {
                if (board[row][col] != piece) {
                    colMatch = false;
                    break;
                }
            }
        }
        // check diagonals
        leftDiagonalMatch = true;
        rightDiagonalMatch = true;
        for (int i = 0; i < size[1]; i++) {
            if (board[i][i] != piece) {
                leftDiagonalMatch = false;
            }
            if (board[i][size[1] - i - 1] != piece) {
                rightDiagonalMatch = false;
            }
        }
        return (rowMatch || colMatch || leftDiagonalMatch || rightDiagonalMatch);
    }
    public void renderBoard() {
        for (int row = 0; row < size[0]; row++) {
            for (int col = 0; col < size[1]; col++) {
                if (board[row][col] == null) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + board[row][col].getType() + " ");
                }
                if (col < size[1] - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row < size[0] - 1) {
                for (int col = 0; col < size[1]; col++) {
                    System.out.print("---");
                    if (col < size[1] - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
    }


}
