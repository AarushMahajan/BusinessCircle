package com.example.springbootmongodb.repository;

import com.example.springbootmongodb.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProfileRepositoty extends MongoRepository<Profile,String> {
    public List<Profile> findByCategory(String category);
}
