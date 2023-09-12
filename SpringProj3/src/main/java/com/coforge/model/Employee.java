package com.coforge.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee {

	private int empId;
	private String empName;
	private float empSalary;
	
	@PostConstruct
	public void init() {
		this.empId = 1244;
		this.empName = "Gajodhar Gonzalez Ganjedi";
		this.empSalary = 4600.57f;
	}
	
}
