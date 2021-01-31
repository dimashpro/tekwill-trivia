package com.tekwill.learning.trivia.gameversion4.repository;

import com.tekwill.learning.trivia.gameversion4.domain.Answer;
import com.tekwill.learning.trivia.gameversion4.domain.Question;

public class QuestionRepository {
    public Question[] questions = new Question[]{
            new Question(100, 1, "Which of these cities is the capital of the Republic of Moldova?",
                    new Answer[]{
                            new Answer("Rome", false, "A"), new Answer("Vienna", false, "B"),
                            new Answer("Chisinau", true, "C"), new Answer("Monaco", false, "D")}),

            new Question(100, 1, "Who composed the masterpiece \"Luceafarul\"?",
                    new Answer[]{
                            new Answer("Shakespeare", false, "A"), new Answer("Eminescu", true, "B"),
                            new Answer("Pushkin", false, "C"), new Answer("Alighieri", false, "D")}),

            new Question(100, 1, "What is the most dangerous breed of dog?",
                    new Answer[]{
                            new Answer("chi hua hua", false, "A"), new Answer("doberman", false, "B"),
                            new Answer("pit bull", true, "C"), new Answer("vasea bolea", false, "D")}),

            new Question(250, 2, "What is the most useful platform to study the Java programming language?",
                    new Answer[]{
                            new Answer("Facebook", false, "A"), new Answer("Instagram", false, "B"),
                            new Answer("Tik Tok", false, "C"), new Answer("docs.oracle.com/en/java/", true, "D")}),

            new Question(250, 2, "Which of these is NOT an non-access modifier?",
                    new Answer[]{
                            new Answer("abstract", true, "A"), new Answer("private", false, "B"),
                            new Answer("static", false, "C"), new Answer("final", false, "D")}),

            new Question(250, 2, "Which of these is NOT a feature and component of Java?",
                    new Answer[]{
                            new Answer("encapsulation", false, "A"), new Answer("platform independence", false, "B"),
                            new Answer("drinking beer", true, "C"), new Answer("object orientation", false, "D")}),

            new Question(350, 3, "Who brings the better gifts on the Christmas?",
                    new Answer[]{
                            new Answer("Santa Claus", false, "A"), new Answer("Mos Craciun", true, "B"),
                            new Answer("Ded Moroz", false, "C"), new Answer("Snegurocika", false, "D")}),

            new Question(350, 3, "Where are stored object reference variables??",
                    new Answer[]{
                            new Answer("Stack memory", false, "A"), new Answer("In brain", false, "B"),
                            new Answer("Heap memory", true, "C"), new Answer("On the roof", false, "D")}),

            new Question(350, 3, "Which of these data types have smallest size?",
                    new Answer[]{
                            new Answer("byte", true, "A"), new Answer("short", false, "B"),
                            new Answer("int", false, "C"), new Answer("long", false, "D")}),

    };


    public Question[] findQuestionsByLevel(int level) {
        int resultSize = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getLevel() == level)
                resultSize++;
        }
        Question[] result = new Question[resultSize];
        for (int i = 0, j = 0; i < questions.length; i++) {
            if (questions[i].getLevel() == level)
                result[j++] = questions[i];
        }
        return result;
    }
}
