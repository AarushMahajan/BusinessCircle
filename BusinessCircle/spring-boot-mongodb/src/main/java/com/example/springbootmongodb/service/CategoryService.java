package com.example.springbootmongodb.service;

import com.example.springbootmongodb.model.Categories;
import com.example.springbootmongodb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    //Create
    public Categories create(String categoryName) {
        return categoryRepository.save(new Categories(categoryName));
    }

    //getAll
    public List<Categories> getAll() {
        return categoryRepository.findAll();
    }

    //delete
    public void delete(String category) {
        Categories p = categoryRepository.findByCategory(category);
        categoryRepository.delete(p);
    }

}
