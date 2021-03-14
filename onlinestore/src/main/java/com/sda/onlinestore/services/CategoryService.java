package com.sda.onlinestore.services;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryEntity> getAllCategories() {
        return categoryRepository.findAll();
    }

    public void addCategory(CategoryEntity newCategory) {
        categoryRepository.save(newCategory);
    }

    public void getCategoryById(Integer id) {
        categoryRepository.findById(id);
    }

    public void deleteCategoryById(Integer id) {
        categoryRepository.deleteById(id);
    }
}


