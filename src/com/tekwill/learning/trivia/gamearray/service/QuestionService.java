package com.tekwill.learning.trivia.gamearray.service;

import com.tekwill.learning.trivia.gamearray.domain.Question;
import com.tekwill.learning.trivia.gamearray.repository.QuestionRepository;
import com.tekwill.learning.trivia.gamearray.util.Shuffler;

public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question[] getQuestionsByLevel(int level) {
        return Shuffler.shuffleQuestions(questionRepository.findQuestionsByLevel(level));
    }

}
