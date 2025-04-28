package se.ingmantech.springaipromptengineering.service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;
import se.ingmantech.springaipromptengineering.model.Answer;
import se.ingmantech.springaipromptengineering.model.Question;

@Service
public class OpenAiServiceImpl implements OpenAiService {

    private final ChatModel chatModel;

    public OpenAiServiceImpl(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @Override
    public Answer hamtaSvar(Question question) {
        PromptTemplate promptTemplate = new PromptTemplate(question.question());
        Prompt prompt = promptTemplate.create();

        ChatResponse response = chatModel.call(prompt);

        logCall();
        return new Answer(response.getResult().getOutput().getText());
    }

    private void logCall() {
        System.out.println("Tjänsten har blivit anropad.");
    }
}
