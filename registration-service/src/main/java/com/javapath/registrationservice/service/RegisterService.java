package com.javapath.registrationservice.service;

import com.javapath.registrationservice.models.User;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class RegisterService {

    private RestTemplate restTemplate;

    @Autowired
    public RegisterService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    
    public User generateUser() {

        int id = ThreadLocalRandom.current().nextInt(8);
        String name = "JP"+ RandomStringUtils.randomAlphabetic(8);
        
        return new User(id,name);

    }

    public User sendUser(User user) {
        User responseUser = restTemplate.postForObject("http://user-db-service/api/v1/adduser",user,User.class);

        if(responseUser == null){
            System.out.println("db-service returned empty user / not responding");
        }
        else {
            user = responseUser;
        }

        return user;
    }
}
