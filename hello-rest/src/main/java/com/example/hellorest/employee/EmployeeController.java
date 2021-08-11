package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class EmployeeController {

    @Bean
    public Random createNewRandom(){
        return new Random();
    }

    @Autowired
    private Random random;

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

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest request){
        // Validation  send body with wrong key
        return new EmployeeResponse(999,request.getFname(), request.getLname());
    }

}
