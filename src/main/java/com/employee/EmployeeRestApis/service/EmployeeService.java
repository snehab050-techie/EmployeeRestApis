package com.employee.EmployeeRestApis.service;

import com.employee.EmployeeRestApis.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees(){

        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(101,"Sneha","IT",80000));
        emps.add(new Employee(102,"Suhas","ME",75000));
        emps.add(new Employee(103,"Janu","Cooking",67000));

        return emps;
    }
}
