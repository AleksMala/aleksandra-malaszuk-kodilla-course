package com.kodilla.rps;

import java.util.Scanner;

public class UserChoice {

    private Scanner scanner = new Scanner(System.in);
    private int key = scanner.nextInt();
    private String value;

    public final String test() {

        switch (key) {
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
                throw new NullPointerException("key is not allowed");
        }
        return value;
    }
}
