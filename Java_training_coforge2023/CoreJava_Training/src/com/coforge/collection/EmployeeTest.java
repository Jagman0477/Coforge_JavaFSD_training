package com.coforge.collection;

import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		
		int id[] = {234,932,011};
		String names[] = {"Bishan Kumar", "Anand Kumar", "Chadik Long"};
		float salary[] = {30000f, 45000f, 2900000.97f};
	
		Employee e1[] = new Employee[3];
		
		for(int i = 0; i < e1.length; i++) {
			e1[i] = new Employee();
			e1[i].setEmployeeId(id[i]);
			e1[i].setEmployeeName(names[i]);
			e1[i].setEmpSalary(salary[i]);
		}
		
		EmployeeOperation o1 = new EmployeeOperation();
		
		for(Employee e: e1) {
			o1.addEmployee(e);
		}
		
		System.out.println("All employee list: ");
		List<Employee> allEmployees = o1.getAllEmployees();
		
		for(Employee e: allEmployees) {
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getEmpSalary());
		}
		
		if(o1.removeEmployee(2))
			System.out.println("\n"+"Removed employee"+"\n");
		else
			System.out.println("\n"+"Element not present"+"\n");
		
		for(Employee e: allEmployees) {
			System.out.println(+e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getEmpSalary());
		}
	}
	
}
