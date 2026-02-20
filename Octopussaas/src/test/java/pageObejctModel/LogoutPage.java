package pageObejctModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	@FindBy(xpath="//img[@alt=\"User Avatar\"]")
	private WebElement icon;
	@FindBy(xpath = "//button[text()='Logout']")
	private WebElement logoutBtn;
	
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void logoutAction()
	{
		icon.click();
		logoutBtn.click();
	}

}
