package com.jdbc.ajp.project.student_mgmt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	static public Connection getConnection() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/studentdb";
	   return DriverManager.getConnection(url,"root","root");	
	}

}
