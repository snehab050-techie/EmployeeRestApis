package com.employee.EmployeeRestApis.repository;

import com.employee.EmployeeRestApis.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
