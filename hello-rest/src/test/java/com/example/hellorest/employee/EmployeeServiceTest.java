package com.example.hellorest.employee;

import org.junit.jupiter.api.BeforeEach;
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

    @BeforeEach
    public void setupMock(){
        when(random.nextInt(10)).thenReturn(10);
    }

    @Test
    public void employee100Notfound(){

        when(repository.findById(100)).thenReturn(
                Optional.empty()
        );

        EmployeeService service = new EmployeeService();

        service.setRandom(random); // Setter/ field/ property Injection
        service.setRepository(repository);

        Exception exception = assertThrows(EmployeeNotFoundException.class, ()->
                service.process(100)
        );

        assertEquals("Employee id 100 not found",exception.getMessage());
    }

    @Test
    public void foundEmployeeId1(){

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