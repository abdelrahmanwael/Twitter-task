package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends pageBase {

	public loginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div/div[3]/a[2]/div/span/span")
	WebElement loginBtn;

	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[2]/form/div/div[1]/label/div/div[2]/div/input")
	WebElement emailTxtBox;

	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[2]/form/div/div[2]/label/div/div[2]/div/input")
	WebElement passwordTxtBox;

	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[2]/form/div/div[3]/div/div")
	WebElement loginBtn2;


	@FindBy(css="span.Welcome.to.Twitter!")
	public WebElement successMsg;

	public void loginBtn()
	{
		clickButton(loginBtn);
	}

	public void login(String mail, String password)
	{

		emailTxtBox.clear();
		setTxtElementTxt(emailTxtBox, mail);
		setTxtElementTxt(passwordTxtBox, password);
		clickButton(loginBtn2);
	}



}
