package com.kodilla.rps;

import java.util.Scanner;

public class Wins {

    Scanner scanner = new Scanner(System.in);
    private int wins;

    public int getWins() {
        wins = scanner.nextInt();
        return wins;
    }
}


