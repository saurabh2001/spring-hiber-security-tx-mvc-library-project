package com.example.library.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
/*
import org.assertj.core.util.DateUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;*/
import org.springframework.transaction.annotation.Transactional;

import com.example.library.model.Book;
import com.example.library.model.Category;
import com.example.library.model.User;
import com.example.library.model.UserBook;
import com.example.library.service.UserService;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class TestPgm {

	@Autowired BookDao bookDao;
	@Autowired CategoryDao catDao;
	@Autowired UserDao userDao;
	@Autowired UserBookDao ubDao;
	
	@Autowired UserService userService;
	
	/*@Test @Transactional
	public void issueBook()
	{
		//Category cat = catDao.findById(2).get();
		Book b = bookDao.findById(2).get();
		User u = userDao.findById(1L).get();
		
		System.out.println("--------" + b.getTitle());
		System.out.println("-------------" + u.getUseremail());
		
		UserBook ub = new UserBook();
		ub.setBook(b);
		ub.setUser(u);
		ub.setCheckout_date(new Date().toString());
		ub.setReturn_due_date(DateUtil.tomorrow().toString());
		ub.setFine(0);
		
		ubDao.save(ub);
		
	}*/
	
	//@Test  @Transactional
	public void addNewBook()
	{
		// add new book with new category
		
		/*Category cat0 = new Category();
		cat0.setCategoryName("Java 1");
		
		Book b0 = new Book();
		b0.setTitle("java 1 title");
		b0.setAuthor("java 1 author");
		
		b0.setCategory(cat0);
		bookDao.save(b0);
		
		Category cat = new Category();
		cat.setCategoryName("Java 2");
		
		Book b = new Book();
		b.setTitle("java 2 title");
		b.setAuthor("java 2 author");
		
		b.setCategory(cat);
		bookDao.save(b);
		*/
		
		// add existing book with new category
		/*
		Category cat = catDao.findById(2).get();
		
		Book b = new Book();
		b.setTitle("spring title");
		b.setAuthor("spring author");

		b.setCategory(cat);
		bookDao.save(b);
		*/
		
	}
	
	/*@Test @Transactional
	public void addNewUser()
	{
		
		User u = new User();
		u.setUseremail("sau.shah");
		u.setPassword("saushah");
		userDao.save(u);
		
		u = new User();
		u.setUseremail("raj.shah");
		u.setPassword("rajshah");
		userDao.save(u);
		
		
	}*/
	
	/*@Test @Transactional
	public void addNewUser()
	{
		
		User u = new User();
		u.setUseremail("pra.shah");
		u.setPassword("shah");
		userService.addUser(u);
	}*/

	/*@Test @Transactional
	public void searchTest()
	{
		
		List<Book> u= 	bookDao.searchBook(null, null,"31");
		//List<Book> u= 	bookDao.searchBook("4",);
		System.out.println("rec ocunt----"+u.size());
		for (Iterator iterator = u.iterator(); iterator.hasNext();) {
			Book userBook = (Book) iterator.next();
			System.out.println("---Author--"+userBook.getAuthor());
			
		}
	}*/
	/*@Before @Transactional
	public void beforeTestCode()
	{
		System.out.println("before");
	}
	@Before @Transactional
	public void tttTestCode()
	{
		System.out.println("-----");
	}
	@After @Transactional
	public void afterTestCode()
	{
		System.out.println("after");
	}*/
	
}
