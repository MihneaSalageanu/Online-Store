package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.OrderEntity;
import com.sda.onlinestore.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class OrderControlller {

    @Autowired
    private OrderService orderService;

    @GetMapping(path = "get-orders")
    public String getOrder(Model model) {
        List<OrderEntity> orderList = orderService.getAllOrders();
        model.addAttribute("orders", orderList);
        return "orders";

    }

    @GetMapping(path = "add-order")
    public String addOrder(Model model){
        model.addAttribute("newOrder", new OrderEntity());
        return "add-order";
    }


}
