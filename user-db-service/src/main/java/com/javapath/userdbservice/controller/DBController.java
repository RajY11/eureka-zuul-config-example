package com.javapath.userdbservice.controller;


import com.javapath.userdbservice.models.User;
import com.javapath.userdbservice.repository.UserRepository;
import com.javapath.userdbservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DBController {

    private UserService userService;

    @Autowired
    public DBController(UserService userServicece){

        this.userService = userServicece;
    }


    @PostMapping("/adduser")
    public User addUser(@RequestBody User user){
        User response = userService.saveUser(user);
        return response;
    }
}
