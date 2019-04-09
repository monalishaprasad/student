package com.school.studentDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentDetails.model.Book;
import com.school.studentDetails.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;

	public Book addBook(Book book) {

		Book addIntoBook = bookRepo.save(book);
		return addIntoBook;
	}

}
