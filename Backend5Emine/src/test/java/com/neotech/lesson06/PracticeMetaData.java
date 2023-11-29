package com.neotech.lesson06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class PracticeMetaData {

	public static String dbUserName = "user1";
	public static String dbPassword = "Neotech@123";
	public static String dbUrl = "jdbc:mysql://147.182.216.34:3306/classicmodels"; // 3306 port number//This is are

	@Test
	public void ptacticeMetaDate() throws SQLException

	{
		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM customers");

		System.out.println(rs);
		
		rs.next();
		
		String customerName = rs.getString("customerName");
		System.out.println( customerName);
		
		rs.next();
		String customerName2 = rs.getString("customerName");
		System.out.println(customerName2);
		
		rs.next() ;
		String customerFirstName = rs.getString("contactLastName");
		System.out.println(customerFirstName);
		
		//while(rs.next())
		//{
			//String costumerName = rs.getObject("customerName").toString();
			//System.out.println(costumerName);
		//}
		
		//while ( rs.next())
		//{
			//String costumerLastName = rs.getObject("contactLastName").toString();
			//System.out.println(costumerLastName);
		//}
		
		while ( rs.next())
				{
					String phoneNumber = rs.getObject("phone").toString();
					System.out.println(phoneNumber);
				}

	}

}
