package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.example.library.dao.BookDao;
import com.example.library.model.Book;

public class EmployeeTest {
	
    private static CrudRepository<Book, Integer> repository;

    public static void main(String[] args) {
        AbstractApplicationContext context = new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/disp-servlet.xml");
        repository = context.getBean(BookDao.class);

        repository.findAll();
        
        context.close();
    }

}