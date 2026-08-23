package com.employee.EmployeeRestApis.service;

import com.employee.EmployeeRestApis.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
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

    public Employee getEmployeeById(int id){

        Employee emp;

        switch (id){
            case 101:
                emp = new Employee(101,"Sneha","IT",80000);
                break;
            case 102:
                emp = new Employee(102,"Suhas","ME",75000);
                break;
            case 103:
                emp = new Employee(103,"Janu","Cooking",67000);
                break;
            default:
                emp = new Employee(0,null,null,0);
                break;
        }
        return emp;
    }

    public List<Employee> getEmployeeByDept(String department){

        List<Employee> deptWiseList;

        if(department.equals("IT")){
            deptWiseList = Arrays.asList(new Employee(101,"Sneha","IT",80000));
        } else if (department.equals("ME")) {
            deptWiseList = Arrays.asList(new Employee(102,"Suhas","ME",75000));
        }
        else{
            deptWiseList = Arrays.asList(new Employee(103,"Janu","Cooking",67000));
        }
        return deptWiseList;
    }

    public Employee createEmployee(Employee employee){

        return new Employee(employee.getId(),employee.getName(),employee.getDept(),employee.getSalary());
    }
}
