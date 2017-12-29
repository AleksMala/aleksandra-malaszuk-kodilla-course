package com.kodilla.rps;

public class Input {

    public void getInfo(ScannerInfo scannerInfo) {
        System.out.println("Put your name: ");
        String name = scannerInfo.getWord();
        System.out.println("Number of rounds to win: ");
        scannerInfo.getNumber();
        System.out.println("Hello " + name + ". " + "Here are the rules of RPS:");
    }
}
