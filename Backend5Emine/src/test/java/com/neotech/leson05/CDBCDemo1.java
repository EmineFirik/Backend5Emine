package com.neotech.leson05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CDBCDemo1 {
	
	public static String dbUserName = "user1";
	public static String dbPassword = "Neotech@123";
	//DB url format
	//jdbc:jdbctype://ipaddress:portnumber/db_name
	public static String dbUrl = 
			"jdbc:mysql://147.182.216.34:3306/LibraryMgmt";
	
	
	
	
	public static void main(String[] args) throws SQLException {
	
		
	
		
		//Create a connection to the database
		Connection conn = 
				DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		
		System.out.println("Database connection is successful!!!");
		
		// Create a statement
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM book");
		
		System.out.println("------------------");
		//print the object 
		System.out.println(rs.toString());
		
		
		
		rs.next();
		
		String bookName1 = rs.getString("BookName");
		System.out.println(bookName1);
		
		rs.next();
		
		String bookName2 = rs.getString(2);
		System.out.println(bookName2);
		
		rs.next();
		
		String bookName3 = rs.getObject("BookName").toString();
		System.out.println(bookName3);
		
		System.out.println("Geting values using a loop!!!");
		
		while(rs.next())
		{
			String bookName = rs.getObject("BookName").toString();
			System.out.println(bookName);
		}
		
		//close the connection and other objects
		
		rs.close();
		st.close();
		conn.close();
		
	}

	

}
