package ex3.initializer.task4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class VoteController {

    /**
     * This method is called when the user wants to vote for a fruit.
     *
     * @param session
     * @return the name of the view to be rendered
     */
    @GetMapping(value ="/task4")
    public String sendToJsp(HttpSession session) {

        FruitList fruitList = new FruitList();

        // Add fruitlist to session
        session.setAttribute("fruitList", fruitList);

        return "task4-vote";
    }

    @GetMapping(value ="/task4-voteAgain")
    public String sendToJspAgain() {

        return "task4-vote";
    }

    @PostMapping(value ="/task4-submit")
    public String saveRegistration(@RequestParam("fruit") String chosenAlternative,
                                   HttpSession session) {

        FruitList fruitList = (FruitList) session.getAttribute("fruitList");

        Fruit fruit = fruitList.findFruit(chosenAlternative);
        fruit.addVote();

        return "task4-voteResult";
    }
}

