package com.neotech.lesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class WebtableDemo  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		System.out.println("____Header Table_____");
		
	
		List<WebElement> headerData=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		
	Iterator<WebElement>it=headerData.iterator();
	while( it.hasNext()) {
		String headerText=it.next().getText();
		System.out.print(headerText+ " | ");
	}
	
	System.out.println();
	
	
	List<WebElement>rows =driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
	System.out.println("Table size" +rows.size());
	
	System.out.println("_____Table Data_____");
	
	
	List <WebElement>rowdata=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td"));
	for( WebElement data:rowdata) {
		System.out.print(data.getText());
	}
	
	
	Thread.sleep(2000);
		tearDown();
		
	}
}
