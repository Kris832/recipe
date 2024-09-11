package com.recipesharingapp.RecipeSharing.controller;

import com.example.recipe.model.Recipe;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AIRecipeGenerator {

    public Recipe generateRecipe(String recipeName) {
        long id = new Random().nextLong();
        String[] ingredients = {"Generated Ingredient 1", "Generated Ingredient 2", "Generated Ingredient 3"};
        String steps = "Follow these generated steps for the recipe.";

        return new Recipe(id, recipeName, ingredients, steps);
    }
}
