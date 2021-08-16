package com.example.hellorest.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserGatewayTest {

    @Autowired
    private UserGateway userGateway;

    @Test
    public void tryToCallAPI(){
        List<JsonMember> users = userGateway.getAllUsers();
        assertEquals(10,users.size());
    }

    @Test
    public void tryToCallGetUserById(){
        JsonMember user = userGateway.getUserById(1);
        assertEquals(1,user.getId());
        assertEquals("Leanne Graham",user.getName());

    }

}