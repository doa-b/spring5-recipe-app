package guru.springframework.controllers;

import guru.springframework.Services.RecipesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Doa on 29-5-2019.
 */
@Controller
public class IndexController {

    private final RecipesServiceImpl recipesServiceImpl;

    public IndexController(RecipesServiceImpl recipesServiceImpl) {
        this.recipesServiceImpl = recipesServiceImpl;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){


        model.addAttribute("recipes", recipesServiceImpl.getRecipes());

        return "index";
    }
}
