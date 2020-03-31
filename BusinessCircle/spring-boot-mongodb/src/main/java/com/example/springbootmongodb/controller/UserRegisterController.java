package com.example.springbootmongodb.controller;

import com.example.springbootmongodb.model.Profile;
import com.example.springbootmongodb.model.UserRegister;
import com.example.springbootmongodb.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserRegisterController {

    @Autowired
    private UserRegisterService userRegisterService;

    @RequestMapping("/userRegCreate")
    public String create(@RequestParam String name,@RequestParam String email,@RequestParam String phone,@RequestParam String city,@RequestParam String category,@RequestParam String businessTitle) {
        UserRegister p = userRegisterService.create(name, email, phone, city, category, businessTitle);
        return p.toString();
    }

//    @RequestMapping("/userRegGetAll")
//    public List<UserRegister> getAllPerson() {
//        return userRegisterService.getAll();
//    }


}
