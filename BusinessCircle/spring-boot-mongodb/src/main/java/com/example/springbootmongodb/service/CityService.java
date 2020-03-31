package com.example.springbootmongodb.service;

import com.example.springbootmongodb.model.Cities;
import com.example.springbootmongodb.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    //Create
    public Cities create(String cityName) {
        return cityRepository.save(new Cities(cityName));
    }

    //getAll
    public List<Cities> getAll() {
        return cityRepository.findAll();
    }

    //delete
    public void delete(String city) {
        Cities p = cityRepository.findByCity(city);
        cityRepository.delete(p);
    }

}
