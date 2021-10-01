package com.example.day02.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getById() {
        EmployeeResponse result = restTemplate.getForObject("/employee/1", EmployeeResponse.class);
        // Assert
        assertEquals(1, result.getId());
        assertEquals("apisit", result.getName());
    }
}