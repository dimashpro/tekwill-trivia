package com.tekwill.learning.trivia.gameversion5.repository;

import com.tekwill.learning.trivia.gameversion5.domain.Answer;
import com.tekwill.learning.trivia.gameversion5.domain.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionRepository {
    public List<Question> questions = new ArrayList<>(Arrays.asList(
            new Question(100, 1, "Which of these cities is the capital of the Republic of Moldova?",
                    Arrays.asList(new Answer("Rome", false, "A"), new Answer("Vienna", false, "B"),
                            new Answer("Chisinau", true, "C"), new Answer("Monaco", false, "D"))),

            new Question(100, 1, "Who composed the masterpiece \"Luceafarul\"?",
                    Arrays.asList(new Answer("Shakespeare", false, "A"), new Answer("Eminescu", true, "B"),
                            new Answer("Pushkin", false, "C"), new Answer("Alighieri", false, "D"))),

            new Question(100, 1, "What is the most dangerous breed of dog?",
                    Arrays.asList(new Answer("chi hua hua", false, "A"), new Answer("doberman", false, "B"),
                            new Answer("pit bull", true, "C"), new Answer("vasea bolea", false, "D"))),

            new Question(250, 2, "What is the most useful platform to study the Java programming language?",
                    Arrays.asList(new Answer("Facebook", false, "A"), new Answer("Instagram", false, "B"),
                            new Answer("Tik Tok", false, "C"), new Answer("docs.oracle.com/en/java/", true, "D"))),

            new Question(250, 2, "Which of these is NOT an non-access modifier?",
                    Arrays.asList(new Answer("abstract", false, "A"), new Answer("private", true, "B"),
                            new Answer("static", false, "C"), new Answer("final", false, "D"))),

            new Question(250, 2, "Which of these is NOT a feature and component of Java?",
                    Arrays.asList(new Answer("encapsulation", false, "A"), new Answer("platform independence", true, "B"),
                            new Answer("drinking beer", true, "C"), new Answer("object orientation", false, "D"))),

            new Question(350, 3, "Where is the heart of the shrimp situated?",
                    Arrays.asList(new Answer("In the head", false, "A"), new Answer("In the shoulder", true, "B"),
                            new Answer("In the foot", false, "C"), new Answer("In the solpa", false, "D"))),

            new Question(350, 3, "Where is the heart of the bimbo located?",
                    Arrays.asList(new Answer("In the bead", false, "A"), new Answer("In the boulder", true, "B"),
                            new Answer("In the boot", false, "C"), new Answer("In the dolpa", false, "D")))));


    public List<Question> findQuestionsByLevel(int level) {
        List<Question> result = new ArrayList<>();
        for (int i = 0, j = 0; i < questions.size(); i++) {
            if (questions.get(i).getLevel() == level)
                result.add(questions.get(i));
        }
        return result;
    }
}
