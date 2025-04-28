package se.ingmantech.springaipromptengineering.service;

import se.ingmantech.springaipromptengineering.model.Answer;
import se.ingmantech.springaipromptengineering.model.Question;

public interface OpenAiService {
    Answer hamtaSvar(Question question);
}
