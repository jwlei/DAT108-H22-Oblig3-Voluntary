package ex3.initializer.task1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingsController {

    @GetMapping("/task1-greeting")
    public String greetings(@RequestParam(name = "name") String name, Model model)  {
        model.addAttribute("name", new Name(name));

        return "task1-greeting";
    }
}
