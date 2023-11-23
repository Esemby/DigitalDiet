package com.digitaldiet.database.model;

import org.springframework.data.annotation.Id;

public class Ingredient implements Identifiable {
	
	@Id
	private long id;
	private String name;
	private String description;
	private AmountUnit defaultUnit;
	private double pieceToKiloGramRatio;

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

	public AmountUnit getDefaultUnit() {
		return defaultUnit;
	}

	public void setDefaultUnit(AmountUnit defaultUnit) {
		this.defaultUnit = defaultUnit;
	}

	public double getPieceToKiloGramRatio() {
		return pieceToKiloGramRatio;
	}

	public void setPieceToKiloGramRatio(double pieceToKiloGramRatio) {
		this.pieceToKiloGramRatio = pieceToKiloGramRatio;
	}
	
	

	
}
