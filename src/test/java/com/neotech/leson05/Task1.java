package com.neotech.leson05;

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
	public static String dbUrl = 
			"jdbc:mysql://147.182.216.34:3306/LibraryMgmt";
	
public static void main(String[] args) throws SQLException {
	
	Connection conn = 
			DriverManager.getConnection(dbUrl, dbUserName, dbPassword);// bu bize connection icin lzim
	
	
	
	
	Statement st = conn.createStatement();// java sql import edicez
	
	ResultSet rs = st.executeQuery("SELECT * FROM bookcategory");
	
	List<String > categoryNames = new ArrayList<String>();
	
	while(rs.next()) {
		
	 categoryNames.add(rs.getObject("BookCategoryName").toString());
		System.out.println(categoryNames);
		
		for( String name:categoryNames) {
			System.out.println(name+ " ");
		}
		rs.close();
		st.close();
		conn.close();
	}
}
}
