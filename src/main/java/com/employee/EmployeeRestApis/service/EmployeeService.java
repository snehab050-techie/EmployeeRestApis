package com.employee.EmployeeRestApis.service;

import com.employee.EmployeeRestApis.dto.EmployeeRequest;
import com.employee.EmployeeRestApis.dto.EmployeeResponse;
import com.employee.EmployeeRestApis.entity.Employee;
import com.employee.EmployeeRestApis.exception.EmployeeNotFoundException;
import com.employee.EmployeeRestApis.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    // Method Get all employees
    public List<Employee> getAllEmployees(){

       /* List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(101,"Sneha","IT",80000));
        emps.add(new Employee(102,"Suhas","ME",75000));
        emps.add(new Employee(103,"Janu","Cooking",67000));

        return emps;*/

        return employeeRepository.findALl();
    }

    // Method to fetch employee details by id
    public Employee getEmployeeById(int id){

        /*Employee emp;

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
        return emp;*/

//        return employeeRepository.findById(id);

        Employee employee = employeeRepository.findById(id);
        if(employee == null){
            throw new EmployeeNotFoundException("Employee not found with id: "+id);
        }
        return employee;
    }

    // Method to search employee by dept
    public List<Employee> getEmployeeByDept(String department){

        return employeeRepository.findEmployeesByDept(department);
    }

    // Method to create new employee
    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest){

//        return new Employee(employee.getId(),employee.getName(),employee.getDept(),employee.getSalary());
        Employee employee = new Employee();

        employee.setName(employeeRequest.getName());
        employee.setDept(employeeRequest.getDept());
        employee.setSalary(employeeRequest.getSalary());

        Employee savedEmployee = employeeRepository.save(employee);

        return new EmployeeResponse(
                savedEmployee.getId(),
                savedEmployee.getName(),
                savedEmployee.getDept(),
                savedEmployee.getSalary());
    }

    // Method to update existing employee by id
    public Employee updateEmployeeById(int id, Employee employee){

       /* Employee emp = switch (id) {
            case 101, 102, 103 ->
                    new Employee(employee.getId(), employee.getName(), employee.getDept(), employee.getSalary());
            default -> new Employee(0, null, null, 0);
        };
        return emp.getId();*/

        Employee foundEmp = employeeRepository.findById(id);
        if(foundEmp == null){
            throw new EmployeeNotFoundException("Employee not found with id: "+id);
        }

        employee.setId(id);

        return employeeRepository.save(employee);
    }

    // Method to delete emp by id
    public void deleteEmpById(int id){

//        String res = "Employee deleted with id: "+id;

        Employee employee = employeeRepository.findById(id);
        if(employee == null){
            throw new EmployeeNotFoundException("Employee not found with id: "+id);
        }
        employeeRepository.deleteById(id);
    }
}
