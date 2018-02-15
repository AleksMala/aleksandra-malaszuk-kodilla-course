package com.kodilla.rps;


public class RoundExecute {

    private RPSChoice rpsChoice;
    private Rules rules;

    public RoundExecute(RPSChoice rpsChoice) {
        this.rpsChoice = rpsChoice;
    }

    public void action() {

        ScannerInfo scannerInfo = new ScannerInfo();
        String user = rpsChoice.userChoice(scannerInfo);
        String computer = rpsChoice.computerChoice();

        if (user.equals(computer)) {
            System.out.println("tie");
        } else if (user.equals(AllowedMoves.PAPER) && computer.equals(AllowedMoves.ROCK)) {
            rules.paperOverRock();
        } else if (user.equals(AllowedMoves.SCISSORS) && computer.equals(AllowedMoves.PAPER)) {
            rules.scissorsOverPaper();
        } else if (user.equals(AllowedMoves.ROCK) && computer.equals(AllowedMoves.SCISSORS)) {
            rules.rockOverScissors();
        } else if (user.equals(AllowedMoves.ROCK) && computer.equals(AllowedMoves.PAPER)) {
            rules.paperOverRock();
        } else if (user.equals(AllowedMoves.PAPER) && computer.equals(AllowedMoves.SCISSORS)) {
            rules.scissorsOverPaper();
        } else if (user.equals(AllowedMoves.SCISSORS) && computer.equals(AllowedMoves.ROCK)) {
            rules.rockOverScissors();
        }
    }
}

