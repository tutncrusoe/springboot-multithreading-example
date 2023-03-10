package com.example.springbootmultithreadingexample.repository;

import com.example.springbootmultithreadingexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
