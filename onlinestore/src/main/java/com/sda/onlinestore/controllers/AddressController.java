package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.AddressEntity;
import com.sda.onlinestore.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping(path = "getAddress")
    public String getAddress (Model model){
        List<AddressEntity> addressList =  addressService.addressAllList();
        model.addAttribute("newAddress", new AddressEntity());
        return "address";
    }

    @GetMapping(path = "add-address")
    public String addAddress(Model model){
        model.addAttribute("newAddress", new AddressEntity());
        return "add-address";
    }

    @PostMapping(path = "address/add")
    public String addAddress(@ModelAttribute AddressEntity newAddress){
        addressService.addAddress(newAddress);
        return "redirect:/getAddress";
    }
}
