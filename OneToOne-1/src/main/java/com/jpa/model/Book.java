package com.jpa.model;
import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    @Column(name = "book_name")
    private String bookName;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "book")
    @JsonManagedReference
    private Story story;
    public Story getStory() {
        return story;
    }
    public void setStory(Story story) {
        this.story = story;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
