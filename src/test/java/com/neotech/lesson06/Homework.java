package com.neotech.lesson06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Homework {
	

	// Homework 1:

	// Connect to classicmodels database
	// Execute a query to get all information of customer with id 124
	// Get the resultset metadata
	// Print the number of columns
	// Get all the column names and store them in an arraylist
	// Print the Arraylist
	
	public static String dbUserName = "user1";
	public static String dbPassword = "Neotech@123";
	public static String dbUrl = "jdbc:mysql://147.182.216.34:3306/classicmodels"; // 3306 port number//This is are

	// Connection DateBase ile
	
	@Test
	public void getMetaDate() throws SQLException {
		
		//Burada once conn, st,rs i bulup yaziyoruz test baslamadan onceki ilk adimlar
		//Bu uc adim testin olmazsa olmazi
		
		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE customerNumber =124");
		
		ResultSetMetaData  rsMetaData = rs.getMetaData();
		
		int colCount  = rs.getMetaData().getColumnCount();
		System.out.println(colCount);
		
		List<String> ls = new ArrayList <String>();
		
		for( int i=1; i <=colCount ; i++) {
			
			ls.add(rsMetaData.getColumnName(i));
			
		}
		
		System.out.println(ls);
		//how to read all data 
		//rs.next();
		//String customerName = rs.getString("customerName");
		//System.out.println(customerName);
		
		//String phoneNumber  = rs.getString("phone");
		//System.out.println("Phone Number -> " +phoneNumber);
		
		while( rs.next()) {
		
			String customerNamem = rs.getString("customerName");
			String phoneNumberr  = rs.getString("phone").toString();
			System.out.println(customerNamem + " : "+phoneNumberr);
			
			
		}
		
		rs.close();
		conn.close();
		st.close();
	}
	
	
}
