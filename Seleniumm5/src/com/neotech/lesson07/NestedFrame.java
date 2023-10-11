package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrame extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
	
	setUp();
	
	//Once parent frame den wsitch yapmam lazim
	driver.switchTo().frame("frame1");//simdi ana sayfadan buna gectim
	
	
	WebElement childFrame=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));//buradadda bir ortadakinden kucugune girdim
	driver.switchTo().frame(childFrame);
	
	
	WebElement child=driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]"));
	String text=child.getText();
	System.out.println("The text is "+ text);
	
	//buradad child framin icindekini inspect yaptim
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();//default bizi main page goturuyor unutma
	Thread.sleep(2000);
	
	//driver.switchTo().parentFrame();//switch the parent bizi child frame den parent frame atar
	//Thread.sleep(2000);
	//tearDown();
	
}
	
	
	
	
	
	
}
