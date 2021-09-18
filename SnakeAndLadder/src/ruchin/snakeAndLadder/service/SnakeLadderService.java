package ruchin.snakeAndLadder.service;

import ruchin.snakeAndLadder.model.Ladder;
import ruchin.snakeAndLadder.model.Snake;

import java.util.List;

public class SnakeLadderService {

    Boolean isSnakeHeadAtPos(Integer pos, List<Snake> snakes) {
        for(Snake snake : snakes) {
            if(snake.getHeadPosition()==pos) {
                return true;
            }
        } return false;
    }

    Boolean isLadderTailAtPos(Integer pos, List<Ladder> ladders) {
        for(Ladder ladder : ladders) {
            if(ladder.getTailPosition()==pos) {
                return true;
            }
        } return false;
    }

    Snake getSnakeAtHeadPos(Integer pos, List<Snake> snakes) {
        for(Snake snake : snakes) {
            if(snake.getHeadPosition()==pos) {
                return snake;
            }
        }
        return null;
    }

    Ladder gerLadderAtTailPos(Integer pos, List<Ladder> ladders) {
        for(Ladder ladder : ladders) {
            if(ladder.getTailPosition()==pos) {
                return ladder;
            }
        }
        return null;
    }
}
