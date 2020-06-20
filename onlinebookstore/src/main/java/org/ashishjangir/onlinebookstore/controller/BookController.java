package org.ashishjangir.onlinebookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.ashishjangir.onlinebookstore.entity.Book;
import org.ashishjangir.onlinebookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {
	
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/all")
	public List<Book> getAllBooks()
	{
//		List<Book> allBooks = bookService.getAllBooks();
//		System.out.println(allBooks);
//		return allBooks;
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("Ashish"));
		bookList.add(new Book("Sumit"));
		return bookList;
	}

}
