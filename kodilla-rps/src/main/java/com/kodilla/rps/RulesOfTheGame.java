package com.kodilla.rps;

public class RulesOfTheGame {

    public void getRules() {

        System.out.println("Key " + "\"" + "1" + "\"" + " equals " + AllowedMoves.ROCK +
                "\n" + "Key " + "\"" + "2" + "\"" + " equals " + AllowedMoves.PAPER +
                "\n" + "Key " + "\"" + "3" + "\"" + " equals " + AllowedMoves.SCISSORS +
                "\n" + "Key " + "\"" + "x" + "\"" + " - Are you sure you want to quit the game ?" +
                "\n" + "Key " + "\"" + "n" + "\"" + " - Are you sure to start over ?" +
                "\n" + "Good luck !");
    }
}
