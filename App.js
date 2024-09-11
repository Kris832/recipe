// App.js

import React, { useState } from 'react';
import RecipeList from './components/RecipeList';
import RecipeGenerator from './components/RecipeGenerator';
import './App.css';

const App = () => {
  const [recipes, setRecipes] = useState([
    { id: 1, name: "Paneer Butter Masala", ingredients: ["Paneer", "Butter", "Spices"], steps: "Cook paneer with butter and spices." },
    { id: 2, name: "Aloo Paratha", ingredients: ["Potato", "Flour", "Spices"], steps: "Cook potato with flour and spices." },
    // Add more pre-uploaded recipes here
  ]);

  const addGeneratedRecipe = (newRecipe) => {
    setRecipes([...recipes, newRecipe]);
  };

  return (
    <div className="App">
      <h1>Recipe Sharing Website</h1>
      <RecipeList recipes={recipes} />
      <RecipeGenerator addRecipe={addGeneratedRecipe} />
    </div>
  );
};

export default App;

