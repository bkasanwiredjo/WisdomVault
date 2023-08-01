package com.wisdomvault.wisdomvault.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdomvault.wisdomvault.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService ps;
	
	
	
	
	@GetMapping("/test")
	public void testMethode( ) {
		System.out.println("test");
		ps.saveBook();
	}
	
}
