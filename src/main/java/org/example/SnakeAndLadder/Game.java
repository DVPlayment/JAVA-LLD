package org.example.SnakeAndLadder;

import org.example.SnakeAndLadder.Dice.Dice;
import org.example.SnakeAndLadder.Dice.SixSidedDice;
import org.example.SnakeAndLadder.Entities.*;
import org.example.SnakeAndLadder.Enums.PieceType;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Game {

    public static void main(String[] args) {
        Cell c = new Cell(0,0);
        Piece p1 = new Piece(PieceType.CROSS, c);
        Piece p2 = new Piece(PieceType.NOUGHTS, c);

        User player1 = new User(p1, "dv");
        User player2 = new User(p2, "av");

        Deque<User> players = new ArrayDeque<>();
        players.addLast(player1);
        players.addLast(player2);

        Board board = new Board(10, 10);

        BoardEntitiesManager boardManager = new BoardEntitiesManager(board);
        Dice dice = new SixSidedDice();

        boardManager.addSnake(5,4, 0, 5);
        boardManager.addSnake(7,9, 2, 5);

        boardManager.addLadder(7,8,0,3);
        boardManager.addLadder(7,5,0,4);
        boardManager.addLadder(7,3,0,2);
        boardManager.addLadder(7,1,0,6);

        while (true) {
            User currPlayer = players.pollLast();
            Piece currPiece = currPlayer.getPiece();
            System.out.println("Current position of " + currPlayer.getName() + " is " + Arrays.toString(currPiece.getCell().getCoordinates()));
            int currSteps = dice.roll();
            System.out.println("Dice roll: " + currSteps);
            boardManager.move(currPiece, currSteps);
            if (currSteps!=6) {
                players.addFirst(currPlayer);
            } else {
                players.addLast(currPlayer);
            }
            System.out.println("New position of " + currPlayer.getName() + " is " + Arrays.toString(currPiece.getCell().getCoordinates()));

            if (board.isWinner(currPiece)) {
                System.out.println(currPlayer.getName() + " wins!");
                break;
            }

        }
    }
}
