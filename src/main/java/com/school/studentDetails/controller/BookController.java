package com.school.studentDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentDetails.Service.BookService;
import com.school.studentDetails.model.Book;

@RestController
@RequestMapping(value = "/bookController")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping
	public Book postBook(@RequestBody Book book) {
		
		Book addingBook = bookService.addBook(book);
		
		return addingBook;
		
		
	}

}
