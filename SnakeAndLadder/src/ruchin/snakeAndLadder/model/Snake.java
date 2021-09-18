package ruchin.snakeAndLadder.model;

public class Snake extends BoardObject{

    Snake() {}

    public Snake(Integer snakeHeadPos, Integer snakeTailPos) {
        this.setHeadPosition(snakeHeadPos);
        this.setTailPosition(snakeTailPos);
    }
}
