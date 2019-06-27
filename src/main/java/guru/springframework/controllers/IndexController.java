package guru.springframework.controllers;

import guru.springframework.Services.RecipesServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Doa on 29-5-2019.
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipesServiceImpl recipesServiceImpl;

    public IndexController(RecipesServiceImpl recipesServiceImpl) {
        this.recipesServiceImpl = recipesServiceImpl;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        log.debug("Requestmapping is passing the model to index page");

        model.addAttribute("recipes", recipesServiceImpl.getRecipes());

        return "index";
    }
}
