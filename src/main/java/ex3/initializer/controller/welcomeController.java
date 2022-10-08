package ex3.initializer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

public class welcomeController {
    @RequestMapping(value = "/")
    public RedirectView home() {
        /*
         * Redirect to the index page
         */
        return new RedirectView("/index.html");
    }
}
