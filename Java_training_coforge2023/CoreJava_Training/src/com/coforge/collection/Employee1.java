package com.coforge.collection;

public class Employee1 implements Comparable<Employee1 >{

	private int empId;
	private String empName;
	private float empSalary;
	
	public Employee1(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "\nEmployee1 [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee1 o) {
		if(this.empId > o.empId)
			return 1;
		else  if( this.empId<o.empId)
			return -1;
		else 
			return 0;
	}
	
}
