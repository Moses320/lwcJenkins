package com.moses.lemma.lmscapstone.entity;

public class user {
    private int library_card_Id;
    private String first_name;
    private String last_name;
    private String email_address;
    private String password;

    public user(int library_card_Id, String first_name, String last_name, String email_address) {
        this.library_card_Id = library_card_Id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
    }

    public user(String name, String email, String password){
        this.first_name = name;
        this.email_address = email;
        this.password = password;
    }

    public user() {

    }

    public int getLibrary_card_Id() {
        return library_card_Id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail_address() {
        return email_address;
    }

}
