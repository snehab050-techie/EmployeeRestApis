//We don't need this class aymore..
// As we are directly working with employee repo interface which is extedning JPA repository
// Spring Data Jpa will provide these below methods for us

/*
package com.employee.EmployeeRestApis.repository;

import com.employee.EmployeeRestApis.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepository{

    private final Map<Integer,Employee> employees = new HashMap<>();

    public EmployeeRepository(){
        employees.put(
                101,
                new Employee(101,"Sneha","IT",85000)
        );

        employees.put(
                102,
                new Employee(102,"Suhas","ME",75000)
        );
    }

   public List<Employee> findALl(){

       //temporary data
       */
/* return List.of(
                new Employee(101,"Sneha","IT",80000),
                new Employee(102,"Suhas","ME",75000),
                new Employee(103,"Janu","Cooking",65000)
        );*//*


       return new ArrayList<>(employees.values());
    }

    public Employee findById(int id){
        */
/*return findALl().stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);*//*


        return employees.get(id);
    }


    public List<Employee> findEmployeesByDept(String dept){

        return employees
                .values()
                .stream()
                .filter(emp -> emp.getDept().equals(dept))
                .toList();
    }

    */
/*public Employee save(Employee employee){

        //created this to save valid ids to our in-memory db - map
        int newId = employees.keySet()
                        .stream()
                                .max(Integer::compareTo)
                                        .orElse(100)+1;
        employee.setId(newId);
        employees.put(newId,employee);
        return employee;
    }*//*




    public void deleteById(Integer id){
        employees.remove(id);
    }
}
*/
