package com.example.DoAnJava.Repository;


import com.example.DoAnJava.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}