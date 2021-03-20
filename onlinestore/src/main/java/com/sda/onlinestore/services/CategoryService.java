package com.sda.onlinestore.services;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public CategoryEntity getCategoryById(Integer id) {
       Optional<CategoryEntity> optionalCategoryEntity= categoryRepository.findById(id);
       return optionalCategoryEntity.get();
    }

    public void deleteCategoryById(Integer id) {
        categoryRepository.deleteById(id);
    }

    public void editCategory(CategoryEntity editedCategory){
        categoryRepository.save(editedCategory);
    }
}


