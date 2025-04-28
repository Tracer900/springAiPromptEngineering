package se.ingmantech.springaipromptengineering.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se.ingmantech.springaipromptengineering.model.Answer;
import se.ingmantech.springaipromptengineering.model.Question;
import se.ingmantech.springaipromptengineering.service.OpenAiService;

@RestController
public class PromptController {
    private final OpenAiService openAiService;

    public PromptController(OpenAiService openAiService) {
        this.openAiService = openAiService;
    }

    @PostMapping("/ask")
    public Answer getAnswer(@RequestBody Question question) {
        return openAiService.hamtaSvar(question);
    }
}
