package com.example.springbootmongodb.service;

import com.example.springbootmongodb.model.Login;
import com.example.springbootmongodb.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Login create(String username, String password) {
        return loginRepository.save(new Login(username, password));
    }

    public Login findByFirstName(String username) {
        return loginRepository.findByUsername(username);
    }

    public Login update(String username,String password) {
        Login p = loginRepository.findByUsername(username);
        p.setPassword(password);
        return loginRepository.save(p);
    }

}
