package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coforge.Employee;
import com.coforge.util.ConnectionUtil;

public class EmployeeDao {

	Connection connection;
	Statement statement;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public EmployeeDao() throws SQLException {
		connection = ConnectionUtil.userConn();
	}
	
	public boolean addEmployee(Employee emp) throws SQLException {
		resultSet = null;
		if(getEmployee(emp.getId()) == null) {
			preparedStatement = connection.prepareStatement("INSERT into employee VALUES(?,?,?)");
			preparedStatement.setInt(1, emp.getId());
			preparedStatement.setString(2, emp.getName());
			preparedStatement.setFloat(3, emp.getSalary());
			preparedStatement.executeUpdate();
			return true;
		}
		return false;
	}
	
	public Employee getEmployee(int id) throws SQLException {
		resultSet = null;
		preparedStatement = connection.prepareStatement("SELECT * from employee where empId = ?");
		preparedStatement.setInt(1, id);
		
		resultSet = preparedStatement.executeQuery();
		resultSet.next();
		
		Employee e1 = null;
		
		while(resultSet.next()) {
			e1 = new Employee();
			e1.setId(resultSet.getInt(1));
			e1.setName(resultSet.getString(2));
			e1.setSalary(resultSet.getFloat(3));
		}
		
		return e1;
	}
	
	List<Employee> empList=new ArrayList<>();
	public List<Employee> getAllEmployees() throws SQLException{
		statement = connection.createStatement();
		resultSet = null;
		resultSet = statement.executeQuery("SELECT * from employee;");
		
		Employee e1 = new Employee();
		while(resultSet.next()) {
			e1 = null;
			e1.setId(resultSet.getInt(1));
			e1.setName(resultSet.getString(2));
			e1.setSalary(resultSet.getFloat(3));
			empList.add(e1);
		}
		return empList;
	}
	
}
