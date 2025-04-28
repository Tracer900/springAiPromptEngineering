package se.ingmantech.springaipromptengineering;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.ingmantech.springaipromptengineering.model.Question;
import se.ingmantech.springaipromptengineering.service.OpenAiService;

@SpringBootTest
public class ClearInstructionsTest {

    @Autowired
    OpenAiService openAiService;

    @Test
    void getJsonFormatTest() {
        String question = """
                Generate a list of 4 made up cars. Provide them in a JSON format
                with the following attributes: make, model, year, and color. Return the JSON string.
                """;

        var result = openAiService.hamtaSvar(new Question(question));

        System.out.println(result.answer());
    }

    @Test
    void getXmlFormat() {
        String question = """
                Generate a list of 4 made up cars. Provide them in a XML format
                with the following attributes: make, model, year, and color. Return the XML string.
                """;

        var result = openAiService.hamtaSvar(new Question(question));

        System.out.println(result.answer());
    }
}
