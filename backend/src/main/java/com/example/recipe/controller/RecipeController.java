package com.example.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.recipe.model.Recipe;
import com.example.recipe.service.RecipeService;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
@CrossOrigin(origins = "*") // Allow all origins (for frontend integration)
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @PostMapping("/generate")
    public Recipe generateRecipe(@RequestBody String recipeName) {
        return recipeService.generateRecipe(recipeName);
    }

    @PostMapping("/add")
    public void addRecipe(@RequestBody Recipe recipe) {
        recipeService.addRecipe(recipe);
    }
}
