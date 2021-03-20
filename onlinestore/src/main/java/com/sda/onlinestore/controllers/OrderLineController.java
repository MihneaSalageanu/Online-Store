package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.OrderLineEntity;
import com.sda.onlinestore.services.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class OrderLineController {

    @Autowired
    private OrderLineService orderLineService;

    public String getOrderLine(Model model){
        List<OrderLineEntity> orderLineEntityList = orderLineService.orderLineList();
        model.addAttribute("orderLines", orderLineEntityList);
        return "orderLine";
    }

}
