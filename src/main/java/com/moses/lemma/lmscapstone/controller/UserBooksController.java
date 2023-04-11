package com.moses.lemma.lmscapstone.controller;

import com.moses.lemma.lmscapstone.entity.books;
import com.moses.lemma.lmscapstone.entity.user;
import com.moses.lemma.lmscapstone.repository.userRepository;

import com.moses.lemma.lmscapstone.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserBooksController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/signup")
    public String signupform(@ModelAttribute("user") user user){
        bookRepository.save(user);
        return "signup";

    }
    @PostMapping("/signup")
    public String signupprocessing(@RequestParam("nameInput") String Name,
                             @RequestParam("emailInput2") String Email,
                             @RequestParam("passwordInput2") String Password){

        user user = new user(Name,Email,Password);
        userRepository(user user);
        return "redirect:/index.html";

    }

/*
    @GetMapping("/search-books")
    public String showSearchForm(Model model) {
        model.addAttribute("bookSearch", new BookSearch());
        return "searchbooks";
    }

    @GetMapping("/search-results")
    public String searchBooks(@ModelAttribute("bookSearch") BookSearch bookSearch, Model model) {
        List<books> books = bookRepository.findBooksByTitleAndAuthor(bookSearch.getBookTitle(), bookSearch.getAuthorName());
        model.addAttribute("books", books);
        return "searchresult";
    }
    */

}
