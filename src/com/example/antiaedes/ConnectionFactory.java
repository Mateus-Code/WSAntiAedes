package com.example.antiaedes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String URL = "jdbc:mysql://localhost:3306/antiaedes";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	public static Connection getConnection(){
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		     e.printStackTrace();
		}
		try {
			return DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}  catch (SQLException e) {
            System.out.println("Error.");
            return null;
        }
	}
}