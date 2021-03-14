package com.sda.onlinestore.repositories;

import com.sda.onlinestore.entities.OrderLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLineEntity, Integer>  {

}
