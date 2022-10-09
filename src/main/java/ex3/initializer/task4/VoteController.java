package ex3.initializer.task4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class VoteController {

    @GetMapping(value ="/task4")
    public String sendToJsp(Model model, HttpServletRequest request) {

       // TODO 1: Get the map from the request

        return "task4-vote";
    }

    @PostMapping(value ="/task4-submit")
    public String saveRegistration(@RequestParam("radioButtons") String chosenAlternative,
                                   @ModelAttribute("vote") Fruit fruit,
                                   RedirectAttributes ra) {

        // TODO 2: Add a vote to the chosen alternative

        ra.addFlashAttribute("vote", chosenAlternative);
            return "redirect:/task4-success";
    }

    @GetMapping(value ="/task4-success")
    public String showSuccess(Model model, HttpServletRequest request) {

        // TODO 3: Send the persistent data to the jsp, session maybe?
        // When we return from the voteRegistered screen to vote again the vote count
        // should persist

        Map<?, ?> inputFlashMap = RequestContextUtils.getInputFlashMap(request);
        if (inputFlashMap != null) {
            model.addAttribute("vote", inputFlashMap.get("vote"));
        }
        return "task4-voteRegistered";
    }
}

