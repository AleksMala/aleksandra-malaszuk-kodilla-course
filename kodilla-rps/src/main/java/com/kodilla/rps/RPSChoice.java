package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RPSChoice {

    private static final Map<Integer, String> choices = new HashMap<>();

    public RPSChoice() {
        choices.put(1, AllowedMoves.ROCK);
        choices.put(2, AllowedMoves.PAPER);
        choices.put(3, AllowedMoves.SCISSORS);
    }

    public String userChoice(int num) {
        return choices.get(num);
    }

    public String computerChoice() {
        int num = 3;
        Random random = new Random();
        int move = random.nextInt(num - 1) + 1;
        return choices.get(move);
    }
}
