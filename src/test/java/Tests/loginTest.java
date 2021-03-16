package Tests;

import org.testng.annotations.Test;


import Pages.loginPage;
import junit.framework.Assert;

public class loginTest extends testBase {
	
	
	loginPage loginObject;
	
	@Test(priority = 1)
	public void userLoginWithInvalidMail()
	{
		
		loginObject = new loginPage(driver);
		loginObject.loginBtn();
		loginObject.login("invalidmail@test.com", "x2361994");
	//	Assert.assertTrue(loginObject.errorMsg.getText().contains("There is 1 error"));
	}
	@Test(dependsOnMethods = "userLoginWithInvalidMail")
	public void userLoginWithInvalidPassword()
	{
		
		loginObject.login("Abdelra33397945", "invalidpassword");
		//Assert.assertTrue(loginObject.errorMsg.getText().contains("There is 1 error"));
	}
	@Test(dependsOnMethods = "userLoginWithInvalidPassword")
	public void userLoginSuccessfully()
	{
		loginObject.login("Abdelra33397945", "x2361994");
		//Assert.assertTrue(loginObject.successMsg.getText().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
	}
	

}
