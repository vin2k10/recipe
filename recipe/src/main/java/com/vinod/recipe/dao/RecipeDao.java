package com.vinod.recipe.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vinod.recipe.dao.rowmapper.RecipeRowMapper;
import com.vinod.recipe.domain.Recipe;

@Repository
public class RecipeDao implements IRecipeDao {
	private DataSource ds;
	private JdbcTemplate jdbcTemplate;
	
	private static final String sql_getOneRecipe = 
			"select * from recipe where idrecipe = ?";
	
	@Autowired
	public void setDataSource(DataSource ds) {
		this.ds = ds;
		this.jdbcTemplate = new JdbcTemplate(ds);

	}

	public void setDatasource() {}
	
	@Override
	public void create(String title, String description, String submittedBy,
			String type) {
		// TODO Auto-generated method stub

	}

	@Override
	public Recipe getRecipe(Integer id) {
		Recipe recipe = jdbcTemplate.queryForObject(sql_getOneRecipe, new Object[]{id}, new RecipeRowMapper());
		return recipe;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Integer id) {
		// TODO Auto-generated method stub

	}

}
