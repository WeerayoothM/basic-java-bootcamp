package com.example.hellorest.user;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component // anotation spring to load this class
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public List<JsonMember> getAllUsers(){
        JsonMember[] results = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", JsonMember[].class);
        assert results != null;
        return Arrays.asList(results);
    }

    public JsonMember getUserById(int id){

        String url = "https://jsonplaceholder.typicode.com/users/" + id;

        JsonMember results = restTemplate.getForObject(url,JsonMember.class);
        return results;
    }

}
