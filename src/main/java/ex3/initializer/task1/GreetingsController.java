package ex3.initializer.task1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class GreetingsController {

    /**
     * Default language is GERMAN
     * de-DE, en-GB, nb-NO supported
     */

    @GetMapping(value = "/task1-greeting", produces = "text/plain")
    public String greetings(Model model, @RequestParam(name = "name") String name, @RequestHeader Map<String, String> header) {
        /**
         * Get the locale from the header
         */

    String language = header.entrySet().stream()
            .filter(e -> e.getKey().equals("accept-language"))
            .map((Map.Entry<String, String> e) -> String.format("Requested language from the header was: '%s' = %s", e.getKey(), e.getValue()))
            .collect(Collectors.joining("\n"));

        // Set the language to the model
        model.addAttribute("accepted_lang", language);
        // Set the name to the model and print in language from header
        model.addAttribute("name", new Name(name));

        return "task1-greeting";
    }
}
