package com.example.crud.api.demo.rest;

import com.example.crud.api.demo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/test")
public class EmployeeRestController {
    //define endpoint for "/employees" - return a list of employees
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return null;
    }
}
