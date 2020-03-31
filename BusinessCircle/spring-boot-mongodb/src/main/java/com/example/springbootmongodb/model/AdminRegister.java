package com.example.springbootmongodb.model;

import org.springframework.data.annotation.Id;

public class AdminRegister {

    @Id
    String id;

    public AdminRegister(String category, String city, String email, String password, String title) {
        this.category = category;
        this.city = city;
        this.email = email;
        this.password = password;
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String category,city,email,password,title;

}
