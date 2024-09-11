package com.example.recipe.service;

import com.example.recipe.model.Recipe;
import com.example.recipe.repository.RecipeRepository;
import com.example.recipe.util.AIRecipeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private AIRecipeGenerator aiRecipeGenerator;

    public List<Recipe> getAllRecipes() {
        return recipeRepository.getAllRecipes();
    }

    public Recipe generateRecipe(String recipeName) {
        return aiRecipeGenerator.generateRecipe(recipeName);
    }

    public void addRecipe(Recipe recipe) {
        recipeRepository.addRecipe(recipe);
    }
}
