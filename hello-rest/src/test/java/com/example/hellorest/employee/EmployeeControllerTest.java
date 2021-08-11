package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void callApiWithPathVariable() {
        // convert Json to EmployeeResponse สร้างโดยใช้ default contructor
        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);

        EmployeeResponse expected = new EmployeeResponse(123,"Weerayooth","Ohm");

        assertEquals(123 ,response.getId());
        assertEquals("Weerayooth",response.getFname());
        assertEquals("Ohm",response.getLname());
        assertEquals(expected,response);
    }

    @Test
    public void callApiWithRequestParam() {
        // convert Json to EmployeeResponse สร้างโดยใช้ default contructor
        EmployeeResponse response = restTemplate.getForObject("/employee?id=777", EmployeeResponse.class);
        assertEquals(777 ,response.getId());
        assertEquals("Weerayooth",response.getFname());
        assertEquals("Ohm",response.getLname());
    }

}