package com.jpa.service;

import org.springframework.stereotype.Component;

import com.jpa.model.Book;

@Component
public interface BookService {
    public Book saveBook(Book book);
    public Book findByBookId(int bookId);
}