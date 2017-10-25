package br.com.andrei.services;

import java.util.Set;

import br.com.andrei.commands.RecipeCommand;
import br.com.andrei.domain.Recipe;


public interface RecipeService {

	Set<Recipe> getRecipes();

	Recipe findById(Long id);
	
	void deleteById(Long id);

	RecipeCommand findCommandById(Long id);
	
	RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
	
}
