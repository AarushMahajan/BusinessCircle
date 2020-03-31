package com.example.springbootmongodb.service;

import com.example.springbootmongodb.model.Profile;
import com.example.springbootmongodb.repository.ProfileRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepositoty profileRepositoty;

    public Profile create(String profileDetail, String workingDays, String address, String contact,String category) {
        return profileRepositoty.save(new Profile(profileDetail, workingDays, address, contact, category));
    }

    public List<Profile> getAll(String category){
        return profileRepositoty.findByCategory(category);
    }


}
