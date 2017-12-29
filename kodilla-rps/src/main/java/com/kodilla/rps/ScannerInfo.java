package com.kodilla.rps;

import java.util.Scanner;

public class ScannerInfo {

    private String word;
    private int number;
    private Scanner scanner = new Scanner(System.in);

    public String getWord() {
        word = scanner.nextLine();
        return word;
    }

    public int getNumber() {
        number = scanner.nextInt();
        return number;
    }

}
