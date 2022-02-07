package com.yorik.recipe.controllers;

import com.yorik.recipe.domain.Category;
import com.yorik.recipe.domain.UnitOfMeasure;
import com.yorik.recipe.repositories.CategoryRepository;
import com.yorik.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class RecipeIndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public RecipeIndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @RequestMapping({"","/","dog"})
    public String index () {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat id is " + categoryOptional.get().getId());
        System.out.println("Uom id is " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
