package com.tekwill.learning.trivia.game.engine;

import java.util.Scanner;

public class TriviaAdmin {
    public void start() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Do you want to be a the Ultimate Trivia Man \uD83E\uDD13? ---");
        do {
            displayHelpOptionsMessage();
            pickQuestion();

            System.out.print("answer > ");
            String userAnswer = scanner.nextLine();

            validateResponse(userAnswer);

            if (questionLevel >= 4)
                endGameWithCongratulations();

        } while (!gameOver);
    }
}
