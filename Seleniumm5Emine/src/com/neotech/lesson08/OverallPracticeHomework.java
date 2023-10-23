package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class OverallPracticeHomework  extends BaseClass{
private static final Iterator<String> String = null;

public static void main(String[] args) throws InterruptedException {
	
	//1) Launch the browser and open the site "https://www.tutorialspoint.com/selenium/selenium_automation_practice"
	//2) Fill in the all text boxes, Choose your preferred radio button, check box and drop down option 
	//EXCEPT Profile Picture (Dissmiss this Section)
	//3) Click on the Button and you will see an Alert pops up then click Ok
	//4) When user clicks on Ok new Window will open then get All window handles and get the size and Quit all of them
	setUp();
	driver.findElement(By.name("firstname")).sendKeys("Emine");
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("Firik");
	Thread.sleep(2000);
	driver.findElement(By.name("sex")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("exp")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[3]/div/form/div/table/tbody/tr[5]/td[2]/input")).sendKeys("2012");
	Thread.sleep(2000);
	driver.findElement(By.name("profession")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("photo")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("tool")).click();
	Thread.sleep(2000);
	WebElement continents=driver.findElement(By.name("continents"));
	continents.click();
	Thread.sleep(2000);
	Select race=new Select(continents);
	race.selectByVisibleText("Europe");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//option[contains(text(),'Browser Commands')]")).click();
	
	driver.findElement(By.name("submit")).click();
	
	Alert alert=driver.switchTo().alert();
	System.out.println("The alert tex is:"+alert.getText());
	alert.accept();
	
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	System.out.println(driver.getWindowHandle());
	
	Set<String>WindowsHandle=driver.getWindowHandles();
	
    Iterator<String >windows =  WindowsHandle.iterator();
    
	String window1=windows.next();
	String window2=windows.next();
	System.out.println("window1-> "+ window1);
	System.out.println("window2-> "+ window2);
	driver.switchTo().window(window2);
	System.out.println(WindowsHandle.size());
	driver.close();
	
	Thread.sleep(2000);
	tearDown();
	
}
}
