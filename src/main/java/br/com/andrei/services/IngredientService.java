package br.com.andrei.services;

import br.com.andrei.commands.IngredientCommand;

public interface IngredientService {

	IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
	
	IngredientCommand saveIngredientCommand(IngredientCommand ingredientCommand);
	
	void deleteById(Long recipeId, Long ingredientId);
}
