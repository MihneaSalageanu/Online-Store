package com.sda.onlinestore.controllers;

import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.services.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserAccountController {
    @Autowired
    private UserAccountService userAccountService;

    @GetMapping(path = "getUser")
    public String getUserAccount(Model model) {
        List<UserAccountEntity> userAccountEntityList = userAccountService.allUserAccounts();
        model.addAttribute("userAccounts", userAccountEntityList);
        return "useraccount";
    }

    @GetMapping(path = "add-user")
    public String addUserAccount(Model model) {
        model.addAttribute("newUserAccount", new UserAccountEntity());
        return "add-useraccount";
    }

    @PostMapping(path = "userAccount/add")
    public String addUserAccount(@ModelAttribute UserAccountEntity newUserAccount) {
        userAccountService.addUser(newUserAccount);
        return "redirect:/getUser";
    }

    @GetMapping(path = "edit-userAccount/{id}")
    public String editUserAccount (Model model, @PathVariable("id") Integer id){
        UserAccountEntity userAccountEntity = userAccountService.getUserById(id);
        model.addAttribute("userToBeEdited", userAccountEntity);
        return "redirect:/edit-userAccount";
    }

    @PostMapping(path = "userAccount/edit")
    public String editUserAccount(@ModelAttribute UserAccountEntity userToBeEdited){
        userAccountService.editUser(userToBeEdited);
        return "redirect:/getUser";
    }

    @GetMapping(path = "delete-userAccoount/{id}")
    public String delete(Model model, @PathVariable("id") Integer id){
        userAccountService.deleteUserById(id);
        return "redirect:/getUser";
    }
}
