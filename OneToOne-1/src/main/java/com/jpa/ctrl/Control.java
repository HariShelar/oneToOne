package com.jpa.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.model.Book;
import com.jpa.service.BookService;

@RestController
@RequestMapping(value = "/book")
public class Control {
    @Autowired
    private BookService bookService;
    @RequestMapping(value = "/savebook", method = RequestMethod.POST)
    @ResponseBody
    public Book saveBook(@RequestBody Book book) {
        Book bookResponse = bookService.saveBook(book);
        return bookResponse;
    }
    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    @ResponseBody
    public Book getBookDetails(@PathVariable int bookId) {
        Book bookResponse = bookService.findByBookId(bookId);
        return bookResponse;
    }
}

