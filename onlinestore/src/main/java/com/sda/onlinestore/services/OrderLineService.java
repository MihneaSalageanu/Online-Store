package com.sda.onlinestore.services;

import com.sda.onlinestore.entities.OrderEntity;
import com.sda.onlinestore.entities.OrderLineEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.repositories.OrderLineRepository;
import com.sda.onlinestore.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderLineService {

    @Autowired
    private OrderLineRepository orderLineRepository;

    public OrderLineRepository getOrderLineRepository() {
        return orderLineRepository;
    }

    public void setOrderLineRepository(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }

    public void getOrderLine(OrderLineEntity newOrderLine){
        this.orderLineRepository = orderLineRepository;
    }

    public List<OrderLineEntity> orderLineList(){
        return orderLineRepository.findAll();
    }

    public void addOrderLine(OrderLineEntity newOrderLine){
        orderLineRepository.save(newOrderLine);
    }


    public void deleteOrderLineById(Integer id){
        orderLineRepository.deleteById(id);
    }

    public void editEorderLine(OrderLineEntity editOrderLine){
        orderLineRepository.save(editOrderLine);
    }


}
