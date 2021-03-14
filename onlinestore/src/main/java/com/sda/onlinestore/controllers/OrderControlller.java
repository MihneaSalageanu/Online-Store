package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.OrderEntity;
import com.sda.onlinestore.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderControlller {

    @Autowired
    private OrderService orderService;

    @GetMapping(path = "getOrders")
    public String addOrder(Model model) {
        List<OrderEntity> orderList = orderService.getAllOrders();
        model.addAttribute("orders", orderList);
        return "orders";

    }
}
