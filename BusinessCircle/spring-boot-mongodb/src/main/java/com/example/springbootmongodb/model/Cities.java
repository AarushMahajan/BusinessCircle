package com.example.springbootmongodb.model;

import org.springframework.data.annotation.Id;

public class Cities {

    @Id
    String id;

    private String city;

    @Override
    public String toString() {
        return this.city ;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Cities(String city) {
        this.city = city;
    }



}
