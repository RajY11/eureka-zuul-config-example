package com.javapath.userdbservice.service;

import com.javapath.userdbservice.models.User;
import com.javapath.userdbservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }
}
