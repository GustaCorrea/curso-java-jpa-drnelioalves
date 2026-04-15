package com.javacourse.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.coursejpa.entities.OrderItem;
import com.javacourse.coursejpa.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
