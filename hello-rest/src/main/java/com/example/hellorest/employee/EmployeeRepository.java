package com.example.hellorest.employee;

import org.springframework.data.jpa.repository.JpaRepository;

// <Employee, Integer> := < map Entity? , primary key? >
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
