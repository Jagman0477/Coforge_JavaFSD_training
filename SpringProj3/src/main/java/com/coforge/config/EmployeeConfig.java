package com.coforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Employee;

@Configuration
public class EmployeeConfig {

	@Bean
	public Employee getEmployee() {
		Employee e1 = new Employee();
		e1.setEmpId(5234);
		e1.setEmpName("Suman Suttewala");
		e1.setEmpSalary(120000.45f);
		
		return e1;
	}
	
}
