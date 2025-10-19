package com.example.crud.api.demo.service;

import com.example.crud.api.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    List<String> findEmployee();

    Employee findByName(String name);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
