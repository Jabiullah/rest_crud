package com.example.crud.api.demo.rest;

import com.example.crud.api.demo.dao.EmployeeDAO;
import com.example.crud.api.demo.entity.Employee;
import com.example.crud.api.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

//  (using constructor injection)
    @Autowired
    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

//  define endpoint for "/employees" - return a list of employees
    @GetMapping("/employees-details")
    public List<Employee> getEmployeesDetails(){
        return employeeService.findAll();
    }

    @GetMapping("/employees-list")
    public List<String> getEmployees(){
        return employeeService.findEmployee();
    }

}
