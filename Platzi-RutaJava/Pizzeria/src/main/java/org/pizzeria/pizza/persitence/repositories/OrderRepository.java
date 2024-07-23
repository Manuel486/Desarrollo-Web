package org.pizzeria.pizza.persitence.repositories;

import org.pizzeria.pizza.persitence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
