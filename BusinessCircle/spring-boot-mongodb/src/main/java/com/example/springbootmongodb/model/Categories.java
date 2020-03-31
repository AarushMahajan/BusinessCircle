package com.example.springbootmongodb.model;

import org.springframework.data.annotation.Id;

public class Categories {

    @Id
    String id;

    private String category;

    public Categories(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "category='" + category + '\'' +
                '}';
    }


}
