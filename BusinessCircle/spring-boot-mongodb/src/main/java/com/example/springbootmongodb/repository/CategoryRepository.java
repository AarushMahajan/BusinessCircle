package com.example.springbootmongodb.repository;

import com.example.springbootmongodb.model.Categories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Categories, String> {
    public Categories findByCategory(String category);
}
