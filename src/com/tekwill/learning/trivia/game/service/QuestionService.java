package com.tekwill.learning.trivia.game.service;

import com.tekwill.learning.trivia.game.domain.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestionsByLevel(int level);
}
