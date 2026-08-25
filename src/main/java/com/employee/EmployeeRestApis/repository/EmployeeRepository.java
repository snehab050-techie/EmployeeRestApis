package com.employee.EmployeeRestApis.repository;

import com.employee.EmployeeRestApis.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

   public List<Employee> findALl(){

       //temporary data
        return List.of(
                new Employee(101,"Sneha","IT",80000),
                new Employee(102,"Suhas","ME",75000),
                new Employee(103,"Janu","Cooking",65000)
        );
    }

    public Employee findById(int id){
        return findALl().stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
