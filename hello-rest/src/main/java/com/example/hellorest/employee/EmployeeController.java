package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class EmployeeController {
    @Autowired
    private MyRandom random;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id) {
        // Validate id => Number only
        int _id = 0;
        try{
            System.out.println(Integer.parseInt(id));
            _id = Integer.parseInt(id);
        }catch (Exception e){
          //Error => TODO
        }

        // Workshop

        int number = random.nextInt(10);

        return new EmployeeResponse(_id, "Weerayooth" + number, "Ohm");
    }

    // employee?id2=?
    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByID2(@RequestParam(defaultValue = "") String id) {
        // Validate id => Number only
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        }catch (Exception e){
            //Error => TODO
        }

        return new EmployeeResponse(_id, "Weerayooth", "Ohm");
    }

}
