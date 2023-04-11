package com.moses.lemma.lmscapstone.entity;

import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

public class books {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private LocalDate publicationDate;
    private int checkoutCopies;
    private int totalCopies;
    private List<userbooks> userBooksList;

    // Constructor, getters and setters

    @OneToMany(mappedBy = "book")
    public List<userbooks> getUserBooksList() {
        return userBooksList;
    }

    public void setUserBooksList(List<userbooks> userBooksList) {
        this.userBooksList = userBooksList;
    }
}

