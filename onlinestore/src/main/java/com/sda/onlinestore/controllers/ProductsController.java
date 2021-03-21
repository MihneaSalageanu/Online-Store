package com.sda.onlinestore.controllers;


import com.sda.onlinestore.entities.ProducerEntity;
import com.sda.onlinestore.entities.ProductsEntity;
import com.sda.onlinestore.services.ProducerService;
import com.sda.onlinestore.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @Autowired
    private ProducerService producerService;

    @GetMapping(path = "getProducts")
    public String getProducts(Model model) {
        List<ProductsEntity> productsList = productsService.getAllProducts();
        model.addAttribute("products", productsList);
        return "products";
    }

    @GetMapping(path = "add-product")
    public String addProductPage(Model model) {
        model.addAttribute("newProduct", new ProductsEntity());
        List<ProducerEntity> producerEntities = producerService.getAll();
        model.addAttribute("producers", producerEntities);
        return "add-product";
    }

    @PostMapping(path = "product/add")
    public String addProduct(@ModelAttribute ProductsEntity newProduct) {
        productsService.addProduct(newProduct);
        return "redirect:/getProducts";
    }

    @GetMapping(path = "edit-product/{id}")
    public String editProductPage(Model model, @PathVariable("id") long id) {
        ProductsEntity productsEntity = productsService.getProduct(id);
        model.addAttribute(("productToBeEdit"), productsEntity);
        List<ProducerEntity> producerEntities = producerService.getAll();
        model.addAttribute("producers", producerEntities);
        return "edit-product";
    }

    @PostMapping(path = "product/edit")
    public String editProduct(@ModelAttribute ProductsEntity productToBeEdit) {
        productsService.editProduct(productToBeEdit);
        return "redirect:/getProducts";
    }

    @GetMapping(path = "delete-product/{id}")
    public String delete(Model model, @PathVariable("id") long id) {
        productsService.deleteProduct(id);
        return "redirect:/getProducts";
    }
}
