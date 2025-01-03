package org.example.SnakeAndLadder.Entities;

public class Cell {
    private final int x;
    private final int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int[] getCoordinates() {
        return new int[]{x, y};
    }
}
