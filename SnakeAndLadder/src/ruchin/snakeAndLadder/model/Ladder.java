package ruchin.snakeAndLadder.model;

public class Ladder extends BoardObject{



    public Ladder(Integer ladderTailPos, Integer ladderHeadPos) {
        this.setTailPosition(ladderTailPos);
        this.setHeadPosition(ladderHeadPos);
    }
}
