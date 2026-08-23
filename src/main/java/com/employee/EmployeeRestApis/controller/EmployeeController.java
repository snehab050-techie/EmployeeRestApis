package com.employee.EmployeeRestApis.controller;

import com.employee.EmployeeRestApis.entity.Employee;
import com.employee.EmployeeRestApis.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    // http://localhost:8080/employees
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    // http://localhost:8080/employees/101
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    // http://localhost:8080/employees/search?department=Cooking
    @GetMapping("/search")
    public List<Employee> getEmployeeByDept(@RequestParam String department){
        return employeeService.getEmployeeByDept(department);
    }

    // http://localhost:8080/employees
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    // http://localhost:8080/employees/103
    @PutMapping("/{id}")
    public int updateEmployeeById(@PathVariable int id, @RequestBody Employee employee){
        return employeeService.updateEmployeeById(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmpById(@PathVariable int id){
        return employeeService.deleteEmpById(id);
    }
}
