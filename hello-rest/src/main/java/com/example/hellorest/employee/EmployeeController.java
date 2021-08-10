package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    public EmployeeResponse getEmployeeByID(int id){
        return new EmployeeResponse(1 , "Weerayooth","Ohm");
    }
}
