package com.employee.EmployeeRestApis.repository;

import com.employee.EmployeeRestApis.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepository {

    private final Map<Integer,Employee> employees = new HashMap<>();

    public EmployeeRepository(){
        employees.put(
                101,
                new Employee(101,"Sneha","IT",85000)
        );

        employees.put(
                102,
                new Employee(102,"Suhas","ME",75000)
        );
    }

   public List<Employee> findALl(){

       //temporary data
       /* return List.of(
                new Employee(101,"Sneha","IT",80000),
                new Employee(102,"Suhas","ME",75000),
                new Employee(103,"Janu","Cooking",65000)
        );*/

       return new ArrayList<>(employees.values());
    }

    public Employee findById(int id){
        /*return findALl().stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);*/

        return employees.get(id);
    }

    public Employee save(Employee employee){
        employees.put(employee.getId(),employee);
        return employee;
    }

    public void deleteById(Integer id){
        employees.remove(id);
    }
}
