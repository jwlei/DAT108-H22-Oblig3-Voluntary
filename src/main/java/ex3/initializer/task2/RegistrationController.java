package ex3.initializer.task2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

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
    public String getRegistrationForm(Model model) {
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
    public String saveRegistration(@Valid @ModelAttribute("person") Person person,
                                   BindingResult bindingResult,
                                   RedirectAttributes ra,
                                   HttpSession session) {


        if (bindingResult.hasErrors()) {
            // If any errors, redirect back to the form
            System.out.println("\n\n -------------- ERROR -------------- \n\n");
            ra.addFlashAttribute("bindingResult", bindingResult);
            ra.addFlashAttribute("person", person);
            return "redirect:task2";
        } else {
            // If no errors, add the person to the redirect attributes
            // and save the person object to the session
            // and redirect to the confirmation page
            ra.addFlashAttribute("person", person);
            session.setAttribute("person", person);
            return "redirect:task2-validInput";
        }
    }

    @GetMapping(value = "/task2-validInput")
    public String showSuccess(HttpSession session) {
        /**
         * Get the person object from the session
         */
        session.getAttribute("person");

        return "task2-confirmation";
    }
}
