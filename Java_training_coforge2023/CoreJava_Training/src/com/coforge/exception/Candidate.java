package com.coforge.exception;

public class Candidate {

	private String name;
	private String gender;
	private float expectedSalary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(float expectedSalary) throws InvalidSalaryException {
		if(expectedSalary<10000)
			throw new InvalidSalaryException("Registration failed. Salary cannot be less then 10000");
		else 		
			this.expectedSalary = expectedSalary;
	}
	
	
	
}
