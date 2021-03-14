package com.sda.onlinestore.controllers;



import com.sda.onlinestore.entities.ProductsEntity;
import com.sda.onlinestore.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping(path = "getProducts")
    public String getProducts(Model model) {
        List<ProductsEntity> productsList = productsService.getAllProducts();
        model.addAttribute("products", productsList);
        return "products";
    }

    @GetMapping(path = "add-product")
    public String addProductPage(Model model) {
        model.addAttribute("newProduct", new ProductsEntity());
        return "add-product";
    }

    @PostMapping(path = "product/add")
    public String addProduct(@ModelAttribute ProductsEntity newProduct) {
        productsService.addProduct(newProduct);
        return "redirect:/getProducts";
    }
}
