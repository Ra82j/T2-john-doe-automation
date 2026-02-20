package pageObejctModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom 
{
	@FindBy(id = "login-email")
	private WebElement usn;
	@FindBy(id = "login-password")
	private WebElement psw;
	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement loginBtn;

	public LoginPagePom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void loginAction(String email,String password)
	{
		usn.sendKeys(email);
		psw.sendKeys(password);
		loginBtn.click();
	}


}
