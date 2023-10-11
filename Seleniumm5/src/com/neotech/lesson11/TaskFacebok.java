package com.neotech.lesson11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;

public class TaskFacebok extends CommonMethods{
	// https://www.facebook.com/r.php
	//* Facebook dropdown verification Open chrome browser Go to
	// * https://www.facebook.com/r.php Verify: month dd has 12 month options day dd
	// * has 31 day options year dd has 118 year options Select your date of birth
	// * Quit browser
	 //*/
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		WebElement month = driver.findElement(By.id("month"));
		
		selectDropdown(month, 11);
		wait(2);
		
		WebElement day = driver.findElement(By.id("day"));
		
		selectDropdown(day, "1");
		
		WebElement year = driver.findElement(By.id("year"));
		
		selectDropdown(year, " 1982 ");
		
		Select selDD=new Select( year);
		List<WebElement> el=selDD.getOptions();
		for( WebElement years : el) {
			years.click();
		}
		
		wait(2);
		
		
		
		
		
		
		
		
		tearDown();
		
		
	}
	

}
