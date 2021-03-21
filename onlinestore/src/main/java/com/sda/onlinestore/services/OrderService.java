package com.sda.onlinestore.services;

import com.sda.onlinestore.entities.OrderEntity;
import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.repositories.OrderRepository;
import com.sda.onlinestore.repositories.UserAccountRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void findById(Integer id) {
        orderRepository.findById(id);
    }

    public void editOrder(OrderEntity editedOrder) {
        orderRepository.save(editedOrder);
    }

    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }

    public List<OrderEntity> getAllOrders() {
        List<OrderEntity> orderEntityList = orderRepository.findAll();
        return orderEntityList;
    }

    public void addToChart(Integer userId, Integer productId){
        OrderEntity orderEntity = new OrderEntity();
        Optional<UserAccountEntity> userBox =
    }

}
