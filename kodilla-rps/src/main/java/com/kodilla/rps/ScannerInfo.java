package com.kodilla.rps;

import java.util.Scanner;

public class ScannerInfo {

    private Scanner scanner = new Scanner(System.in);

    public String getWord() {
        return scanner.nextLine();
    }

    public int getNumber() {
        return scanner.nextInt();
    }

}
