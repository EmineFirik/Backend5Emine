package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableStreps {
	
	

		@When("I loggin to the HRMS")
		public void i_loggin_to_the_hrms() {
		    
			System.out.println("Loggin");
			
		}

		@When("I want to add Employees")
		public void i_want_to_add_employees(DataTable dataTable) {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
			
		   //List of Maps 
			
			Map<String,String> map1 = new HashedMap<>();
			map1.put("FN", "Emine");
			map1.put("MN", "Mine");
			map1.put("LN", "Firik");
			
			Map<String,String> map2 = new HashedMap<>();
			map2.put("FN", "Mesut");
			map2.put("MN", "Alp");
			map2.put("LN", "Erol");
			
			
			Map<String,String> map3 = new HashedMap<>();
			map3.put("FN", "Yasemin");
			map3.put("MN", "Yasmin");
			map3.put("LN", "Koc");
			
			List <Map<String,String>>lm = new ArrayList<>();
			lm.add(map1);
			lm.add(map2);
			lm.add(map3);
			
		List<Map<String,String>> listOfMaps	=dataTable.asMaps();
			for( Map<String,String> map : listOfMaps) 
			{
				System.out.println(map);
				
				System.out.println("First Name: "+ map.get("FirstName"));
				System.out.println("First Name: "+ map.get("MiddleName"));
				System.out.println("First Name: "+ map.get("LastName"));
				
			}
		}

		@Then("I validate employee is added")
		public void i_validate_employee_is_added() {
		   System.out.println("Validate employee added");
		}




}
