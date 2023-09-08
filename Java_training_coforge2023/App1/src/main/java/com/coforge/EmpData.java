package com.coforge;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpData {

	public static void main(String[] args) {
		
		try {
			
			//1. Load driver
			//1st way to load driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//2nd way to load Driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Connection url username pass
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "root");
			if(connection == null)
				System.out.println("Connection error");
			else 
				System.out.println("Connection successfull");
			
			Statement st = connection.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID, name and salary: ");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			float salary = sc.nextFloat();
			
			// executeUpdate for insert, update, delete
			int x = st.executeUpdate("INSERT into employee VALUES("+id+", '"+name+"', "+salary+")");
			System.out.println(x+"Record added.");
//			
			// executeQuery for -- select
			ResultSet rs = st.executeQuery("Select * from employee");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
			}
			
		} catch(SQLException e) {
			System.err.println(e.getMessage()+" sql state "+e.getSQLState());
		} 
//		This is for 1st method
//		catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	
}
