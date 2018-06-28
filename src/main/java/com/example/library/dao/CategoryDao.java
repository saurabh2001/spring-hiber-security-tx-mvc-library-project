package com.example.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.library.model.Category;;
@Repository
public interface CategoryDao extends CrudRepository<Category, Integer>{

	Category findByCategoryId(Integer categoryId);
	Category deleteByCategoryId(Integer categoryId);
	
/*	@Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
    List<Book> fetchArticles(@Param("title") String title, @Param("category") String category);*/
}
