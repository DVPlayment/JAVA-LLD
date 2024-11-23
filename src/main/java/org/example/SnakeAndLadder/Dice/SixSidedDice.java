package org.example.SnakeAndLadder.Dice;

import java.util.Random;

public class SixSidedDice implements Dice {
    private final Random random;

    // Constructor
    public SixSidedDice() {
        this.random = new Random();
    }

    @Override
    public int roll() {
        return random.nextInt(6) + 1; // Generates a random number between 1 and 6
    }
}
