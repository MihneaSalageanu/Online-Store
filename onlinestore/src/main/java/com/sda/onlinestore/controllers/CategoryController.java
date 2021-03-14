package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @GetMapping(path = "getCategory")
    public void getCategory(CategoryService categoryService) {
        List<CategoryEntity> categoryEntityList = categoryService.getAllCategories();
    }
}
