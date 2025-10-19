package com.example.crud.api.demo.dao;

import com.example.crud.api.demo.entity.Employee;
import com.example.crud.api.demo.rest.EmployeeRestController;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    // Define field for Entity Manager
    private EntityManager entityManager;
    // Set up constructor Injection
    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {
        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
        // execute query and get result list
        List<Employee>  employees = theQuery.getResultList();
        // return the result
        return employees;
    }

    @Override
    public List<String> findEmployee() {
        // create a query
        TypedQuery<String> theQuery = entityManager.createQuery("SELECT e.firstName FROM Employee e", String.class);
        // execute query and get result of fist Name of the Employees
        List<String>  employees = theQuery.getResultList();
        // return the result
        return employees;
    }

    @Override
    public Employee findByName(String name) {
        // get Employee
        Employee theEmployee = entityManager.find(Employee.class, name);
        //return Employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}
