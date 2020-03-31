package com.example.springbootmongodb.controller;

import com.example.springbootmongodb.model.AdminRegister;
import com.example.springbootmongodb.model.Person;
import com.example.springbootmongodb.model.Profile;
import com.example.springbootmongodb.service.AdminRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AdminRegisterController {

    @Autowired
    private AdminRegisterService adminRegisterService;

    @RequestMapping("/adminRegCreate")
    public String create(@RequestParam String category,@RequestParam String city,@RequestParam String email,@RequestParam String password,@RequestParam String title) {
        AdminRegister p = adminRegisterService.create(category, city, email, password, title);
        return p.toString();
    }

    @RequestMapping("/admin/getCat")
    public List<AdminRegister>  getAllCategory(@RequestParam String category) {
        return adminRegisterService.getAll(category);
    }

}
