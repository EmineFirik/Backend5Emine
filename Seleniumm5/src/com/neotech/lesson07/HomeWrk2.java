package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HomeWrk2  extends BaseClass{
	
	//Open chrome. browser
	//Go to "https://semantic-ui.com/modules/dropdown.html"
	//Scroll down to "Multiple Selection"
	//Click on drop down and select "CSS" and "HTML"
	//Verify value has been selected
	//Deselect 1 of the options from the dropdown
	//Quit browser
public static void main(String[] args) throws InterruptedException {
	setUp();
	
	driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']")).click();
	
	driver.findElement(By.xpath("//div[@data-tab='definition']//div[text()='CSS']")).click();
	
	driver.findElement(By.xpath("//div [@data-tab='definition']//div[text()='HTML']")).click();
	
	//Remove option
	
	driver.findElement(By.xpath("//a[@data-value='css']/i")).click();
	Thread.sleep(2000);
	
	//WebElement elementCSS=driver.findElement(By.xpath("//a[@data-value='css']"));
	//elementCSS.click();
	
	//String verifString=elementCSS.getText();
	//if( verifString.contains("CSS")) {
		System.out.println("Test is pass");
	//}else {
		//System.out.println("Test is not pass");
	//}
	Thread.sleep(2000);
	tearDown();
}
}
