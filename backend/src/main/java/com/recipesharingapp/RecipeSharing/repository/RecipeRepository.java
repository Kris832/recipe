package com.recipesharingapp.RecipeSharing.repository;

import com.example.recipe.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {

    private final List<Recipe> recipeList = new ArrayList<>();

    public RecipeRepository() {
        // Pre-uploaded recipes
        recipeList.add(new Recipe(1, "Paneer Butter Masala", new String[]{"Paneer", "Butter", "Spices"}, "Cook paneer with butter and spices."));
        recipeList.add(new Recipe(2, "Chicken Biryani", new String[]{"Chicken", "Rice", "Spices"}, "Cook rice with chicken and spices."));
    }

    public List<Recipe> getAllRecipes() {
        return recipeList;
    }

    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }
}
