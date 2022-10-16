package ex3.initializer.task4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class VoteController {

    /**
     * On first entry, create a new FruitList and add it to the session.
     * @param session
     * @return the name of the view to be rendered
     */
    @GetMapping(value ="/task4")
    public String getVoteForm(HttpSession session) {

        // Check if the session already contains a FruitList
        // If not, create a new FruitList and add it to the session
        if (session.getAttribute("fruitList") == null) {
            FruitList fruitList = new FruitList();
            session.setAttribute("fruitList", fruitList);
        }

        return "task4-vote";
    }


    /**
     * On POST, get the fruitList from the session, find the fruit and add a vote.
     * @param chosenAlternative
     * @param session
     * @return
     */
    @PostMapping(value ="/task4-submit")
    public String submittedVote(@RequestParam("fruit") String chosenAlternative,
                                HttpSession session) {

        // Get the FruitList from the session
        FruitList fruitList = (FruitList) session.getAttribute("fruitList");

        // Find the fruit and add a vote
        Fruit fruit = fruitList.findFruit(chosenAlternative);
        fruit.addVote();

        return "task4-voteResult";
    }
}

