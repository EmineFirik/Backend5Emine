package com.neotech.lesson15;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;
import com.neotech.utils.CommonMethods;
//// Go to https://accounts.lambdatest.com/register Find the Password Element and
// * enter a password Find the Show span as a nephew of the password element and
// * click on it Find the Business Email as a cousin of the password element and
// * enter an email Close the browser
// */

// For this task, create two classes: LambdaTest, LambdaRegisterPage
// Use POM in the Register page.
// Don't find any of the elements on the LambdaTest page!!!

public class LambadaEmine extends CommonMethods {

	@FindBy(xpath = "//form[@class='form reg-custom']/div[2]/div/input")
	public WebElement password;

	@FindBy(xpath = "//input[@id='userpassword']/following-sibling::div/span")
	public WebElement show;

	@FindBy(xpath = "//input[@id='userpassword']/../../../div/input")

	public WebElement businesEmail;

	public LambadaEmine() {

		PageFactory.initElements(BaseClass.driver, this);
	}

}
