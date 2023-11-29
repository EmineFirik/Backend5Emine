package com.neotech.lesson06;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.neotech.utils.DBUtils;

public class PracticeDataWithUtils {
	
	// Homework 1:

		// Connect to classicmodels database
		// Execute a query to get all information of customer with id 124
		// Get the resultset metadata
		// Print the number of columns
		// Get all the column names and store them in an arraylist
		// Print the Arraylist
	
	//@Test 
	//public void getDataFromDB() 
	//{
		
		//DBUtils.getConnection();
		//List <Map<String,String>> list = DBUtils.storeDataFromDB("SELECT * FROM customers WHERE  customerNumber =124");
		
		//System.out.println(list);
		//DBUtils.closeConnection();
		
	//}
	
	//@Test 
	//public void pratic() 
	//{
		
	//	DBUtils.getConnection();
		//List<Map<String,String>> listOf=DBUtils.storeDataFromDB("SELECT * FROM employees");
	//	System.out.println(listOf);
		//DBUtils.closeConnection();
		
	//}
	
	@Test
	public void pratic1() 
	
	{
		
	DBUtils.getConnection();
	List<Map<String,String>> listt= DBUtils.storeDataFromDB("SELECT lastName FROM employees");
	System.out.println(listt);
	DBUtils.closeConnection();
		
		
	}
	@Test
	public void pratic2() 
	
	{
		DBUtils.getConnection();
		List<Map<String,String>> lis3 = DBUtils.storeDataFromDB("SELECT contactFirstName FROM customers  ORDER BY contactFirstName asc");
		System.out.println(lis3);
		DBUtils.closeConnection();
		
	}
	
	

}
