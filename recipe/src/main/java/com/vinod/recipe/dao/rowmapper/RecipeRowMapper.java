package com.vinod.recipe.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vinod.recipe.domain.Recipe;
import com.vinod.recipe.domain.RecipeType;

public class RecipeRowMapper implements RowMapper<Recipe>{

	@Override
	public Recipe mapRow(ResultSet rs, int rowNum) throws SQLException {
		Recipe recipe = new Recipe();
		recipe.setTitle(rs.getString("title"));
		recipe.setDescription(rs.getString("description"));
		recipe.setSubmittedBy(rs.getString("submittedby"));
		String recipeType = rs.getString("type");
		recipe.setRecipeType(recipeType);
		return recipe;
	}

}
