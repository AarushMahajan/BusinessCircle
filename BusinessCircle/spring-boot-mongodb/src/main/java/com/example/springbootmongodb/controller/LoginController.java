package com.example.springbootmongodb.controller;

import com.example.springbootmongodb.model.Login;
import com.example.springbootmongodb.model.Person;
import com.example.springbootmongodb.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login/create")
    public String create(@RequestParam String username, @RequestParam String password) {
        Login p = loginService.create(username, password);
        return p.toString();
    }

    @RequestMapping("/login/username")
    public Login getUsername(@RequestParam String username) {
        return loginService.findByFirstName(username);
    }

    @RequestMapping("/update/password")
    public String update(@RequestParam String username, @RequestParam String password) {
        Login p = loginService.update(username, password);
        return p.toString();
    }

}
