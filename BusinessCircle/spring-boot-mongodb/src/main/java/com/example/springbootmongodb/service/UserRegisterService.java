package com.example.springbootmongodb.service;

import com.example.springbootmongodb.model.UserRegister;
import com.example.springbootmongodb.repository.UserRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRegisterService {

    @Autowired
    private UserRegisterRepository userRegisterRepository;

    //CreateOperation
    public UserRegister create(String name, String email, String phone, String city, String category, String businessTitle) {
        return userRegisterRepository.save(new UserRegister(name, email, phone, city, category, businessTitle));
    }

    //RetrieveOperation
    public List<UserRegister> getAll(String category){
        return userRegisterRepository.findAll();
    }


}
