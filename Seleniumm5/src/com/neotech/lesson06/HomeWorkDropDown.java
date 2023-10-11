package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class HomeWorkDropDown extends BaseClass{

	//Homework 1:
   // Amazon Department List Verification
   // Open chrome browser//"searchDropdownBox"
   // Go to "http://amazon.com/"
    //Verify how many department options available.
   // Print each department 
    //Select Computers
    //Quit browser

	public static void main(String[] args) throws InterruptedException {
	
		
		setUp();

		WebElement departmentSelect=driver.findElement(By.id("searchDropdownBox"));
		departmentSelect.click();
		
		Select selDD=new Select(departmentSelect);
		selDD.selectByIndex(23);
		System.out.println("The computer is in the option 23");
		
		List<WebElement>options= selDD.getOptions();
		
		for( int i=0; i<options.size(); i++) {
			selDD.selectByIndex(i);
			
			
			Thread.sleep(i);
		}
		System.out.println("The size of department:" +options.size());
		
		
		tearDown();
	}
}
