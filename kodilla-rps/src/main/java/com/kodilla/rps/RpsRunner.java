package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public void method() {

        int x = 0;
           while(x<5) {
               x++;
               System.out.println("Round: " + x);

               UserChoice userChoice = new UserChoice();
               ComputerChoice computerChoice = new ComputerChoice();

               RoundExecute roundExecute = new RoundExecute(computerChoice, userChoice);
               roundExecute.action();

               KeyXN keyXN = new KeyXN();
               keyXN.playAgain(new Scanner(System.in));
           }
    }

    public static void main(String args[]) {

        RulesOfTheGame rulesOfTheGame = new RulesOfTheGame();
        rulesOfTheGame.getRules();

        //Wins wins = new Wins();

            RpsRunner rpsRunner = new RpsRunner();
            rpsRunner.method();
    }
}
