package com.neotech.lesson05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
	
	
	public static String dbUserName = "user1";
	public static String dbPassword = "Neotech@123";
	public static String dbUrl = "jdbc:mysql://147.182.216.34:3306/LibraryMgmt"; //3306 port number//This is are database information
	
	
	public static void main(String[] args) throws SQLException {
		
		//Connection icin
		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		
		System.out.println("Database connection is suscessfull!!");
		//Create statment
		Statement st = conn.createStatement();
		
		//excecute query
		ResultSet rs = st.executeQuery("SELECT * FROM book");
		
		System.out.println("___________________________");
		
		
		rs.next();
		String bookname1 = rs.getString("BookName");
		System.out.println(bookname1);
		
		rs.next();
		String bookname2 = rs.getString(2);
		System.out.println(bookname2);
		
		rs.next();
		String bookname3 = rs.getObject("BookName").toString();
		System.out.println(bookname3);
		
		System.out.println("Loop ---------------");
		
		while( rs.next()) 
		{
			String bookName = rs.getObject("BookName").toString();
			System.out.println(bookName);
		}
		
		rs.close();
		st.close();
		conn.close();
	}

}
