package com.kodilla.rps;


public class RoundExecute {

    private RPSChoice rpsChoice;
    public static int scoreForUser = 0;
    public static int scoreForComputer = 0;

    public RoundExecute(RPSChoice rpsChoice) {
        this.rpsChoice = rpsChoice;
    }

    public void action() {
        Rules rules = new Rules();

        ScannerInfo scannerInfo = new ScannerInfo();
        String user = rpsChoice.userChoice(scannerInfo);
        String computer = rpsChoice.computerChoice();

        if (user.equals(computer)) {
            System.out.println("tie");
        } else if (user.equals(AllowedMoves.PAPER) && computer.equals(AllowedMoves.ROCK)) {
            scoreForUser++;
            rules.paperOverRock();
            System.out.println("User: " + scoreForUser + " comp: " + scoreForComputer);
        } else if (user.equals(AllowedMoves.SCISSORS) && computer.equals(AllowedMoves.PAPER)) {
            scoreForUser++;
            rules.scissorsOverPaper();
            System.out.println("User: " + scoreForUser + " comp: " + scoreForComputer);
        } else if (user.equals(AllowedMoves.ROCK) && computer.equals(AllowedMoves.SCISSORS)) {
            scoreForUser++;
            rules.rockOverScissors();
            System.out.println("User: " + scoreForUser + " comp: " + scoreForComputer);
        } else if (user.equals(AllowedMoves.ROCK) && computer.equals(AllowedMoves.PAPER)) {
            scoreForComputer++;
            rules.paperOverRock();
            System.out.println("User: " + scoreForUser + " comp: " + scoreForComputer);
        } else if (user.equals(AllowedMoves.PAPER) && computer.equals(AllowedMoves.SCISSORS)) {
            scoreForComputer++;
            rules.scissorsOverPaper();
            System.out.println("User: " + scoreForUser + " comp: " + scoreForComputer);
        } else if (user.equals(AllowedMoves.SCISSORS) && computer.equals(AllowedMoves.ROCK)) {
            scoreForComputer++;
            rules.rockOverScissors();
            System.out.println("User: " + scoreForUser + " comp: " + scoreForComputer);
        }
    }
}


