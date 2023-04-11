package com.moses.lemma.lmscapstone.entity;


import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class userbooks {
    private user user;
    private books book;
    private LocalDate checkoutDate;
    private LocalDate dueDate;

    // Constructor, getters and setters

    public void books(){

    }
    @ManyToOne
    @JoinColumn(name = "user_id")
    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "book_id")
    public books getBook() {
        return book;
    }

    public void setBook(books book) {
        this.book = book;
    }
}

