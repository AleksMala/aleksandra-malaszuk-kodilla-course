package com.kodilla.rps;

import java.util.Scanner;

public class RulesOfTheGame {

    private Scanner scanner = new Scanner(System.in);
    private Wins wins = new Wins();

    public void getRules() {
        System.out.println("Put your name: ");
        String name = scanner.nextLine();
        System.out.println("Number of rounds to win: ");
        wins.getWins();
        System.out.println("Hello " + name + ". " + "Here are the rules of RPS:");
        System.out.println("Key " + "\"" + "1" + "\"" + " equals " + AllowedMoves.ROCK +
                "\n" + "Key " + "\"" + "2" + "\"" + " equals " + AllowedMoves.PAPER +
                "\n" + "Key " + "\"" + "3" + "\"" + " equals " + AllowedMoves.SCISSORS +
                "\n" + "Key " + "\"" + "x" + "\"" + " - Are you sure you want to quit the game ?" +
                "\n" + "Key " + "\"" + "n" + "\"" + " - Are you sure to start over ?" +
                "\n" + "Good luck !");
    }

}
