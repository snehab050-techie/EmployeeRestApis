package com.employee.EmployeeRestApis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmployeeRestApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestApisApplication.class, args);
	}

}
