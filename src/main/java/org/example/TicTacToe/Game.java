package org.example.TicTacToe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
    private Deque<Player> players;
    private Board board;

    public Game() {
        this.players = new ArrayDeque<>();
        initializeGame();
    }

    private void initializeGame() {

        this.board = new Board(3,3);

        // we create 2 players for 2 pieces
        players.addLast(new Player("DVboi", BoardPiece.CROSS));
        players.addLast(new Player("Alanboi", BoardPiece.NOUGHTS));

    }

    public String run_game() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (board.isBoardFilled()) {
                break;
            }
            Player currentPlayer = players.removeFirst();
            int row, col;
            System.out.println("Enter a comma separated coordinates " + currentPlayer.getName() + " for placing piece in the format -> row, col");
            while (true) {
                String inputString = scanner.nextLine();
                String[] coordinates = inputString.split(",");
                try {
                    row = Integer.parseInt(coordinates[0]);
                    col = Integer.parseInt(coordinates[1]);
                    if (board.canPlacePiece(row, col)) {
                        board.setBoardPiece(row, col, currentPlayer.getBoardPiece());
                        board.renderBoard();
                        players.addLast(currentPlayer);
                        break;
                    } else {
                        System.out.println("Invalid choice for coordinates! Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid format for coordinates! Please try again.");
                }
            }

            if (board.checkForWinner(currentPlayer.getBoardPiece())) {
                return currentPlayer.getName();
            }
        }
        return "tie";
    }
}
