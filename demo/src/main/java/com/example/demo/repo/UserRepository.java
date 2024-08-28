package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {
    
}