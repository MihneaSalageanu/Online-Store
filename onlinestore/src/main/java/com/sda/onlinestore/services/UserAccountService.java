package com.sda.onlinestore.services;

import com.sda.onlinestore.entities.CategoryEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserAccountService implements UserDetailsService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<UserAccountEntity> allUserAccounts() {
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
        Optional<UserAccountEntity> optionalUserAccountEntity = userAccountRepository.findById(id);
        return optionalUserAccountEntity.get();
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Optional<UserAccountEntity> userAccountEntityOptional = userAccountRepository.findByUsername(s);
        if (userAccountEntityOptional.isPresent()) {
            UserAccountEntity user = userAccountEntityOptional.get();

            String username = user.getUsername();
            String password = user.getPassword();
            List<GrantedAuthority> listaDeRoluri = Arrays.asList(new SimpleGrantedAuthority(user.getRole()));
            UserDetails userDetails = new User(username, password, listaDeRoluri);
            return userDetails;
        }
        throw new UsernameNotFoundException("User not found");
    }

    public void addCustomer(UserAccountEntity user){
        user.setRole("ROLE_CUSTOMER");
        String password = user.getPassword();
        String encodedPassword = passwordEncoder.encode(password);
        user.setPassword(encodedPassword);
        userAccountRepository.save(user);
    }


}
