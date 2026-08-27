package com.employee.EmployeeRestApis.controller;

import com.employee.EmployeeRestApis.entity.Employee;
import com.employee.EmployeeRestApis.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Employee>> getAllEmployees(){

//        List<Employee> employeeList = employeeService.getAllEmployees();
//        return ResponseEntity.ok(employeeList);
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    // http://localhost:8080/employees/101
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){

        Employee employee = employeeService.getEmployeeById(id);

        if(employee == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employee);
    }

    // http://localhost:8080/employees/search?department=Cooking
    @GetMapping("/search")
    public ResponseEntity<List<Employee>> getEmployeeByDept(@RequestParam String department){

        List<Employee> employeeList = employeeService.getEmployeeByDept(department);
        if(employeeList.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employeeList);
    }

    // http://localhost:8080/employees
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){

        Employee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(employee);
    }

    // http://localhost:8080/employees/103
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable int id, @RequestBody Employee employee){
        Employee updatedEmployee = employeeService.updateEmployeeById(id, employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    // http://localhost:8080/employees/101
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpById(@PathVariable int id){
        employeeService.deleteEmpById(id);
        return ResponseEntity.noContent().build();
    }
}
