// components/RecipeList.js

import React from 'react';

const RecipeList = ({ recipes }) => {
  return (
    <div className="recipe-list">
      <h2>Available Recipes</h2>
      <ul>
        {recipes.map(recipe => (
          <li key={recipe.id}>
            <h3>{recipe.name}</h3>
            <p><strong>Ingredients:</strong> {recipe.ingredients.join(', ')}</p>
            <p><strong>Steps:</strong> {recipe.steps}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default RecipeList;

