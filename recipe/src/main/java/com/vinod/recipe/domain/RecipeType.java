package com.vinod.recipe.domain;

public enum RecipeType {
	VEG(0),
	NONVEG(1),
	UNKNOWN(-1);
	
	int type;
	private RecipeType(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}
}
