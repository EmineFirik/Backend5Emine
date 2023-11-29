package com.neotech.lesson06;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.neotech.utils.DBUtils;

public class StoringDataWithUtils {
	
	@Test
	public void getDataFromDB() 
	{
		//Create a connection 
		DBUtils.getConnection();
		
		// execute a query and get list of maps
		List < Map < String, String >> lm = DBUtils.storeDataFromDB("SELECT orderNumber,SUM(orderNumber) AS Total FROM orders WHERE customerNumber GROUP BY customerNumber HAVING customerNumber >200"
				+ "");
		
		//print ya calsidigindan emin olmak icin 
		
		System.out.println(lm);
		
		// Close the connection
		DBUtils.closeConnection();
		
	}
	

}
