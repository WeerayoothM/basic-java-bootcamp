package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerMockBeanTest {

    @Autowired
    private TestRestTemplate restTemplate;

    // เป็นการจำลอง
    @MockBean
    private Random random;

    @MockBean
    private EmployeeRepository repository;

    @Test
    public void callApiWithPathVariableWithoutDatabase() {
        // Mock/Stub/Spy
        when(random.nextInt(anyInt())).thenReturn(7);

        Employee mock = new Employee(123,"Mock fname","Mock lname");
        when(repository.findById(123)).thenReturn(
               Optional.of(mock)
        );

        // Call api
        // convert Json to EmployeeResponse สร้างโดยใช้ default contructor
        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);

        EmployeeResponse expected = new EmployeeResponse(123,"Mock fname7","Mock lname");

        assertEquals(123 ,response.getId());
        assertEquals("Mock fname7",response.getFname());
        assertEquals("Mock lname",response.getLname());
        assertEquals(expected,response);
    }

    @Test
    public void callApiWithPathVariableWithoutDatabaseAndEmployeeNotFound() {
        // Mock/Stub/Spy
        when(random.nextInt(anyInt())).thenReturn(7);

        when(repository.findById(123)).thenReturn(
                Optional.empty()
        );

        // Call api
        // convert Json to EmployeeResponse สร้างโดยใช้ default contructor
        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);

        EmployeeResponse expected = new EmployeeResponse();

        assertEquals(0,response.getId());
        assertNull(response.getFname());
        assertNull(response.getLname());
        assertEquals(expected,response);
    }


}