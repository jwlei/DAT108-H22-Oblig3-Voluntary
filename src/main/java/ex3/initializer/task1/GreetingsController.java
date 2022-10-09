package ex3.initializer.task1;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class GreetingsController {

    @GetMapping(value = "/task1-greeting", produces = "text/plain")
    public String greetings(Model model, @RequestParam(name = "name") String name, @RequestHeader Map<String, String> headers)  {

        String header = headers.entrySet().stream()
                .filter(e -> e.getKey().equals(HttpHeaders.ACCEPT_LANGUAGE))
                .map((Map.Entry<String, String> e) -> String.format("Header '%s' = %s", e.getKey(), e.getValue()))
                .collect(Collectors.joining("\n"));

        model.addAttribute("name", new Name(name));
        model.addAttribute("header", header);

        return "task1-greeting";
    }
}
