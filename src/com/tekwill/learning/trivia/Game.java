package com.tekwill.learning.trivia;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int scoreTotal = 0;
        int correctAnswer;
        boolean nextLevel = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you wanna play a funny game? Please enter YES or NO");
        String startGame = scanner.nextLine();
        while (startGame.equals("YES")){
            System.out.println("LEVEL 1. Choose your lucky number between 1 to 3:");
            int questionNumber = scanner.nextInt();
            switch (questionNumber) {
                case 1 :
                    System.out.println(Questions.LEVEL_1_QUESTION_1);
                    System.out.println("1: " + Questions.LEVEL_1_QUESTION_1_ANSWER_1);
                    System.out.println("2: " + Questions.LEVEL_1_QUESTION_1_ANSWER_2);
                    System.out.println("3: " + Questions.LEVEL_1_QUESTION_1_ANSWER_3);
                    System.out.println("4: " + Questions.LEVEL_1_QUESTION_1_ANSWER_4);
                    correctAnswer = scanner.nextInt();
                    if (correctAnswer == 3) {
                        scoreTotal += Questions.LEVEL_1_QUESTION_1_SCORE;
                     }
                    else {
                        startGame = "NO";
                        nextLevel = false;
                    }
                    break;
                case 2 :
                    System.out.println(Questions.LEVEL_1_QUESTION_2);
                    System.out.println("1: " + Questions.LEVEL_1_QUESTION_2_ANSWER_1);
                    System.out.println("2: " + Questions.LEVEL_1_QUESTION_2_ANSWER_2);
                    System.out.println("3: " + Questions.LEVEL_1_QUESTION_2_ANSWER_3);
                    System.out.println("4: " + Questions.LEVEL_1_QUESTION_2_ANSWER_4);
                    correctAnswer = scanner.nextInt();
                    if (correctAnswer == 2) {
                        scoreTotal += Questions.LEVEL_1_QUESTION_2_SCORE;
                    }
                    else {
                        startGame = "NO";
                        nextLevel = false;
                    }
                    break;
                case 3 :
                    System.out.println(Questions.LEVEL_1_QUESTION_3);
                    System.out.println("1: " + Questions.LEVEL_1_QUESTION_3_ANSWER_1);
                    System.out.println("2: " + Questions.LEVEL_1_QUESTION_3_ANSWER_2);
                    System.out.println("3: " + Questions.LEVEL_1_QUESTION_3_ANSWER_3);
                    System.out.println("4: " + Questions.LEVEL_1_QUESTION_3_ANSWER_4);
                    correctAnswer = scanner.nextInt();
                    if (correctAnswer == 3) {
                        scoreTotal += Questions.LEVEL_1_QUESTION_3_SCORE;
                    }
                    else {
                        startGame = "NO";
                        nextLevel = false;
                    }
                    break;
            }
            if (nextLevel){
                System.out.println("LEVEL 2. Choose your lucky number between 1 to 3:");
                questionNumber = scanner.nextInt();
                switch (questionNumber) {
                    case 1 :
                        System.out.println(Questions.LEVEL_2_QUESTION_1);
                        System.out.println("1: " + Questions.LEVEL_2_QUESTION_1_ANSWER_1);
                        System.out.println("2: " + Questions.LEVEL_2_QUESTION_1_ANSWER_2);
                        System.out.println("3: " + Questions.LEVEL_2_QUESTION_1_ANSWER_3);
                        System.out.println("4: " + Questions.LEVEL_2_QUESTION_1_ANSWER_4);
                        correctAnswer = scanner.nextInt();
                        if (correctAnswer == 4) {
                            scoreTotal += Questions.LEVEL_2_QUESTION_1_SCORE;
                        }
                        else {
                            startGame = "NO";
                            nextLevel = false;
                        }
                        break;
                    case 2 :
                        System.out.println(Questions.LEVEL_2_QUESTION_2);
                        System.out.println("1: " + Questions.LEVEL_2_QUESTION_2_ANSWER_1);
                        System.out.println("2: " + Questions.LEVEL_2_QUESTION_2_ANSWER_2);
                        System.out.println("3: " + Questions.LEVEL_2_QUESTION_2_ANSWER_3);
                        System.out.println("4: " + Questions.LEVEL_2_QUESTION_2_ANSWER_4);
                        correctAnswer = scanner.nextInt();
                        if (correctAnswer == 1) {
                            scoreTotal += Questions.LEVEL_2_QUESTION_2_SCORE;
                        }
                        else {
                            startGame = "NO";
                            nextLevel = false;
                        }
                        break;
                    case 3 :
                        System.out.println(Questions.LEVEL_2_QUESTION_3);
                        System.out.println("1: " + Questions.LEVEL_2_QUESTION_3_ANSWER_1);
                        System.out.println("2: " + Questions.LEVEL_2_QUESTION_3_ANSWER_2);
                        System.out.println("3: " + Questions.LEVEL_2_QUESTION_3_ANSWER_3);
                        System.out.println("4: " + Questions.LEVEL_2_QUESTION_3_ANSWER_4);
                        correctAnswer = scanner.nextInt();
                        if (correctAnswer == 3) {
                            scoreTotal += Questions.LEVEL_2_QUESTION_3_SCORE;
                        }
                        else {
                            startGame = "NO";
                            nextLevel = false;
                        }
                        break;
                }
            }
            if (nextLevel){
                System.out.println("LEVEL 3. Choose your lucky number between 1 to 3:");
                questionNumber = scanner.nextInt();
                switch (questionNumber) {
                    case 1 :
                        System.out.println(Questions.LEVEL_3_QUESTION_1);
                        System.out.println("1: " + Questions.LEVEL_3_QUESTION_1_ANSWER_1);
                        System.out.println("2: " + Questions.LEVEL_3_QUESTION_1_ANSWER_2);
                        System.out.println("3: " + Questions.LEVEL_3_QUESTION_1_ANSWER_3);
                        System.out.println("4: " + Questions.LEVEL_3_QUESTION_1_ANSWER_4);
                        correctAnswer = scanner.nextInt();
                        if (correctAnswer == 2) {
                            scoreTotal += Questions.LEVEL_3_QUESTION_1_SCORE;
                        }
                        else {
                            startGame = "NO";
                            nextLevel = false;
                        }
                        break;
                    case 2 :
                        System.out.println(Questions.LEVEL_3_QUESTION_2);
                        System.out.println("1: " + Questions.LEVEL_3_QUESTION_2_ANSWER_1);
                        System.out.println("2: " + Questions.LEVEL_3_QUESTION_2_ANSWER_2);
                        System.out.println("3: " + Questions.LEVEL_3_QUESTION_2_ANSWER_3);
                        System.out.println("4: " + Questions.LEVEL_3_QUESTION_2_ANSWER_4);
                        correctAnswer = scanner.nextInt();
                        if (correctAnswer == 3) {
                            scoreTotal += Questions.LEVEL_3_QUESTION_2_SCORE;
                        }
                        else {
                            startGame = "NO";
                            nextLevel = false;
                        }
                        break;
                    case 3 :
                        System.out.println(Questions.LEVEL_3_QUESTION_3);
                        System.out.println("1: " + Questions.LEVEL_3_QUESTION_3_ANSWER_1);
                        System.out.println("2: " + Questions.LEVEL_3_QUESTION_3_ANSWER_2);
                        System.out.println("3: " + Questions.LEVEL_3_QUESTION_3_ANSWER_3);
                        System.out.println("4: " + Questions.LEVEL_3_QUESTION_3_ANSWER_4);
                        correctAnswer = scanner.nextInt();
                        if (correctAnswer == 1) {
                            scoreTotal += Questions.LEVEL_3_QUESTION_3_SCORE;
                        }
                        else {
                            startGame = "NO";
                            nextLevel = false;
                        }
                        break;
                }
            }
            System.out.println("You have " + scoreTotal + " points. Thank you!");
        }



    }
}
