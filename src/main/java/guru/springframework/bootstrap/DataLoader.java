package guru.springframework.bootstrap;

import guru.springframework.Repositories.CategoryRepository;
import guru.springframework.Repositories.RecipeRepository;
import guru.springframework.Repositories.UnitOfMeasureRepository;
import guru.springframework.domain.Category;
import guru.springframework.domain.Ingredient;
import guru.springframework.domain.Recipe;
import guru.springframework.domain.UnitOfMeasure;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Doa on 24-6-2019.
 */
public class DataLoader implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final RecipeRepository recipeRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public DataLoader(CategoryRepository categoryRepository, RecipeRepository recipeRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.recipeRepository = recipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public void run(String... args) {
        LoadData();
    }

    private void LoadData() {

        UnitOfMeasure unit = unitOfMeasureRepository.findByDescription("Unit").get();
        UnitOfMeasure teaSpoon = unitOfMeasureRepository.findByDescription("TeaSpoon").get();


        Recipe perfectGuacamole = new Recipe();
        perfectGuacamole.setDescription("Guacamole, a dip made from avocados, is originally from Mexico. The name is derived from two Aztec Nahuatl words—ahuacatl (avocado) and molli (sauce).");
        perfectGuacamole.setPrepTime(10);

        Ingredient avocado = new Ingredient();
        avocado.setDescription("avocado");
        avocado.setAmount(new BigDecimal(2));
        avocado.setUom(unit);

        Ingredient kosherSalt = new Ingredient();
        kosherSalt.setDescription("Kosher Salt");
        kosherSalt.setAmount(new BigDecimal(0.5));
        kosherSalt.setUom(teaSpoon);

        Set<Ingredient> guacamoleIngredients = Collections.emptySet();
        guacamoleIngredients.add(avocado);
        guacamoleIngredients.add(kosherSalt);

        perfectGuacamole.setIngredients(guacamoleIngredients);









    }
}
