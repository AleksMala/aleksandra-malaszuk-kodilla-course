package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RPSChoice implements AllowedMoves {

    private static final Map<Integer, String> choices = new HashMap<>();

    public RPSChoice() {
        choices.put(1, AllowedMoves.ROCK);
        choices.put(2, AllowedMoves.PAPER);
        choices.put(3, AllowedMoves.SCISSORS);
    }

    public String userChoice(ScannerInfo scannerInfo) {
        return choices.get(scannerInfo.getNumber());
    }

    public String computerChoice() {
        Random random = new Random();
        return choices.get(random.nextInt(3) + 1);

    }
}
