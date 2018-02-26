package com.kodilla.rps;

public class KeyXN {
    private ScannerInfo scannerInfo;

    public boolean playAgain(ScannerInfo scannerInfo) {
        System.out.println("Do You want to play (n) or end (x) ?");
        switch (scannerInfo.getWord()) {
            case "n":
                return areYouSure(scannerInfo);
            //System.out.println("Rock, Paper, Scissors!");
            case "x":
                return (areYouSure(scannerInfo)); //{
            default:
                System.out.println("Invalid option!");
                break;
        }
        return false;
    }

    public static boolean areYouSure(ScannerInfo scannerInfo) {
        System.out.println("Are You sure y/n ?");
        switch (scannerInfo.getWord()) {
            case "y":
                return true;
            case "n":
                return false;
            default:
                System.out.println("Invalid option!");
                break;
        }

        return false;
    }
}
