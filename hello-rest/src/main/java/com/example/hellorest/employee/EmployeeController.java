package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id) {
        // Validate id => Number only
        boolean isNumber = true;
        for (String s : id.split("")) {
            if (isDigit(s)) {
                isNumber = false;
                break;
            }
        }
        int _id = isNumber ? Integer.parseInt(id) : 0;
        return new EmployeeResponse(_id, "Weerayooth", "Ohm");
    }

    private boolean isDigit(String s) {
        return "0123456789".indexOf(s) == -1;
    }
}
