package com.example.day02.employee;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    @AfterEach
    public void clearData() {
        employeeRepository.deleteAll();
    }

    @Test
    public void getById() {
        // Arrange
        Employee demo = new Employee();
        demo.setName("apisit");
        employeeRepository.save(demo);

        EmployeeResponse result = restTemplate.getForObject("/employee/1", EmployeeResponse.class);
        // Assert
        assertEquals(1, result.getId());
        assertEquals("apisit", result.getName());
    }

 //   @Test
 //   public void getById2() {
        // Arrange

  //      EmployeeResponse result = restTemplate.getForObject("/employee/1", EmployeeResponse.class);
        // Assert
   //     assertEquals(2, result.getId());
   //     assertEquals("apisit2", result.getName());
   // }

//    @Test
 //   public void getAll() {
        // Arrange
//        Employee demo = new Employee();
//        demo.setName("apisit");
//        employeeRepository.save(demo);
        // Act
//        EmployeeResponse[] result = restTemplate.getForObject("/employee", EmployeeResponse[].class);
        // Assert
//        assertEquals(2, result.length);
 //   }
}