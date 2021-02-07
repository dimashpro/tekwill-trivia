package com.tekwill.learning.trivia.gameversion5.service;

import com.tekwill.learning.trivia.gameversion5.domain.Question;
import com.tekwill.learning.trivia.gameversion5.repository.QuestionRepository;

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
