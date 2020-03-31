package com.example.springbootmongodb.repository;


import com.example.springbootmongodb.model.Cities;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends MongoRepository<Cities, String> {
    public Cities findByCity(String city);
}
