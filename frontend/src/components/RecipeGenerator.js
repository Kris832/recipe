// components/RecipeGenerator.js

import React, { useState } from 'react';

const RecipeGenerator = ({ addRecipe }) => {
  const [recipeName, setRecipeName] = useState('');
  const [generatedRecipe, setGeneratedRecipe] = useState(null);

  const handleGenerate = () => {
    // Simulate AI recipe generation
    const newRecipe = {
      id: Math.floor(Math.random() * 1000),
      name: recipeName,
      ingredients: ["Generated Ingredient 1", "Generated Ingredient 2"],
      steps: "Follow generated steps for the recipe."
    };
    setGeneratedRecipe(newRecipe);
  };

  const handleAddRecipe = () => {
    if (generatedRecipe) {
      addRecipe(generatedRecipe);
      setRecipeName('');
      setGeneratedRecipe(null);
    }
  };

  return (
    <div className="recipe-generator">
      <h2>Generate a Recipe</h2>
      <input 
        type="text" 
        value={recipeName}
        onChange={(e) => setRecipeName(e.target.value)}
        placeholder="Enter recipe name" 
      />
      <button onClick={handleGenerate}>Generate Recipe</button>

      {generatedRecipe && (
        <div className="generated-recipe">
          <h3>{generatedRecipe.name}</h3>
          <p><strong>Ingredients:</strong> {generatedRecipe.ingredients.join(', ')}</p>
          <p><strong>Steps:</strong> {generatedRecipe.steps}</p>
          <button onClick={handleAddRecipe}>Add to Recipe List</button>
        </div>
      )}
    </div>
  );
};

export default RecipeGenerator;

