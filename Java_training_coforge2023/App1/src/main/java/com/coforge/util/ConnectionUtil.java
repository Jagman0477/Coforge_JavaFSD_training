package com.coforge.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	static Connection conn ;
	
	// Load in the driver
	static {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Make static/singleton connection
	public static Connection userConn() throws SQLException {
		if(conn == null) {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "root");
		}
		
		return conn;
	}
	
}
