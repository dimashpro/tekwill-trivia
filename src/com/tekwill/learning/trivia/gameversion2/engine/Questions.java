package com.tekwill.learning.trivia.gameversion2.engine;

import com.tekwill.learning.trivia.gameversion2.domain.Answer;
import com.tekwill.learning.trivia.gameversion2.domain.Question;

public class Questions {

    public static Question LEVEL_1_QUESTION_1 = new Question(100, 1, "Which of these cities is the capital of the Republic of Moldova?",
            new Answer("Rome", false, "A"),
            new Answer("Vienna", false, "B"),
            new Answer("Chisinau", true, "C"),
            new Answer("Monaco", false, "D"));

    public static Question LEVEL_1_QUESTION_2 = new Question(150, 1, "Who composed the masterpiece \"Luceafarul\"?",
            new Answer("Shakespeare", false, "A"),
            new Answer("Eminescu", true, "B"),
            new Answer("Pushkin", false, "C"),
            new Answer("Alighieri", false, "D"));

    public static Question LEVEL_2_QUESTION_1 = new Question(200, 2, "What is the most useful platform to study the Java programming language?",
            new Answer("Facebook", false, "A"),
            new Answer("Instagram", true, "B"),
            new Answer("Tik Tok", false, "C"),
            new Answer("docs.oracle.com/en/java/", false, "D"));

    public static Question LEVEL_2_QUESTION_2 = new Question(250, 2, "Which of these is NOT an non-access modifier?",
            new Answer("abstract", true, "A"),
            new Answer("private", false, "B"),
            new Answer("static", false, "C"),
            new Answer("final", false, "D"));

    public static Question LEVEL_3_QUESTION_1 = new Question(300, 3, "Who brings the better gifts on the Christmas?",
            new Answer("Santa Claus", true, "A"),
            new Answer("Mos Craciun", false, "B"),
            new Answer("Ded Moroz", false, "C"),
            new Answer("Snegurocika", false, "D"));
}
