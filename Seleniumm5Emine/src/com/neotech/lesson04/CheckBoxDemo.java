package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
	
	public static String url="https://fs2.formsite.com/meherpavan/form2/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		WebElement mealeRB=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
		mealeRB.click();
		Thread.sleep(2000);
		
		
		
		WebElement femaeleRB=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_1']"));
		femaeleRB.click();
		Thread.sleep(2000);
		
		
		WebElement sunday=driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_0']"));
		sunday.click();
		Thread.sleep(2000);
		

		WebElement Wednesday=driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_3']"));
		Wednesday.click();
		Thread.sleep(2000);
		
		
		
		//hepsini ayni anda sectigimiz icin findElements oldu 9 taneside beraber
		
		List<WebElement>elements=driver.findElements(By.xpath("//table[@class='inline_grid choices']/tbody/tr//td/label"));
		for( WebElement el:elements) {
		el.click();
		String tex=el.getText();
		if(tex.equals("Female")) {
			el.click();
			Thread.sleep(2000);
		}else if( tex.equals("Saturday")) {
			el.click();
		}else if (tex.equals("Sunday")) {
			el.click();
		}
		Thread.sleep(2000);
		}
		////table[@class='inline_grid choices']/tbody/tr//td/label
		driver.quit();
	}

}
