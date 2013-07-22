package com.vinod.recipe.dao;

import javax.sql.DataSource;

import com.vinod.recipe.domain.Recipe;

public interface IRecipeDao {
	public void setDataSource(DataSource ds);
	
	public void create(String title, String description, String submittedBy, String type);
	
	public Recipe getRecipe(Integer id);
	
	public void delete(Integer id);
	
	public void update(Integer id);
	
	
}
