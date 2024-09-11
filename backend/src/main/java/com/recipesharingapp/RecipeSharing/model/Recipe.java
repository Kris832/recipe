package com.recipesharingapp.RecipeSharing.model;

import lombok.Data;

@Data
public class Recipe {
    private long id;
    private String name;
    private String[] ingredients;
    private String steps;

    public Recipe(long id, String name, String[] ingredients, String steps) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
    }
}
