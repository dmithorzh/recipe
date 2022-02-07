package com.yorik.recipe.services;

import java.util.Set;

public interface IngredientsService<Ingredient, Long> {

    Set<Ingredient> findAll();

    Ingredient findById(Long id);

    Ingredient save(Ingredient object);

    void delete(Ingredient object);

    void deleteById(Long id);


}
