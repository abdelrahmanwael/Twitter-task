package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends pageBase {

	public homePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div")
	WebElement tweetTxtBox;

	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[4]/div/div/div[2]/div/div/span/span")
	WebElement tweetBtn;

	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[2]/div/div")
	WebElement accountOptionList;


	@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/a[2]")
	WebElement logoutBtn;

	@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div")
	WebElement logoutBtn2;


	public void postTweet(String tweet)
	{
		setTxtElementTxt(tweetTxtBox, tweet);
		clickButton(tweetBtn);
	}

	public void logoutBtn()
	{
		clickButton(accountOptionList);
		clickButton(logoutBtn);
		clickButton(logoutBtn2);
	}

}
