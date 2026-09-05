package com.employee.EmployeeRestApis.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String deptName;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
