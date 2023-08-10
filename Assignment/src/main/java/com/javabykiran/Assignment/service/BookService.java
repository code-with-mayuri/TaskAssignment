package com.javabykiran.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.Assignment.dao.BookDao;
import com.javabykiran.Assignment.entity.Book;


@Service
public class BookService {
	@Autowired
	BookDao dao;
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		List<Book> br=dao.getAllBook();
		return br;
	}
	public boolean insertBook(Book book) {
		return dao.insertBook(book);
		
	}
	public Book getbyId(int id) {
		return dao.getbyId(id);
	}
	public boolean deletebook(int id) {
return dao.deletebook(id)	;	
	}
	public boolean updatebook(Book book) {
   return dao.	updatebook(book);	
	}

}
