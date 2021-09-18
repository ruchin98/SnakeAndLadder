package ruchin.snakeAndLadder.service;

import ruchin.snakeAndLadder.model.Ladder;
import ruchin.snakeAndLadder.model.Snake;
import ruchin.snakeAndLadder.model.User;

import java.util.List;

public class UserService {

    private final SnakeLadderService snakeLadderService;

    public UserService(SnakeLadderService snakeLadderService) {
        this.snakeLadderService = snakeLadderService;
    }

    public Integer getUserNextPosition(User user, Integer diceValue, List<Snake> snakes, List<Ladder> ladders) {
        Integer nextPos = user.getPosition() + diceValue;
        if(nextPos>100) return user.getPosition();
        else if(nextPos==100) {
        }
        else {
            while(snakeLadderService.isSnakeHeadAtPos(nextPos, snakes) || snakeLadderService.isLadderTailAtPos(nextPos, ladders)) {
                if(snakeLadderService.isSnakeHeadAtPos(nextPos, snakes)) {
                    Snake snake = snakeLadderService.getSnakeAtHeadPos(nextPos, snakes);
                    nextPos = snake.getTailPosition();
                } else {
                    Ladder ladder = snakeLadderService.gerLadderAtTailPos(nextPos, ladders);
                    nextPos = ladder.getHeadPosition();
                }
            }
        }
        return nextPos;
    }
}
