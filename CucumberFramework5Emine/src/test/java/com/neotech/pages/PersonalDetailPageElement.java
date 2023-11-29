package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class PersonalDetailPageElement extends CommonMethods {

	@FindBy(id = "pimPersonalDetailsForm")
	public WebElement personalDetailsForm;
	
	
	@FindBy(id="pim.navbar.employeeName")
	public WebElement employeName;
	
	
	@FindBy( id = "personalDetailPageElement")
	public WebElement employeeID;
	
	
	@FindBy (id= "firstName")
	public WebElement  firstName;
	
	@FindBy(id="licenseNo")
	public WebElement licenseNo;
	
	
	@FindBy(xpath="//label[@for='smoker']")
	public WebElement smoker;
	
	
	@FindBy(xpath="//div[@id='emp_gender_inputfileddiv']")
	public WebElement gender;
	

	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']/div/ul/li")
	public List<WebElement> genderOptions;


	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/input")
	public WebElement nationalityInput;
	
	
	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/ul/li")
	public List<WebElement> nationalityOptions;
	
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/parent::div//i")
	public WebElement licExpDate;
	

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--year']/input")
	public WebElement licExpYearInputt;
	

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--year']/ul/li")
	public List<WebElement> licExpYearOptionss;
	

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--month']/input")
	public WebElement licExpMonthInputt;
	

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--month']/ul/li")
	public List<WebElement> licExpMonthOptionss;
	

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/..//table/tbody/tr/td")
	public List<WebElement> licExpDayOptionss;

	
	@FindBy(xpath = "//button[@type='submit'])[1]")
	public WebElement detailsSaveBtnnn;

	@FindBy(xpath="//a[@id='top-menu-trigger']")
	public WebElement More;
	
	@FindBy(xpath="//span[text()='Emergency Contacts']")
	public WebElement emergencyContact;
	
	@FindBy(xpath="//*[@id=\"socialMediaDiv\"]/div/a/i")
	public WebElement plussButtonn;
	
	@FindBy(id="name")
	public WebElement emergencyName;
	
	
	@FindBy(id="relationship")
	public WebElement relationship;
	
	@FindBy(id="home_phone")
	public WebElement homePhone;
	
	@FindBy(id="mobile_phone")
	public WebElement mobilePhone;
	
	@FindBy(id="office_phone")
	public WebElement workPhone;
	
	@FindBy( id ="modal-save-button")
	public WebElement emergencySavebutton;


	public PersonalDetailPageElement() {
		PageFactory.initElements(driver, this);
	}
	
}
