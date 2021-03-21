package com.sda.onlinestore.services;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    public List<UserAccountEntity> allUserAccounts(){
        return userAccountRepository.findAll();
    }

    public void addUser(UserAccountEntity newUser) {
        userAccountRepository.save(newUser);
    }

    public void deleteUserById(Integer id) {
        userAccountRepository.deleteById(id);
    }

    public void editUser(UserAccountEntity editedUser) {
        userAccountRepository.save(editedUser);
    }

    public UserAccountEntity getUserById(Integer id) {
        Optional<UserAccountEntity> optionalUserAccountEntity= userAccountRepository.findById(id);
        return optionalUserAccountEntity.get();
    }
}
