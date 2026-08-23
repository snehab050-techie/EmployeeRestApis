package com.employee.EmployeeRestApis.service;

import com.employee.EmployeeRestApis.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    // Method Get all employees
    public List<Employee> getAllEmployees(){

        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(101,"Sneha","IT",80000));
        emps.add(new Employee(102,"Suhas","ME",75000));
        emps.add(new Employee(103,"Janu","Cooking",67000));

        return emps;
    }

    // Method to fetch employee details by id
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

    // Method to search employee by dept
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

    // Method to create new employee
    public Employee createEmployee(Employee employee){

        return new Employee(employee.getId(),employee.getName(),employee.getDept(),employee.getSalary());
    }

    // Method to update existing employee by id
    public int updateEmployeeById(int id, Employee employee){

        Employee emp = switch (id) {
            case 101, 102, 103 ->
                    new Employee(employee.getId(), employee.getName(), employee.getDept(), employee.getSalary());
            default -> new Employee(0, null, null, 0);
        };
        return emp.getId();
    }

    // Method to delete emp by id
    public String deleteEmpById(int id){
        String res = "Employee deleted with id: "+id;
        return res;
    }
}
