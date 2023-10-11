package com.neotech.lesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Task  extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
		//Open chrome browser
		//Go to "https://www.techlistic.com/p/demo-selenium-practice.html"
		//Verify table contains "Financial Center".
		//Print name of all column headers
		//Print data of all rows
		//Quit Browser
		
		
		setUp();
		
		System.out.println("-------Table header------");
		WebElement table=driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		
		
		String expected="Financial Center";
		String actual=table.getText();
		
		
		if( actual.contains("expected")) {
			System.out.println("expected indi table "+expected);
		}else {
			System.out.println(expected+"Expected not inside the table");
		}
		
		System.out.println("All colum headers");
		
		List<WebElement>tableheaders=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		
		for( WebElement data:tableheaders) {
			System.out.print(data+ " |");
		}
		System.out.println();
		
		
		System.out.println("All Row Data");
		List<WebElement> tableBody=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		for( WebElement row:tableBody) {
			System.out.println(row.getText());
		}
		
		
		
		Thread.sleep(2000);
		tearDown();
	}
}
