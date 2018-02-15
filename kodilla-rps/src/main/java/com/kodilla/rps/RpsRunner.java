package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {


    public void method() {
        RPSChoice rpsChoice = new RPSChoice();
        int n = 0;
        while (n <= Input.numOfRounds) {
            RoundExecute roundExecute = new RoundExecute(rpsChoice);
            roundExecute.action();
        }
        while (new KeyXN().playAgain(new Scanner(System.in))) {
            KeyXN.areYouSure(new Scanner(System.in));
            //KeyXN keyXN = new KeyXN();
            //keyXN.playAgain(new Scanner(System.in));
        }
    }


    public static void main(String args[]) {

        ScannerInfo scannerInfo = new ScannerInfo();
        Input input = new Input();
        input.getInfo(scannerInfo);

        RulesOfTheGame rulesOfTheGame = new RulesOfTheGame();
        rulesOfTheGame.getRules();

        RpsRunner rpsRunner = new RpsRunner();
        rpsRunner.method();
    }
}
