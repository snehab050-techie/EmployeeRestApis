package com.employee.EmployeeRestApis.repository;

import com.employee.EmployeeRestApis.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepoInterface extends JpaRepository<Employee, Integer> {
}
