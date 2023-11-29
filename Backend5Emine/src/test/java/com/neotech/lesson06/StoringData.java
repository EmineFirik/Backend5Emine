package com.neotech.lesson06;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;


public class StoringData {
	
	@Test
	public void getAndStoreData() throws SQLException {
		
		// read the connection properties from the configuration.properties file
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

		String dbUrl = ConfigsReader.getProperty("dbUrl");
		String dbUserName = ConfigsReader.getProperty("dbUserName");
		String dbPassword = ConfigsReader.getProperty("dbPassword");

		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("SELECT employeeNumber, lastName, firstName, email FROM employees LIMIT 5");

		List<Map<String, String>> listOfMaps = new ArrayList<>();
		Map<String, String> map;

		while (rs.next()) {
			
			// create a new map for every record, then add it to the list
			map = new LinkedHashMap<>();
			map.put("Employee number", rs.getString("employeeNumber"));
			map.put("Last name", rs.getString("lastName"));
			map.put("First name", rs.getString("firstName"));
			map.put("Email", rs.getString("email"));

			listOfMaps.add(map);
		}

		System.out.println(listOfMaps);

		rs.close();
		st.close();
		conn.close();
	
	}
	@Test
	public void getAndStoreDataEnhanced() throws SQLException 
	{
		
		// read the connection properties from the configuration.properties file
				ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

				String dbUrl = ConfigsReader.getProperty("dbUrl");
				String dbUserName = ConfigsReader.getProperty("dbUserName");
				String dbPassword = ConfigsReader.getProperty("dbPassword");

				Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
				Statement st = conn.createStatement();

				ResultSet rs = st.executeQuery("SELECT employeeNumber, lastName, firstName, email,jobTitle FROM employees LIMIT 5");
				
				// meta data da bu kodu ekliyoruz
				ResultSetMetaData rsMetaData = rs.getMetaData();
				
				int colCount = rsMetaData.getColumnCount();
				
				System.out.println(colCount);

				List<Map<String, String>> listOfMaps = new ArrayList<>();
				Map<String, String> map;
		
		//iterate over the rows
				
			while( rs.next()) {	
				map = new LinkedHashMap<>();
			for( int i =1;  i<=colCount;  i++) {
				map.put(rsMetaData.getColumnName(i),rs.getString(i));
			}
			listOfMaps.add(map);
				
			}
		System.out.println(listOfMaps);
		rs.close();
		st.close();
		conn.close();
		
	}
	
	
	

}
