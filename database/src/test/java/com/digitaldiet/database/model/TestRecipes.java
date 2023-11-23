package com.digitaldiet.database.model;

import static com.digitaldiet.database.model.TestIngredients.BellPepper;
import static com.digitaldiet.database.model.TestIngredients.Potato;
import static com.digitaldiet.database.model.TestIngredients.Tomato;

import java.util.HashMap;
import java.util.Map;

import javafx.util.Pair;

public class TestRecipes {
	
	public static Recipe RedSalad() {
		Recipe recipe = new Recipe();
		recipe.setId(1234);
		recipe.setName("Red salad");
		recipe.setDescription("Salad consisting of red things");
		Map<Ingredient, Pair<AmountUnit, Double>> ingredients = new HashMap<Ingredient, Pair<AmountUnit, Double>>();
		ingredients.put(Tomato(), new Pair<AmountUnit,Double>(AmountUnit.Pieces, 2.0));
		ingredients.put(BellPepper(), new Pair<AmountUnit,Double>(AmountUnit.Pieces, 2.0));
		recipe.setListOfIngredients(ingredients);
		return recipe;
	}	

	public static Recipe AllSalad() {
		Recipe recipe = new Recipe();
		recipe.setId(1234);
		recipe.setName("All salad");
		recipe.setDescription("Salad consisting of all test things");
		Map<Ingredient, Pair<AmountUnit, Double>> ingredients = new HashMap<Ingredient, Pair<AmountUnit, Double>>();
		ingredients.put(Tomato(), new Pair<AmountUnit,Double>(AmountUnit.Pieces, 3.0));
		ingredients.put(BellPepper(), new Pair<AmountUnit,Double>(AmountUnit.Pieces, 2.0));
		ingredients.put(Potato(), new Pair<AmountUnit,Double>(AmountUnit.Pieces, 1.0));
		recipe.setListOfIngredients(ingredients);
		return recipe;
	}

	public static Recipe PotatoSalad() {
		Recipe recipe = new Recipe();
		recipe.setId(1234);
		recipe.setName("Potato salad");
		recipe.setDescription("Lots of potatos");
		Map<Ingredient, Pair<AmountUnit, Double>> ingredients = new HashMap<Ingredient, Pair<AmountUnit, Double>>();
		ingredients.put(Potato(), new Pair<AmountUnit,Double>(AmountUnit.Pieces, 1.0));
		recipe.setListOfIngredients(ingredients);
		return recipe;
	}
}
