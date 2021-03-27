package com.sda.onlinestore.repositories;

import com.sda.onlinestore.entities.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Integer> {

    public Optional<UserAccountEntity> findByUsername(String username);
}
