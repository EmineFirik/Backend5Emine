package com.neotech.lesson09;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DynamicTable extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		
		//https://hrm.neotechacademy.com/
		setUp();
		

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);

		WebElement userNaem = wait.until(ExpectedConditions.elementToBeClickable(By.id("txtUsername")));
		userNaem.sendKeys(ConfigsReader.getProperty("username"));
		
		WebElement pasword=wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPassword")));
		pasword.sendKeys(ConfigsReader.getProperty("password"));
		
		
		WebElement login=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		login.click();
		
		WebElement pim=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']")));
		pim.click();
		
		WebElement employeList=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Employee List']")));
		employeList.click();
		
		String expectedValu="Linda";
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
		for( int i=0; i<rows.size(); i++) {
			String rowText=rows.get(i).getText();
			System.out.println("Row text :"+rowText);
			//firstWay
			if( rowText.contains(expectedValu)) {
				driver.findElements(By.xpath("//table[@id='employeeListTable']//td[2]")).get(i).click();
			}
			//2nd way
			List <WebElement>firstColums=driver.findElements(By.xpath("/table[@id='employeeListTable']//td[1]"));
			firstColums.get(i).click();
			
			System.out.println("Clicked on Record: "+ i);
			break;
			
		}
		
		
		
		
		tearDown();
	}

}
