package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.EmployeeConfig;
import com.coforge.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		Employee e1 = ctx.getBean(Employee.class);
		
		System.out.println(e1);
	}
	
}
