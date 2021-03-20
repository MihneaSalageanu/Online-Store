package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping(path = "getCategory")
    public String getCategory(Model model){
        List<CategoryEntity> categoryList = categoryService.getAllCategories();
        model.addAttribute("categories", categoryList);
        model.addAttribute("category", categoryList);
        return "categories";
    }

    @GetMapping(path = "add-category")
    public String addCategory(Model model){
        model.addAttribute("newCategory", new CategoryEntity());
        return "add-category";
    }

    @PostMapping(path = "category/add")
    public String addCategory(@ModelAttribute CategoryEntity categoryEntity){
        categoryService.addCategory(categoryEntity);
        return "redirect:/getCategory";
    }

    @GetMapping(path = "edit-category/{id}")
    public String editCategory(Model model, @PathVariable("id") Integer id){
        CategoryEntity categoryEntity = categoryService.getCategoryById(id);
        model.addAttribute("categoryToBeEdit", categoryEntity);
        return "edit-category";
    }

    @PostMapping(path = "category/edit")
    public String editCategory(@ModelAttribute CategoryEntity categoryEntity){
        categoryService.editCategory(categoryEntity);
        return"redirect:/getCategory";
    }


}
