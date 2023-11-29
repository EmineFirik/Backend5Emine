package com.neotech.lesson05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static String dbUserName = "user1";
	public static String dbPassword = "Neotech@123";
	public static String dbUrl = "jdbc:mysql://147.182.216.34:3306/LibraryMgmt"; // 3306 port number//This is are
																					// database information

	public static void main(String[] args) throws SQLException {
		
		// Task
        // Retrieve all the book category names and store them in ArrayLIst
		// Print the Array List in the consolo
		
		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM bookcategory");

		List<String> categoryNames = new ArrayList <String>();
		
		while(rs.next()) {
		
			categoryNames.add(rs.getObject("BookCategoryName").toString());
			System.out.println(categoryNames);
			
			for( String name : categoryNames ) 
			{System.out.println(name+ " ");
				
			}
		
		
			
			
		}
		

	}

}
