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

    public void addProduct(ProductsEntity entity){
        productsRepository.save(entity);
    }
    public void editProduct(ProductsEntity entity){
        List<ProductsEntity> products = getAllProducts();

    }

    private List<ProductsEntity> getAllProducts() {

    }

    public void deleteProduct(ProductsEntity entity) {
    }
}

