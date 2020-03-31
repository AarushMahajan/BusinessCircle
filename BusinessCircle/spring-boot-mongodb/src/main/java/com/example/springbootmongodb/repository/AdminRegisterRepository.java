package com.example.springbootmongodb.repository;

import com.example.springbootmongodb.model.AdminRegister;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRegisterRepository extends MongoRepository<AdminRegister,String> {
    public List<AdminRegister> findByCategory(String category);
}
