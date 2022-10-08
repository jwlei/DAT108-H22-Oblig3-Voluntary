package ex3.initializer.task1;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class helloController {

    @RequestMapping
    @GetMapping(value = "/task1", produces = "text/plain")
    @ResponseBody //Betyr at responsen er direkte fra returverdien herfra.
    public String siHallo(@RequestParam String name, Model model) {

        model.addAttribute("name", name);
        return "task1-response";
    }
}
