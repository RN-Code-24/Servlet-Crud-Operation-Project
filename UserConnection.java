package com.jsp.servlet_simple_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class UserConnection {
	
	public static Connection getUserConnection() {
		
		
		try {
			Driver d = new Driver();
			
			DriverManager.registerDriver(d);
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb", "root", "2024");
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
		
		
	}

}
