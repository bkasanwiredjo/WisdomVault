package com.wisdomvault.wisdomvault.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.wisdomvault.wisdomvault.model.Book;

@Component
public interface BookRepository extends CrudRepository<Book, Long>{

}
