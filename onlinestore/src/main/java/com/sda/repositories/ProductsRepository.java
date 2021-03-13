package com.sda.repositories;

import com.sda.onlinestore.entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository <ProductsEntity, Long> {
}
