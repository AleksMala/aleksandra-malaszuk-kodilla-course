package com.kodilla.rps;

import java.util.Random;

public class ComputerChoice {

    int num = 3;
    Random random = new Random();
    private int move = random.nextInt(num - 1) + 1;
    private String value;

    public final String test() {

        switch (move) {
            case 1:
                value = AllowedMoves.ROCK;
                break;
            case 2:
                value = AllowedMoves.PAPER;
                break;
            case 3:
                value = AllowedMoves.SCISSORS;
                break;
            default:
                System.out.println("key not allowed");
        }
        return value;
    }

    public int getMove() {
        return move;
    }
}
