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

    String language = header.entrySet().stream()
            .filter(e -> e.getKey().equals("accept-language"))
            .map((Map.Entry<String, String> e) -> String.format("Requested language from the header was: '%s' = %s", e.getKey(), e.getValue()))
            .collect(Collectors.joining("\n"));

        model.addAttribute("accepted_lang", language);
        model.addAttribute("name", new Name(name));

        return "task1-greeting";
    }
}
