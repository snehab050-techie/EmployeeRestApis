package com.employee.EmployeeRestApis.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

//    private String dept;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

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

    public Department getDept() {
        return department;
    }

    public void setDept(Department dept) {
        this.department = dept;
    }

    public Employee() {
    }

    public Employee(int id, String name, Department dept, int salary) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }
}
