package com.sda.onlinestore.controllers;


import com.sda.onlinestore.entities.ProducerEntity;
import com.sda.onlinestore.services.ProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping(path = "getProducers")
    public String getProducer(Model model) {
        List<ProducerEntity> producerList = producerService.getAllProducers();
        model.addAttribute("producers", producerList);
        return "producers";

        @GetMapping(path = "add-producer")
        public String addProducerPage (Model model){
            model.addAttribute(("newProducer", new ProducerEntity());
            return "add-producer";
        }

        @PostMapping(path = "Producer/add")
        public String addProducer (@ModelAttribute ProducerEntity newProducer){
            ProducerService.addProducer(newProducer);
            return "redirect:/getProducers";
        }
    }
}
