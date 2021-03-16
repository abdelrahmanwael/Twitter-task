package Tests;

import org.testng.annotations.Test;

import Pages.homePage;
import Pages.loginPage;

public class postTweetTest extends testBase {
	
	loginPage loginObject;
	homePage homeObject;
	
	@Test(priority = 1)
	public void userPostTweet()
	{
		homeObject = new homePage(driver);
		homeObject.postTweet("Test Tweet");
	}

}
