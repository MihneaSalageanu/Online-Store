package com.sda.onlinestore.repositories;

import com.sda.onlinestore.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer>{
}
