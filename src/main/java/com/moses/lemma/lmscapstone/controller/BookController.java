package com.moses.lemma.lmscapstone.controller;

import com.moses.lemma.lmscapstone.entity.books;
import com.moses.lemma.lmscapstone.entity.user;
import com.moses.lemma.lmscapstone.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moses.lemma.lmscapstone.entity.user;
import com.moses.lemma.lmscapstone.repository.userRepository;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    // Controller method for index.html
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/signup")
    public String signupform(@ModelAttribute("user") user user){
        bookRepository.save(user);
        return "signup";
    }

    // Controller method for signup.html
    @PostMapping("/signup")
    public String signupprocessing(@RequestParam("nameInput") String Name,
                                   @RequestParam("emailInput2") String Email,
                                   @RequestParam("passwordInput2") String Password){

        user user = new user(Name,Email,Password);
        userRepository(user user);
        return "redirect:/index.html";
    }

    // Controller method for home.html
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    // Controller method for RequestBooks.html
    @GetMapping("/requestbooks")
    public String requestBooks() {
        return "requestbooks";
    }

    // Controller method for SearchBooks.html
    @GetMapping("/searchbooks")
    public ModelAndView searchBooks() {
        List<books> list = bookRepository.findAll(books, books)
    }

    // Controller method for CheckoutBooks.html
    @GetMapping("/checkoutbooks")
    public String checkoutBooks() {
        return "checkoutbooks";
    }

    // Controller method for CheckoutBooks.html
    @GetMapping("/returnbooks")
    public String checkoutBooks() {
        return "returnbooks";
    }
}

