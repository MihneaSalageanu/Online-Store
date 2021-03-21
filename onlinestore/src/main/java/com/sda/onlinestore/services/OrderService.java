package com.sda.onlinestore.services;

import com.sda.onlinestore.entities.OrderEntity;


import com.sda.onlinestore.entities.UserAccountEntity;
import com.sda.onlinestore.repositories.OrderRepository;
import com.sda.onlinestore.repositories.ProductsRepository;
import com.sda.onlinestore.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Autowired
    private ProductsRepository productsRepository;

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

<<<<<<< HEAD
//    public void addToChart(Integer userId, Integer productId){
//        OrderEntity orderEntity = new OrderEntity();
//        Optional<UserAccountEntity> userBox =
//    }
=======
   


>>>>>>> ca145a09790a54afd0437def1786d88f33351612

}
