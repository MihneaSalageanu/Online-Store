package com.sda.onlinestore.services;

import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    public void addUser(UserAccountEntity newUser) {
        userAccountRepository.save(newUser);
    }

    public void deleteUserById(Integer id) {
        userAccountRepository.deleteById(id);
    }

    public void editUser(UserAccountEntity editedUser) {
        userAccountRepository.save(editedUser);
    }
}
