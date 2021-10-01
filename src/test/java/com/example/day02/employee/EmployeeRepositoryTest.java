package com.example.day02.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void case01() {
        // Arrange
        Employee demo = new Employee();
        demo.setName("apisit");
        employeeRepository.save(demo);
        // Act
        Optional<Employee> result = employeeRepository.findById(1);
        // Assert
        assertTrue(result.isPresent());
        assertEquals("apisit", result.get().getName());
    }

}