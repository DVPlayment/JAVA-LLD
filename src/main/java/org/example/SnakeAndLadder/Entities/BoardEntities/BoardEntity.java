package org.example.SnakeAndLadder.Entities.BoardEntities;

import org.example.SnakeAndLadder.Entities.Cell;

public class BoardEntity {
    private final Cell head;
    private final Cell tail;

    public BoardEntity(Cell head, Cell tail) {
        this.head = head;
        this.tail = tail;
    }

    public Cell getHead() {
        return head;
    }
    public Cell getTail() {
        return tail;
    }
}
