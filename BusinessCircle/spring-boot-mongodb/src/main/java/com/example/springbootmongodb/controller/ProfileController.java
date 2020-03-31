package com.example.springbootmongodb.controller;

import com.example.springbootmongodb.model.Cities;
import com.example.springbootmongodb.model.Person;
import com.example.springbootmongodb.model.Profile;
import com.example.springbootmongodb.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping("/createProfile")
    public Profile create(@RequestParam String profileDetail,@RequestParam String workingDays,@RequestParam String address,@RequestParam String contact,@RequestParam String category) {
        return profileService.create(profileDetail, workingDays, address, contact, category);
    }

    @RequestMapping("/profile/getCat")
    public List<Profile> getPerson(@RequestParam String category) {
        return profileService.getAll(category);
    }


}
