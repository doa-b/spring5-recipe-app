package guru.springframework.Services;

import guru.springframework.Repositories.RecipeRepository;
import guru.springframework.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by Doa on 24-6-2019.
 */
@Service
public class RecipesService {

    private RecipeRepository recipeRepository;

    public RecipesService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Iterable<Recipe> getAllrecipies () {
        return recipeRepository.findAll();
    }
}
