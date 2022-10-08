package ex3.initializer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

public class errorController {

    @RequestMapping("/error")
    @ResponseBody
    public RedirectView getErrorPath() {
        /*
         * Create an error page with a redirect to the index page
         */
        return new RedirectView("/error.html");
    }
}
