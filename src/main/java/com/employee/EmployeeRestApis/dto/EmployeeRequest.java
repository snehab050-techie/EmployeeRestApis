package com.employee.EmployeeRestApis.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

//Specifies what data our application can receive from client
public class EmployeeRequest {

    // Did not include id - because if the client is creating an employee - the client shouldn't normally decide the
    // database id - our application/database can generate the id
    // so, this request DTO contains only what client needs to provide

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Dept cannot be blank")
    private String dept;

    @Positive(message = "Salary should be greater than 0")
    private int salary;

    public EmployeeRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
