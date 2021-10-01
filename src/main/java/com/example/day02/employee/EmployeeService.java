package com.example.day02.employee;

public class EmployeeService {
    public EmployeeResponse get(int id) {
        return new EmployeeResponse(id, "apisit");
    }
}
