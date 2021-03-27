package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.ProductsEntity;
import com.sda.onlinestore.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomePageController {
    @Autowired
    private ProductsService productsService;

    @GetMapping(name = "/")
    public String getHomePage(Model model) {
        List<ProductsEntity> productsList = productsService.getAllProducts();
        model.addAttribute("products", productsList);
        return "products";
    }
}
