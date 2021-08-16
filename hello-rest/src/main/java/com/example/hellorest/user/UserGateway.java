package com.example.hellorest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component // anotation spring to load this class
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public Users getAllUsers(){
        Users results = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users",Users.class);
        return results;
    }

    public JsonMember getUserById(int id){

        String url = "https://jsonplaceholder.typicode.com/users/" + id;

        JsonMember results = restTemplate.getForObject(url,JsonMember.class);
        return results;
    }

}
