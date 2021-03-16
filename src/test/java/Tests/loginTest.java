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
	}
	@Test(dependsOnMethods = "userLoginWithInvalidMail")
	public void userLoginWithInvalidPassword()
	{
		
		loginObject.login("Abdelra33397945", "invalidpassword");
	}
	@Test(dependsOnMethods = "userLoginWithInvalidPassword")
	public void userLoginSuccessfully()
	{
		loginObject.login("Abdelra33397945", "x2361994");
	}
	

}
