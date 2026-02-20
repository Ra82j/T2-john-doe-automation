package pageObejctModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceBookPage 
{
	@FindBy(xpath = "//a[text()='Price Book']")
	private WebElement pbook;
	@FindBy(xpath = "//div[@class=\"flex items-center gap-2\"]/button[@type='button']")
	private WebElement toggleButton;
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement cnfBtn;
	@FindBy(xpath = "(//span[text()='Copy All From Master'])[1]")
	private WebElement copyBtn;
	
	public PriceBookPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void priceBook()
	{
		pbook.click();
		toggleButton.click();
		cnfBtn.click();
		copyBtn.click();
		
	}

}
