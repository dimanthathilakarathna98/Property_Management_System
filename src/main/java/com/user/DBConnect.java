package com.user;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static String url = "jdbc:mysql://localhost:3306/propertymanagement";
	private static String username = "root";
	private static String password = "12345";
	private static Connection con;
	
	private DBConnect() {
		
	}
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			//Java Database Connectivity
			con = DriverManager.getConnection(url, username, password);
			
		}
		catch(Exception e) {
			System.out.println("Database Connection is not Successful..!!");
		}
		return con;
		
	}
}
