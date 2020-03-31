package com.example.springbootmongodb.controller;

import com.example.springbootmongodb.model.Cities;
import com.example.springbootmongodb.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/cityCreate")
    public String create(@RequestBody String cityName) {
        Cities p = cityService.create(cityName);
        return p.toString();
    }

    @RequestMapping("/cityGetAll")
    public List<Cities> getAllCity() {
        return cityService.getAll();
    }

    @RequestMapping("/cityDelete")
    public String delete(@RequestParam String cityName) {
        cityService.delete(cityName);
        return "Deleted " + cityName;
    }


}
