package com.javabykiran.Assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.Assignment.entity.Book;
import com.javabykiran.Assignment.service.BookService;


@RestController
public class BookController {
	@Autowired
	BookService ser;
@GetMapping("/getbook")
	public List<Book> getAllBook()
	{
	List<Book> br=ser.getAllBook();
	return br;
	}
	@PostMapping("insert")
	public boolean insertBook(@RequestBody Book book)
	{
		return ser.insertBook(book);
	}
	@GetMapping("getbyid/{id}")
	public Book getbyId(@PathVariable int id)
	{
		return ser.getbyId(id);
	}
	@DeleteMapping("/deletebook/{id}")
	boolean deletebook(@PathVariable int id)
	{
		return ser.deletebook(id);
	}
	@PutMapping("/updatebook")
	public boolean updatebook(@RequestBody Book book)
	{
		return ser.updatebook(book);
	}
}
