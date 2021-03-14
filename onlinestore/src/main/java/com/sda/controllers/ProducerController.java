package com.sda.controllers;

import com.sda.onlinestore.entity.ProducerEntity;
import com.sda.services.ProducerService;
import com.sda.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping(path = "getProducers")
    public String getProducer(Model model){
        List<ProducerEntity> producerList = producerService.getAllProducers();
        model.addAttribute("producers", producerList);
        return "producers";

    }
}
