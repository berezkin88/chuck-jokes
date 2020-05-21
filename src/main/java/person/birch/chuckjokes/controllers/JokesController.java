package person.birch.chuckjokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import person.birch.chuckjokes.services.JokesService;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.getRandomJoke());

        return "chucknorris";
    }
}
