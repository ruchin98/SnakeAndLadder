package ruchin.snakeAndLadder.service;

import java.util.Random;

public class DiceService {

    public int rollDice() {
        Random random = new Random();
        Integer diceVal = random.nextInt(6);
        diceVal++;
        return diceVal;
    }
}
