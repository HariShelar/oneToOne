package com.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {
	 public Book findByBookId(int bookId);
}
