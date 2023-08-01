package com.wisdomvault.wisdomvault.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisdomvault.wisdomvault.model.Book;
import com.wisdomvault.wisdomvault.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository pr;
	
	public void saveBook() {
		pr.save(new Book());
	}
}
