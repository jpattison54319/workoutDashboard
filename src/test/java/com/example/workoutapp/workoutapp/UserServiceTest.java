package com.example.workoutapp.workoutapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.workoutapp.workoutapp.model.User;
import com.example.workoutapp.workoutapp.service.UserService;

import jakarta.transaction.Transactional;

@Transactional
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void addUserTest(){
        User user = new User("James","1234");
        userService.addUser(user);
        User user1 = userService.getUserById(user.getUsername());
        System.out.println(user1.getUsername() + ", " + user1.getPassword());
        assertEquals(user1.getUsername(),"James");
    }

//    @Test
//    public void getUserById(){
//        User user = userService.getUserById("Tim");
//        System.out.println(user);
//    }



}