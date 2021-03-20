package com.sda.onlinestore.controllers;


import com.sda.onlinestore.entities.ProducerEntity;
import com.sda.onlinestore.services.ProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    }


    @GetMapping(path = "add-producer")
    public String addProducerPage(Model model) {
        model.addAttribute("newProducer", new ProducerEntity());
        return "add-producer";
    }

    @PostMapping(path = "Producer/add")
    public String addProducer(@ModelAttribute ProducerEntity newProducer) {

        producerService.addProducer(newProducer);
        return "redirect:/getProducers";

    }

    @GetMapping(path = "edit-producer/{id}")
    public String editProducerPage(Model model, @PathVariable("id") long id) {
        ProducerEntity producerEntity = producerService.getProducer(id);
        model.addAttribute("producerToBeEdit", producerEntity);
        return "edit-producer";
    }
        @PostMapping(path = "producer/edit")
    public String editProducer(@ModelAttribute ProducerEntity producerToBeEdit){
        producerService.editProducer(producerToBeEdit);
        return "redirect:/getProducers";
        }

        @GetMapping(path = "delete-producer/{id}")
    public String delete(Model model, @PathVariable("id") long id){
        producerService.deleteProducer(id);
        return "redirect:/getProducers";
        }
}

