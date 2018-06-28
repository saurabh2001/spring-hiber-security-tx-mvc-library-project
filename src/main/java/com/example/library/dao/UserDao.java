package com.example.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.library.model.Book;
import com.example.library.model.User;
@Repository
public interface UserDao extends CrudRepository<User, Long>{

	 User findByUseremail(String useremail);
	 User findByUserId(Long userId);
		 List<User> findByActiveTrue(); 
	 
/*	@Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
    List<Book> fetchArticles(@Param("title") String title, @Param("category") String category);*/
}
