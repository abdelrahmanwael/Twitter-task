package Tests;

import org.testng.annotations.Test;

import Pages.homePage;
import Pages.loginPage;

public class logoutTest extends testBase {
	
	homePage homeObject;
	
	@Test(priority = 1)
	public void userLogout()
	{
		homeObject = new homePage(driver);
		homeObject.logoutBtn();
	}

}
