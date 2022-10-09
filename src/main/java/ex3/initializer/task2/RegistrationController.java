package ex3.initializer.task2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        /**
         * Disallow other fields than below
         * for security reasons
         */
        binder.setAllowedFields("fname", "lname", "year", "areaCode", "phone", "email");
    }

    @GetMapping(value ="/task2")
    public String sendToJsp(Model model) {
        /**
         * Create a new person object and add it to the model
         * if it does not already exist
         */
        if (!model.containsAttribute("person")) {
            model.addAttribute("person", new Person());
        }
        return "task2-register";
    }

    @PostMapping(value ="/task2-submit")
    public String saveRegistration(@Valid @ModelAttribute Person person,
                                   BindingResult bindingResult,
                                   RedirectAttributes ra) {
        /**
         * Check if there are any errors
         * If there are errors, redirect back to the form
         * If there are no errors, add the person to the redirect attributes
         * and redirect to the confirmation page
         */


        if (bindingResult.hasErrors()) {
            ra.addFlashAttribute("person", person);
            return "redirect:/task2";
        } else {
            ra.addFlashAttribute("person", person);
            return "redirect:/task2-success";

        }
    }

    @GetMapping(value ="/task2-success")
    public String showSuccess(Model model, HttpServletRequest request) {
        /**
         * Get the person object from the redirect attributes
         * and add it to the model
         */
        Map<?, ?> inputFlashMap = RequestContextUtils.getInputFlashMap(request);
        if (inputFlashMap != null) {
            model.addAttribute("person", inputFlashMap.get("person"));
        }
        return "task2-confirmation";
    }

    @GetMapping("/task-2-savedPerson")
    public String receiveRegistration() {
        return "task2-confirmation";
    }
}
