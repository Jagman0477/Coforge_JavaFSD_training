package com.coforge.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.Employee;

public class EmployeeMain {

	public static void main(String[] args) throws SQLException {
		
		String ch = "y";
		Scanner sc = new Scanner(System.in);
		Employee emp;
		
		while(ch.equals("y")) {
			System.out.println("1. Add employee");
			System.out.println("2. Get employee");
			System.out.println("3. Get all employees");
			
			int op = sc.nextInt();
			
			EmployeeDao dao = new EmployeeDao();
			
			switch(op) {
				case 1:	
					emp = null;
					emp = new Employee();
					System.out.println("Enter employee id, name, salary: ");
					emp.setId(sc.nextInt());
					sc.nextLine();
					emp.setName(sc.nextLine());
					emp.setSalary(sc.nextFloat());
					
					try {
						if(dao.addEmployee(emp)) {
							System.out.println("Record added");
						} else {
							System.out.println("Record already exists");
						}
					} catch(SQLException e){
						e.printStackTrace();
					}
					break;
				case 2: 
					System.out.println("Enter Employee id to search: ");
					Employee e1;
					e1 = dao.getEmployee(sc.nextInt());
					System.out.println(e1.getId()+"\t"+e1.getName()+"\t"+e1.getSalary());
					
				case 3: 
					dao.getAllEmployees().forEach(e -> System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()));
					break;
				
				default:
					System.out.println("Invalid choice.");
					
			}
		
		}
	}
}
