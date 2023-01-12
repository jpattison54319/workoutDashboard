package com.example.workoutapp.workoutapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workoutapp.workoutapp.model.User;
import com.example.workoutapp.workoutapp.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public User getUserById(String id){
        User user = userRepository.getReferenceById(id);
        return user;
    }



}
