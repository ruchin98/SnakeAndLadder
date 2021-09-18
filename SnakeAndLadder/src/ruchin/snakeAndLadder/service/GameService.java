package ruchin.snakeAndLadder.service;

import ruchin.snakeAndLadder.model.Ladder;
import ruchin.snakeAndLadder.model.Snake;
import ruchin.snakeAndLadder.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameService {

    private final DiceService diceService;
    private final UserService userService;

    public GameService(DiceService diceService, UserService userService) {
        this.diceService = diceService;
        this.userService = userService;
    }

    public void startGame(List<User> users, List<Snake> snakes, List<Ladder> ladders) {

        Integer userIndex=0;
        while(true) {
            User user = users.get(userIndex);
            Integer diceVal = diceService.rollDice();
            Integer nextPos = userService.getUserNextPosition(user, diceVal, snakes, ladders);
            System.out.println(user.getUserName()+" rolled a "+diceVal+" and moved from "+user.getPosition()+" to "+nextPos);
            user.setPosition(nextPos);
            if(nextPos==100) {
                System.out.println(user.getUserName()+" wins the game");
                break;
            }
            userIndex = (userIndex+1)%(users.size());
        }
    }
}
