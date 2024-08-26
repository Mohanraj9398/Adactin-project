package com.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnector {
	
	String userName ="root";
	String password ="Mohan@9398";
	String url ="jdbc:mysql://localhost:3306/employees";
	String query= "selet * from salaries limit 5";
	
	private void readPerticularData() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		
	} 
	
	private void readAllData() {
		
		
	}

}
