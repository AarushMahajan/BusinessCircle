package com.example.springbootmongodb.repository;

import com.example.springbootmongodb.model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends MongoRepository<Login,String> {
    public Login findByUsername(String username);
}
