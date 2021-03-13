package com.sda.repositories;

import com.sda.onlinestore.entity.OrderLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLineEntity, Integer>  {

}
