package com.employee.EmployeeRestApis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//Commented above line - as its prevents our application from connecting to the database
@SpringBootApplication
public class EmployeeRestApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestApisApplication.class, args);
	}

}
