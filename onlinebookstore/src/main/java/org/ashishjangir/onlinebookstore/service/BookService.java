package org.ashishjangir.onlinebookstore.service;

import java.util.List;

import org.ashishjangir.onlinebookstore.entity.Book;
import org.ashishjangir.onlinebookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	public BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

}
