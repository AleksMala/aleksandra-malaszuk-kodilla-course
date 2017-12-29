package com.kodilla.rps;

public class RpsRunner {

    RPSChoice rpsChoice;

    public void method() {

        int x = 0;
        while (x < 5) {
            x++;
            System.out.println("Round: " + x);

            RoundExecute roundExecute = new RoundExecute(rpsChoice);
            roundExecute.action();

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
