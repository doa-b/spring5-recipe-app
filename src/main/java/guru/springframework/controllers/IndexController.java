package guru.springframework.controllers;

import guru.springframework.Repositories.CategoryRepository;
import guru.springframework.Repositories.UnitOfMeasureRepository;
import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by Doa on 29-5-2019.
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<Category> categoryOptional2 = categoryRepository.findByDescriptionContaining("Ame");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
