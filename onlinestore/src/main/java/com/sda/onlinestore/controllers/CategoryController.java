package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.services.CategoryService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @GetMapping(path = "getCategory")
    public void getCategory(CategoryService categoryService) {
        List<CategoryEntity> categoryEntityList = categoryService.getAllCategories();

    }

    @GetMapping(path = "add-category")
    public String addCategory(Model model){
        model.addAttribute("newCategory", new CategoryEntity());
        return "add-category";
    }


}
