package com.kodilla.rps;


import java.util.ArrayList;
import java.util.List;

public class RoundExecute {

    private ComputerChoice computerChoice;
    private UserChoice userChoice;
    static List<String> userPoints = new ArrayList<>();
    static List<String> computerPoints = new ArrayList<>();

    public RoundExecute(ComputerChoice computerChoice, UserChoice userChoice) {
        this.computerChoice = computerChoice;
        this.userChoice = userChoice;
    }

    public void action() {
        Rules rules = new Rules();

        if (userChoice.test().equals(computerChoice.test())) {
            System.out.println("tie");
        } else {

            if (userChoice.test().equals(AllowedMoves.PAPER) && computerChoice.test().equals(AllowedMoves.ROCK)) {
                rules.paperOverRock();
                userPoints.add("u");
            }

            if (userChoice.test().equals(AllowedMoves.SCISSORS) && computerChoice.test().equals(AllowedMoves.PAPER)) {
                rules.scissorsOverPaper();
                userPoints.add("u");
            }

            if (userChoice.test().equals(AllowedMoves.ROCK) && computerChoice.test().equals(AllowedMoves.SCISSORS)) {
                rules.rockOverScissors();
                userPoints.add("u");
            }

            if (userChoice.test().equals(AllowedMoves.ROCK) && computerChoice.test().equals(AllowedMoves.PAPER)) {
                rules.paperOverRock();
                computerPoints.add("c");
            }
            if (userChoice.test().equals(AllowedMoves.PAPER) && computerChoice.test().equals(AllowedMoves.SCISSORS)) {
                rules.scissorsOverPaper();
                computerPoints.add("c");
            }
            if (userChoice.test().equals(AllowedMoves.SCISSORS) && computerChoice.test().equals(AllowedMoves.ROCK)) {
                rules.rockOverScissors();
                computerPoints.add("c");
            }
            System.out.println("score: user " + userPoints.size() + " / computer " + computerPoints.size());
        }
    }
}
