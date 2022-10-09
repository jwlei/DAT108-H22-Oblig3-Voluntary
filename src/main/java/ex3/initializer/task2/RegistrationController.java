package ex3.initializer.task2;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping(value ="/task2")
    public String sendToJsp(Model model) {
        if (!model.containsAttribute("person")) {
            model.addAttribute("person", new Person());
        }
        return "task2-register";
    }

    @PostMapping(value ="/task2-submit")
    public String saveRegistration(@Valid @ModelAttribute Person person,
                                   RedirectAttributes ra,
                                   BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "redirect:/task2-register";
        } else {
            ra.addFlashAttribute("person", person);
            return "redirect:/task2-success";

        }
    }

    @GetMapping(value ="/task2-success")
    public String showSuccess(Model model, HttpServletRequest request) {
        Map<String, ?> inputFlashMap = RequestContextUtils.getInputFlashMap(request);
        if (inputFlashMap != null) {
            model.addAttribute("person", inputFlashMap.get("person"));
        }
        return "task2-confirmation";
    }

    @PostMapping(value="validate")
    ResponseEntity<String> validate(@Valid @RequestBody Person person) {
        return ResponseEntity.ok("valid");
    }

    @GetMapping("/task-2-savedPerson")
    public String receiveRegistration() {
        return "task2-confirmation";
    }
}
