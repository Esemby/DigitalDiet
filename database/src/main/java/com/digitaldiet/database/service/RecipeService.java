package com.digitaldiet.database.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.digitaldiet.database.model.AmountUnit;
import com.digitaldiet.database.model.Ingredient;
import com.digitaldiet.database.model.Recipe;

import javafx.util.Pair;

@Service
public class RecipeService {

	public Map<Ingredient,Pair<AmountUnit,Double>> compileShoppingList(Set<Recipe> recipes){
		Map<Ingredient,Pair<AmountUnit,Double>> shoppingList = new HashMap<Ingredient, Pair<AmountUnit,Double>>();
		for (Recipe recipe : recipes) {
			for (Entry<Ingredient, Pair<AmountUnit, Double>> entry : recipe.getListOfIngredients().entrySet()) {
				//add entry to shopping list
				Ingredient ingredient = entry.getKey();
				Pair<AmountUnit, Double> pair = entry.getValue();
				AmountUnit unit = pair.getKey();
				Double amount = pair.getValue();
				shoppingList.computeIfPresent(ingredient, (key,value) -> {
					AmountUnit listUnit = value.getKey();
					Double listAmount = value.getValue();
					return null;
				});
			}
		}
		return shoppingList;
	}
}
