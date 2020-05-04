package com.javapath.registrationservice.controllers;


import com.javapath.registrationservice.models.User;
import com.javapath.registrationservice.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private RegisterService registerService;

    @Autowired
    public UserController(RegisterService registerService){
        this.registerService = registerService;
    }

    @GetMapping
    public String hello(){
        return "Hello From registration Service";
    }

    @GetMapping("/adduser")
    public String addRandomUser() {
        User user = registerService.generateUser();
        if(user!=null){
            User response = registerService.sendUser(user);
            user = response;
        }
        return "User with " + user.getUserId() + " Id added successfuly";
    }
}
