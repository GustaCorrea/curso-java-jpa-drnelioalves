package com.javacourse.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.coursejpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
