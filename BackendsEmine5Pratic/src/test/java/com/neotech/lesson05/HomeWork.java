package com.neotech.lesson05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HomeWork {

	public static String dbUserName = "user1";
	public static String dbPassword = "Neotech@123";
	public static String dbUrl = "jdbc:mysql://147.182.216.34:3306/classicmodels";

	// Homework 1:

	// Connect to classicmodels database
	// Execute a query to get all information of customer with id 124
	// Get the resultset metadata
	// Print the number of columns
	// Get all the column names and store them in an arraylist
	// Print the Arraylist

	@Test
	public void MetaData() throws SQLException {

		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE customerNumber = 124");

		ResultSetMetaData rsMetaData = rs.getMetaData();
		
		int columnCount = rsMetaData.getColumnCount();
		
		System.out.println("Colum Count is-> "+columnCount );
		
		
		List < String > ColumNames = new ArrayList<>();
		
		for( int i = 1; i<=columnCount; i ++ ) 
		{
			
		ColumNames.add(rsMetaData.getColumnName(i));
			
		
		}
		
		System.out.println(ColumNames);
		
	}
	

}
