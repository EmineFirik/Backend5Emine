package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neotech.lesson25.Fibonachi.Main;

public class TextBoxes {
	
	public static String url="https://fs2.formsite.com/meherpavan/form2/index.html";
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		//first way locoted element multiple time
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Emine");
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).clear();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Dincer");
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Seray");
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys("Firik");
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).clear();
		Thread.sleep(2000);
		
		
		
		
		//2nd way code redundancy
		WebElement phone= driver.findElement(By.id("RESULT_TextField-3"));
		phone.sendKeys("i123 456 7890");
		Thread.sleep(500);
		
		phone.clear();
		
		phone.sendKeys("i123 0000");
		Thread.sleep(2000);
		
		
		WebElement country=driver.findElement(By.cssSelector("input[name='RESULT_TextField-4']"));
		country.sendKeys("Turkiye");
		country.clear();
		Thread.sleep(2000);
		WebElement city=driver.findElement(By.cssSelector("input[name='RESULT_TextField-5']"));
		city.sendKeys("Orlando");
		city.clear();
		city.sendKeys("Istanbul");
		Thread.sleep(2000);
		
		
		WebElement email=driver.findElement(By.cssSelector("input[name='RESULT_TextField-6']"));
		email.sendKeys("tuna@gmail");
		email.clear();
		email.sendKeys("tunaemine@hotmail.com");
		Thread.sleep(2000);
		
		//getting valu artribute
		String maxElemnt=email.getAttribute("maxlength");
		System.out.println("The max element is "+maxElemnt);
		
		
		//getting the test insidi web element
		String headertext=driver.findElement(By.xpath("//div[@id='q19']/div/h1")).getText();
		System.out.println(headertext);
		
		String firstName=driver.findElement(By.xpath("//*[@id=\"q2\"]/label")).getText();
		System.out.println(firstName);
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

}
