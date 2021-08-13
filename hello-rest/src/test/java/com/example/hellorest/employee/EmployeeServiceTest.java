package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

// Junit + Mockito world
@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {
    // MockBean use for Spring only
    @Mock
    private Random random;

    @Mock
    private EmployeeRepository repository;

    @Test
    public void employee100Notfound(){
        when(random.nextInt(10)).thenReturn(10);

        when(repository.findById(100)).thenReturn(
                Optional.empty()
        );

        EmployeeService service = new EmployeeService();

        service.setRandom(random); // Setter/ field/ property Injection
        service.setRepository(repository);
        EmployeeResponse response = service.process(100);

        assertEquals(0,response.getId());
        assertNull(response.getFname());
        assertNull(response.getLname());
    }

    @Test
    public void foundEmployeeId1(){
        when(random.nextInt(10)).thenReturn(10);

        Employee mock = new Employee(1,"Service name","Service lname");
        when(repository.findById(1)).thenReturn(
                Optional.of(mock)
        );

        EmployeeService service = new EmployeeService(); // (random) Constructor Injection
        service.setRandom(random); // Setter/ field/ property Injection
        service.setRepository(repository);

        EmployeeResponse result = service.process(1); // .process(random, 1) Method Injection
        assertEquals(1 , result.getId());
        assertEquals("Service name10",result.getFname());
        assertEquals("Service lname",result.getLname());
    }

}