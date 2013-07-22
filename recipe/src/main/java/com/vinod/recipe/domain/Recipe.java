package com.vinod.recipe.domain;

public class Recipe {
	String title;
	String description;
	String submittedBy;
	RecipeType recipeType;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSubmittedBy() {
		return submittedBy;
	}
	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}
	public RecipeType getRecipeType() {
		return recipeType;
	}
	public void setRecipeType(String recipeType) {
		if(recipeType.equals("VEG"))
			this.recipeType = RecipeType.VEG;
		else
			this.recipeType = RecipeType.NONVEG;
		
	}
}
