package com.digitaldiet.database.model;

public class TestIngredients {

	public static Ingredient Tomato() {
		Ingredient ingredient = new Ingredient();
		ingredient.setId(420);
		ingredient.setName("Tomato");
		ingredient.setDescription("Round, red and juicy berry");
		ingredient.setDefaultUnit(AmountUnit.Pieces);
		ingredient.setPieceToKiloGramRatio(0.180);
		return ingredient;
	}
	
	public static Ingredient Potato() {
		Ingredient ingredient = new Ingredient();
		ingredient.setId(69);
		ingredient.setName("Potato");
		ingredient.setDescription("Round, yellow and firm");
		ingredient.setDefaultUnit(AmountUnit.Pieces);
		ingredient.setPieceToKiloGramRatio(0.210);
		return ingredient;
	}
	
	public static Ingredient BellPepper() {
		Ingredient ingredient = new Ingredient();
		ingredient.setId(1337);
		ingredient.setName("Bell Pepper");
		ingredient.setDescription("Kind of round, red and firm");
		ingredient.setDefaultUnit(AmountUnit.Pieces);
		ingredient.setPieceToKiloGramRatio(0.150);
		return ingredient;
	}
}
