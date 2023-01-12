package com.example.workoutapp.workoutapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.workoutapp.workoutapp.model.User;


public interface UserRepository extends JpaRepository<User,String> {
}