package ruchin.snakeAndLadder;

import ruchin.snakeAndLadder.model.Ladder;
import ruchin.snakeAndLadder.model.Snake;
import ruchin.snakeAndLadder.model.User;
import ruchin.snakeAndLadder.service.DiceService;
import ruchin.snakeAndLadder.service.GameService;
import ruchin.snakeAndLadder.service.SnakeLadderService;
import ruchin.snakeAndLadder.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        List<Snake> snakes = new ArrayList<>();
        List<Ladder> ladders = new ArrayList<>();
        DiceService diceService = new DiceService();
        SnakeLadderService snakeLadderService = new SnakeLadderService();
        UserService userService = new UserService(snakeLadderService);
        GameService gameService = new GameService(diceService, userService);

        Scanner sc = new Scanner(System.in);
        Integer snakesCount = sc.nextInt();
        for(int i=0;i<snakesCount;i++) {
            Integer snakeHeadPos = sc.nextInt();
            Integer snakeTailPos = sc.nextInt();
            Snake snake = new Snake(snakeHeadPos, snakeTailPos);
            snakes.add(snake);
        }

        Integer ladderCount = sc.nextInt();
        for(int i=0;i<ladderCount;i++) {
            Integer ladderTailPos = sc.nextInt();
            Integer ladderHeadPos = sc.nextInt();
            Ladder ladder = new Ladder(ladderTailPos, ladderHeadPos);
            ladders.add(ladder);
        }

        Integer userCount = sc.nextInt();
        for(int i=0;i<userCount;i++) {
            String userName = sc.next();
            User user = new User((long) (i+1), userName);
            users.add(user);
        }
        gameService.startGame(users, snakes, ladders);
    }
}
