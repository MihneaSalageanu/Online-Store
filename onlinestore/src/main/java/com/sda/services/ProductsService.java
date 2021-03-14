package com.sda.services;

import com.sda.onlinestore.entity.ProductsEntity;
import com.sda.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public void addProduct(ProductsEntity newProduct) {
        productsRepository.save(newProduct);
    }

    public List<ProductsEntity> getAllProducts() {
        return productsRepository.findAll();
    }

    public void editProduct(ProductsEntity editedProduct) {
        productsRepository.save(editedProduct);
    }

    public void deleteProduct(long id) {
        productsRepository.deleteById(id);
    }

    public ProductsRepository getProductsRepository() {
        return productsRepository;
    }

    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }
}

