package com.example.library.service;

import java.text.ParseException;
import java.util.List;

import com.example.library.model.Book;
import com.example.library.model.User;
import com.example.library.model.UserBook;

public interface UserBookService {

	public UserBook findById(Integer id);
	
	public void returnBook(UserBook userBook);
	
	public List<UserBook> getAllIssuedBooks();
	
	public void issueBook(UserBook userBook);

	public Integer calculateFine(UserBook userBook) throws ParseException;
}
