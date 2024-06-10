package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		String userName = "root";
		String password = "Sithumbuddhika2002";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinepropertymanagement?characterEncoding=utf8",userName , password);
		
		return con;
	}

}
