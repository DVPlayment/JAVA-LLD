package org.example.SnakeAndLadder.Entities;

import org.example.SnakeAndLadder.Entities.BoardEntities.BoardEntity;
import org.example.SnakeAndLadder.Entities.BoardEntities.Ladder;
import org.example.SnakeAndLadder.Entities.BoardEntities.Snake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardEntitiesManager {
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Board board;

    public BoardEntitiesManager(Board board) {
        this.snakes = new ArrayList<>();
        this.ladders = new ArrayList<>();
        this.board = board;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void addSnake(int head_x, int head_y, int tail_x, int tail_y) {
        Snake snake = new Snake(board.board[head_x][head_y], board.board[tail_x][tail_y]);
        if (canPlace(snake)){
            snakes.add(snake);
        } else {
            System.out.println("Can't place snake");
        }
    }

    public void addLadder(int head_x, int head_y, int tail_x, int tail_y) {
        Ladder ladder = new Ladder(board.board[head_x][head_y], board.board[tail_x][tail_y]);
        if (canPlace(ladder)){
            ladders.add(ladder);
        } else {
            System.out.println("Can't place ladder here" );
            System.out.println(Arrays.toString(new int[]{head_x, head_y, tail_x, tail_y}));
        }
    }

    public boolean detectEntitiesClash(BoardEntity boardEntity1, BoardEntity boardEntity2) {
        Cell head1 = boardEntity1.getHead();
        Cell head2 = boardEntity2.getHead();
        Cell tail1 = boardEntity1.getTail();
        Cell tail2 = boardEntity2.getTail();

        if ( head1.equals(head2) || head1.equals(tail2) ) {
            System.out.println("Clash b/w entities, cannot place here");
            return true;
        }

        if ( tail1.equals(head2) || tail1.equals(tail2) ) {
            System.out.println("Clash b/w entities, cannot place here");
            return true;
        }

        return false;

    }

    public boolean canPlace(BoardEntity boardEntity) {
        for (Snake snake : snakes) {
            if (detectEntitiesClash(snake, boardEntity)) {
                return false;
            }
        }

        for (Ladder ladder : ladders) {
            if (detectEntitiesClash(ladder, boardEntity)) {
                return false;
            }
        }
        return true;
    }

    // check & update if there is a snake/ladder after moving 'steps'
    public void checkAndUpdatePieceEntityClash(Piece piece){

        for(Snake snake : snakes){
            if (snake.getHead() == piece.getCell()) {
                System.out.println("Cut by a snake!");
                piece.setCell(snake.getTail());
            }
        }

        for(Ladder ladder : ladders){
            if (ladder.getTail() == piece.getCell()) {
                System.out.println("Leveraged a ladder!");
                piece.setCell(ladder.getHead());
            }
        }

    }

    public void move(Piece piece, int steps) {
        Cell cell = piece.getCell();
        int[] coords = cell.getCoordinates();
        int curr_pos = (coords[0] * board.size[0]) + coords[1];
        int new_pos = curr_pos + steps;
        if (new_pos > 99) {
            System.out.println("Out of bound");
        } else {
            int i = new_pos / board.size[0];
            int j = new_pos % board.size[0];
            piece.setCell(board.board[i][j]);
            checkAndUpdatePieceEntityClash(piece);
        }
    }

}
