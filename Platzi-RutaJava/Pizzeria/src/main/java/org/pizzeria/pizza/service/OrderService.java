package org.pizzeria.pizza.service;

import org.pizzeria.pizza.persitence.entity.OrderEntity;
import org.pizzeria.pizza.persitence.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;


    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> getAll() {
        return this.orderRepository.findAll();
    }
}
