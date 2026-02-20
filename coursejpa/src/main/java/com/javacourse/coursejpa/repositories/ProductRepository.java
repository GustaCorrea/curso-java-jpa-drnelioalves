package com.javacourse.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.coursejpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}