package com.example.hellorest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserGateway userGateway;

    @GetMapping("/users")
    public List<JsonMember>  getAllUsers(@RequestParam(defaultValue = "1") String divider){
        int _divider = !divider.equals("0")  ? Integer.parseInt(divider) : 1;

        List<JsonMember> users = userGateway.getAllUsers();
        List<JsonMember> results = new ArrayList<>();
        for (JsonMember user : users) {
            if (user.getId() % _divider == 0){
                results.add(user);
            }
        }
        return results;
    }
}
