package com.neotech.leson05;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CDBCdemo2 {
	
	public static String dbUserName = "user1";
	public static String dbPassword = "Neotech@123";
	public static String dbUrl = 
			"jdbc:mysql://147.182.216.34:3306/LibraryMgmt";
	
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = 
				DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		
		
		
		
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM bookcategory");
		
		List<String>list = new ArrayList<String>();
		while( rs.next()) 
		{
			String names= rs.getObject("BookCategoryName").toString();
			list.add(names);
		}
		System.out.println(list);
		
		
		
	}

}
