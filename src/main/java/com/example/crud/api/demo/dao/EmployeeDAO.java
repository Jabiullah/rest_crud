package com.example.crud.api.demo.dao;

import com.example.crud.api.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
