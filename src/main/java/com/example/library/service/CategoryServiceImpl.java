package com.example.library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.dao.CategoryDao;
import com.example.library.model.Category;


@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDao; 
	
	@Override
	public Category findByCategoryId(Integer categoryId){
		return categoryDao.findByCategoryId(categoryId);
	}

	@Override
	public List<Category> listAllCategories() {
		// TODO Auto-generated method stub
		List<Category> list = new ArrayList<Category>();
		categoryDao.findAll().forEach(e -> list.add(e));
		return list;
	}

}
