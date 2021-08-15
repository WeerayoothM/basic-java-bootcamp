package com.example.hellorest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component // anotation spring to load this class
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public Users getAllUsers(){
        return null;
    }

}
