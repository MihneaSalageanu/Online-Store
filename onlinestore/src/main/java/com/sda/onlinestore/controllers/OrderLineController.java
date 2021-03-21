package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.OrderLineEntity;
import com.sda.onlinestore.services.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OrderLineController {

    @Autowired
    private OrderLineService orderLineService;

    @GetMapping(path = "getOrderLine")
    public String getOrderLine(Model model){
        List<OrderLineEntity> orderLineEntityList = orderLineService.orderLineList();
        model.addAttribute("orderLines", orderLineEntityList);
        return "orderLine";
    }

    @GetMapping(path = "add-orderLine")
    public String addOrderLine(Model model){
        model.addAttribute("newOrderLine", new OrderLineEntity());
        return "add-orderLine";
    }

    @PostMapping(path = "orderLine/add")
    public String addOrderLine(@ModelAttribute OrderLineEntity newOrderLine){
        orderLineService.addOrderLine(newOrderLine);
        return "redirect:/getOrderLine";
    }



}
