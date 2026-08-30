package com.employee.EmployeeRestApis.entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Employee {

    private int id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Department cannot be blank")
    private String dept;

    @Positive(message = "Salary must be greater than 0")
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee() {
    }

    public Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}
