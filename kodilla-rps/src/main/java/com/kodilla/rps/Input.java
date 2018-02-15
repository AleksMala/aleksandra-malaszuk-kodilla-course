package com.kodilla.rps;

public class Input {

    public static int numOfRounds;

    public void getInfo(ScannerInfo scannerInfo) {
        System.out.println("Put your name: ");
        String name = scannerInfo.getWord();
        System.out.println("Number of rounds to win: ");
        numOfRounds = scannerInfo.getNumber();
        System.out.println("Hello " + name + ". " + "Here are the rules of RPS:");
    }
}
