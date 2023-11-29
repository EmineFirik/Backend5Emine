package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods{
	
	
	@FindBy(id = "account-name")
	public WebElement accountName;
	
	
	@FindBy (xpath="//span[text()='PIM']")
   public  WebElement PIM;
	
	
	@FindBy(xpath ="//span[text()='Add Employee']")
	public WebElement AddEmployee;
	
	
	@FindBy(xpath="//li[@id='menu_news_More']/a")
	public WebElement moreMenuItem ;
	
	@FindBy (xpath="//div[@id='menu-content']/ul/li")
	public List<WebElement>menuList;
	
	@FindBy ( id="account-job")
	public WebElement accountMenu;
	
	@FindBy (id="logoutLink")
	public WebElement logout;
	
	@FindBy ( id ="menu_pim_viewEmployeeList")
	public WebElement EmployeeList;
	
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	
}
