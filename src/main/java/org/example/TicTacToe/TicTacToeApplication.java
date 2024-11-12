package org.example.TicTacToe;

public class TicTacToeApplication {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("The winner is " + game.run_game());
    }
}
