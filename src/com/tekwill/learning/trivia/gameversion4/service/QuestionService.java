package com.tekwill.learning.trivia.gameversion4.service;

import com.tekwill.learning.trivia.gameversion4.domain.Question;
import com.tekwill.learning.trivia.gameversion4.repository.QuestionRepository;
import com.tekwill.learning.trivia.gameversion4.util.Shuffler;

public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question[] getQuestionsByLevel(int level) {
        return Shuffler.shuffleQuestions(questionRepository.findQuestionsByLevel(level));
    }

}
