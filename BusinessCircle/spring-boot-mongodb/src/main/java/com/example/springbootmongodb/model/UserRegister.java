package com.example.springbootmongodb.model;
//sign up new user
import org.springframework.data.annotation.Id;

public class UserRegister {

    @Id
    String id;

    private String Name,email,phone,city,category,businessTitle;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBusinessTitle() {
        return businessTitle;
    }

    public void setBusinessTitle(String businessTitle) {
        this.businessTitle = businessTitle;
    }

    public UserRegister(String name, String email, String phone, String city, String category, String businessTitle) {
        Name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.category = category;
        this.businessTitle = businessTitle;
    }



}
