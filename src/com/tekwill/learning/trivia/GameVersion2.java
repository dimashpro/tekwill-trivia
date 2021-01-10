package com.tekwill.learning.trivia;

import java.util.Random;
import java.util.Scanner;

public class GameVersion2 {
    public static void main(String[] args){
        boolean gameMenuRunning = true;
        boolean gameOver = false;
        int questionNumber = 1;
        int questionScore = 0;
        int currentScore = 0;
        String currentCorrectAnswer = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to be a millionaire?");
        do {
            System.out.println("Enter [START] to start the game or [EXIT] to quit");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("START")) {
                do {
                    switch (questionNumber) {
                        case 1:
                            System.out.println(Questions.LEVEL_1_QUESTION_1);
                            System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_1);
                            System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_2);
                            System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_3);
                            System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_4);
                            currentCorrectAnswer = Questions.LEVEL_1_QUESTION_1_ANSWER_3;
                            questionScore = Questions.LEVEL_1_QUESTION_1_SCORE;
                            break;
                        case 2:
                            System.out.println(Questions.LEVEL_1_QUESTION_2);
                            System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_1);
                            System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_2);
                            System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_3);
                            System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_4);
                            currentCorrectAnswer = Questions.LEVEL_1_QUESTION_2_ANSWER_2;
                            questionScore = Questions.LEVEL_1_QUESTION_2_SCORE;
                            break;
                        case 3:
                            System.out.println(Questions.LEVEL_2_QUESTION_1);
                            System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_1);
                            System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_2);
                            System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_3);
                            System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_4);
                            currentCorrectAnswer = Questions.LEVEL_2_QUESTION_1_ANSWER_4;
                            questionScore = Questions.LEVEL_2_QUESTION_1_SCORE;
                            break;
                        case 4:
                            System.out.println(Questions.LEVEL_3_QUESTION_1);
                            System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_1);
                            System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_2);
                            System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_3);
                            System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_4);
                            currentCorrectAnswer = Questions.LEVEL_3_QUESTION_1_ANSWER_2;
                            questionScore = Questions.LEVEL_3_QUESTION_1_SCORE;
                            break;
                    }
                    System.out.print("You have 3 help options (Ask a friend - H1; Ask auditory - H2; Ask computer (50/50) - H3)");
                    String questionResponse = scanner.nextLine();
                   if (questionResponse.equalsIgnoreCase(currentCorrectAnswer)) {
                        questionNumber++;
                        currentScore += questionScore;
                        System.out.println("Your score : " + currentScore);
                    } else  if (questionResponse.equals("H1")){
                        askFriend();
                    } else if (questionResponse.equals("H2")){
                        askAuditory();
                    } else if (questionResponse.equals("H3")){
                        askComputer();
                    } else {
                        System.out.println("Game Over!");
                        gameOver = true;
                    }

                    if (questionNumber >= 5 && !questionResponse.equals("H1") && !questionResponse.equals("H2") && !questionResponse.equals("H3")) {
                        System.out.println("You won!");
                        System.out.println("You got : " + currentScore);
                        gameOver = true;
                    }

                } while (!gameOver);
            } else if (response.equalsIgnoreCase("EXIT")) {
                System.out.println("Bye, bye!");
                gameMenuRunning = false;
            } else {
                System.out.println("Enter [START] to start the game or [EXIT] to quit...");
            }

        } while (gameMenuRunning);

    }
    public static void askAuditory(){
        Random random = new Random();
        int group1 = random.nextInt(24);
        int group2 = random.nextInt(24);
        int group3 = random.nextInt(24);
        int group4 = 100 - group1 -group2 - group3;
        System.out.println("The auditory consider that  correct answer is:" + (1 + random.nextInt(3)) + " by " + group4 + "% of auditory");

    }
    public static void askFriend(){
        Random random = new Random();
        System.out.println("your friend consider that correct answer is: " + (1 + random.nextInt(3)));
    }
    public static void askComputer(){
        Random random = new Random();
        System.out.println("Computer choose :" + (1 + random.nextInt(1)) + " and " + (3 + random.nextInt(1)));

    }
}
