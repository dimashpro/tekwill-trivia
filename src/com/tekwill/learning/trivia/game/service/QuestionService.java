package com.tekwill.learning.trivia.game.service;

import com.tekwill.learning.trivia.game.domain.Question;
import com.tekwill.learning.trivia.game.repository.QuestionRepository;

import java.util.Collections;
import java.util.List;

public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestionsByLevel(int level) {
        List<Question> questionsByLevel = questionRepository.findQuestionsByLevel(level);
        Collections.shuffle(questionsByLevel);
        return questionsByLevel;
    }

}
