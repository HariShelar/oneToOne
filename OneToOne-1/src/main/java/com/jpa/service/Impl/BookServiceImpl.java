package com.jpa.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Repository.BookRepo;
import com.jpa.model.Book;
import com.jpa.model.Story;
import com.jpa.service.BookService;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepository;
    public Book saveBook(Book book) {
        Story story = book.getStory();
        story.setBook(book);
        book = bookRepository.save(book);
        return book;
    }
    public Book findByBookId(int bookId) {
        Book book = bookRepository.findByBookId(bookId);
        return book;
    }
}
