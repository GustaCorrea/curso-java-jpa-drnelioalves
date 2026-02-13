package com.javacourse.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.coursejpa.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
