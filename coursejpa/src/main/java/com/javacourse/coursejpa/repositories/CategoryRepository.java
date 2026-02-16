package com.javacourse.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.coursejpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}