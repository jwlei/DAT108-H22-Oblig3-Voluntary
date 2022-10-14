package ex3.initializer.task3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;


@Controller
public class FormController {

    @GetMapping(value = "/task3")
    public String getRegistrationForm(Model model,
                                      @CookieValue(name = "fnameCookie", required = false) String fnameCookie,
                                      @CookieValue(name = "lnameCookie", required = false) String lnameCookie) {
        /**
         * Create a new person object and add it to the model
         * if it does not already exist
         */
        if (fnameCookie == null && lnameCookie == null) {
            model.addAttribute("person", new Person());
        } else {
            model.addAttribute("person", new Person(URLDecoder.decode(fnameCookie, StandardCharsets.UTF_8), URLDecoder.decode(lnameCookie, StandardCharsets.UTF_8)));


            // Alternatively
            // If we haven't made a constructor in the Person class that takes in the fname and lname
            // model.addAttribute("fnameCookie", URLDecoder.decode(fnameCookie));
            // model.addAttribute("lnameCookie", URLDecoder.decode(lnameCookie));
        }
        return "task3-register";
    }

    @PostMapping(value = "/task3-submit")
    public String saveRegistration(@Valid @ModelAttribute("person") Person person,
                                   BindingResult bindingResult,
                                   RedirectAttributes ra,
                                   HttpServletResponse response) {


        if (bindingResult.hasErrors()) {
            // If any errors, redirect back to the form
            ra.addFlashAttribute("bindingResult", bindingResult);
            return "redirect:task3";

        } else {
            Cookie fnameCookie = new Cookie("fnameCookie", URLEncoder.encode(person.getFname(), StandardCharsets.UTF_8));
            Cookie lnameCookie = new Cookie("lnameCookie", URLEncoder.encode(person.getLname(), StandardCharsets.UTF_8));

            fnameCookie.setMaxAge(60 * 60 * 24 * 365);
            lnameCookie.setMaxAge(60 * 60 * 24 * 365);

            response.addCookie(fnameCookie);
            response.addCookie(lnameCookie);

            return "redirect:task3-validInput";
        }
    }

    @GetMapping(value = "/task3-validInput")
    public String showSuccess(@CookieValue(name = "fnameCookie", required = false) String lnameCookie,
                              @CookieValue(name = "lnameCookie", required = false) String fnameCookie,
                              Model model) {

        Person person = new Person(URLDecoder.decode(fnameCookie, StandardCharsets.UTF_8), URLDecoder.decode(lnameCookie, StandardCharsets.UTF_8));
        model.addAttribute("person", person);

        return "task3-confirmation";
    }

    @GetMapping(value = "/task3-clearCookies")
    public String clearCookies(HttpServletResponse response) {
        Cookie fnameCookie = new Cookie("fnameCookie", "");
        Cookie lnameCookie = new Cookie("lnameCookie", "");

        fnameCookie.setMaxAge(0);
        lnameCookie.setMaxAge(0);

        response.addCookie(fnameCookie);
        response.addCookie(lnameCookie);

        return "redirect:task3";
    }
}
