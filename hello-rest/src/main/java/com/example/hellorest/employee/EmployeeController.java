package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id) {
        // Validate id => Number only
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        }catch (Exception e){
          //Error => TODO
        }

        return new EmployeeResponse(_id, "Weerayooth", "Ohm");
    }

    private boolean isDigit(String s) {
        return "0123456789".indexOf(s) == -1;
    }
}
