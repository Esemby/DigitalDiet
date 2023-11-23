package com.digitaldiet.database.model;

import java.util.Map;

import org.springframework.data.annotation.Id;

import javafx.util.Pair;

public class Recipe implements Identifiable{
	
	@Id
	private long id;
	private String name;
	private String description;
	private Map<Ingredient, Pair<AmountUnit,Double>> listOfIngredients;
	
	@Override
	public long getId() {
		return id;
	}
	@Override
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Map<Ingredient, Pair<AmountUnit,Double>> getListOfIngredients() {
		return listOfIngredients;
	}
	public void setListOfIngredients(Map<Ingredient, Pair<AmountUnit,Double>> listOfIngredients) {
		this.listOfIngredients = listOfIngredients;
	}
}
