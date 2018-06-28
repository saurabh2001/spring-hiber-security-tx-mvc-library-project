package com.example.library.service;

import java.util.List;

import com.example.library.model.Category;

public interface CategoryService {

	public List<Category> listAllCategories();
	public Category findByCategoryId(Integer categoryId);
	
	
	
}
