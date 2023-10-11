package com.neotech.lesson15;

import com.neotech.utils.CommonMethods;

public class LambadaTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// Go to https://accounts.lambdatest.com/register Find the Password Element and
		// * enter a password Find the Show span as a nephew of the password element and
		// * click on it Find the Business Email as a cousin of the password element and
		// * enter an email Close the browser
		// */

		// For this task, create two classes: LambdaTest, LambdaRegisterPage
		// Use POM in the Register page.
		// Don't find any of the elements on the LambdaTest page!!!

		setUp();

		LambadaRegisterPage register = new LambadaRegisterPage();

		

		sendText(register.passwordBox, "test123");

		wait(2);
		
		jsClick(register.showBtn);
		
		sendText(register.businesEmail, "test123@gmail.com");
		
		
		wait(2);
		
		tearDown();
	}
}
