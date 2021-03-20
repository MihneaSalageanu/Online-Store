package com.sda.onlinestore.services;


import com.sda.onlinestore.entities.ProductsEntity;
import com.sda.onlinestore.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

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

    public ProductsEntity getProduct(long id) {
        Optional<ProductsEntity> productsEntityOptional = productsRepository.findById(id);
        ProductsEntity productsEntity = productsEntityOptional.get();
        return productsEntity;
    }
}

