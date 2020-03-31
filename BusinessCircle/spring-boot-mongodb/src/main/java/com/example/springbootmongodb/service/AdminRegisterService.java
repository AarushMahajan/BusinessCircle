package com.example.springbootmongodb.service;

import com.example.springbootmongodb.model.AdminRegister;
import com.example.springbootmongodb.repository.AdminRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminRegisterService {

    @Autowired
    private AdminRegisterRepository adminRegisterRepository;

    public AdminRegister create(String category, String city, String email, String password, String title) {
        return adminRegisterRepository.save(new AdminRegister(category, city, email, password, title));
    }

   public List<AdminRegister> getAll(String category){
        return adminRegisterRepository.findByCategory(category);
   }
}
