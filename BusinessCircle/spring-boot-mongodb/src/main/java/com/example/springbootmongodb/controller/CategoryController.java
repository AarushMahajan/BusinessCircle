package com.example.springbootmongodb.controller;

import com.example.springbootmongodb.model.Categories;
import com.example.springbootmongodb.model.Cities;
import com.example.springbootmongodb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/categoryCreate")
    public String create(@RequestBody String categoryName) {
        Categories p = categoryService.create(categoryName);
        return p.toString();
    }

    @RequestMapping("/categoryGetAll")
    public List<Categories> getAllCity() {
        return categoryService.getAll();
    }

    @RequestMapping("/categoryDelete")
    public String delete(@RequestParam String categoryName) {
        categoryService.delete(categoryName);
        return "Deleted " + categoryName;
    }

}
