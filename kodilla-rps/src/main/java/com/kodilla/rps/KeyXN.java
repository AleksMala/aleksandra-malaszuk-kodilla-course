package com.kodilla.rps;

import java.util.Scanner;

public class KeyXN {

    public boolean playAgain(Scanner scanner) {
        System.out.println("Do You want to play (n) or end (x) ?");
        switch (scanner.next()) {
            case "n":
                if(areYouSure(scanner)) {
                    System.out.println("Rock, Paper, Scissors!");
                    return true;
                } else {
                    return false ;
                }
            case "x" :
                if(areYouSure(scanner)) {
                    return false;
                } else {
                    return true ;
                }

            default:
                System.out.println("Invalid option!");
                break;
        }
        return false;
    }

    private static boolean areYouSure(Scanner scanner){
        System.out.println("Are You sure y/n ?");
        switch (scanner.next()){
            case "y" :
                return true;
            case   "n":
                return false;
            default:
                System.out.println("Invalid option!");
                break;
        }

        return false;
    }
}
