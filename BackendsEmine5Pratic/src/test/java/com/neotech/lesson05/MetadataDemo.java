package com.neotech.lesson05;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetadataDemo {

	public static String dbUserName = "user1";
	public static String dbPassword = "Neotech@123";
	public static String dbUrl = "jdbc:mysql://147.182.216.34:3306/classicmodels"; // 3306 port number//This is are

	@Test
	public void dbMetaData() throws SQLException

	{
		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		
		DatabaseMetaData dbMetaData = conn.getMetaData();
		
		String driverName = dbMetaData.getDriverName();
		System.out.println(driverName);
		
		String dbVersion = dbMetaData.getDatabaseProductVersion();
		System.out.println(dbVersion);
		
		String dbName = dbMetaData.getDatabaseProductName();
		System.out.println(dbName);
		conn.close();
	}
	
	@Test
	public void rsMetaData () throws SQLException 
	{
		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM employees WHERE employeeNumber =1076");
		
		ResultSetMetaData rsMetaData = rs.getMetaData();
		
		int columnCount = rsMetaData.getColumnCount();
		System.out.println("Colum count is "+ columnCount);
		
		String columnMane1 = rsMetaData.getColumnName(1);
		System.out.println("Colum Name-> "+ columnMane1);
		
		String columnMane3 = rsMetaData.getColumnName(3);
		System.out.println("Colum Name ->"+columnMane3);
		
		System.out.println("Print all colum names");
		
		for( int i= 1; i<=columnCount; i++) {
			String columName = rsMetaData.getColumnName(i);
			System.out.println("ColumName->" +i +" ->"+columName);
		}
		
		
	}

}
