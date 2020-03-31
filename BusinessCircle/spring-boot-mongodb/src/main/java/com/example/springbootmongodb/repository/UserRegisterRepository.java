package com.example.springbootmongodb.repository;

import com.example.springbootmongodb.model.UserRegister;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRegisterRepository extends MongoRepository<UserRegister, String> {
    public List<UserRegister> findByCategory(String category);
}
