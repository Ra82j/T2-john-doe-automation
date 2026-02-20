package pageObejctModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneratorPagePom
{

	 @FindBy(xpath = "//h6[text()='Add New']")
	    private WebElement addNew;

	    @FindBy(xpath = "//li[text()='Generator']")
	    private WebElement generator;

	    @FindBy(xpath = "//input[@placeholder='Enter generator name']")
	    private WebElement genName;

	    @FindBy(xpath = "//input[@placeholder='Enter internal account number']")
	    private WebElement accNo;

	    @FindBy(xpath = "//button[@id='generator-status']/../../../button")
	    private WebElement submitBtn;

	    public GeneratorPagePom(WebDriver driver) 
	    {
	        PageFactory.initElements(driver, this);
	    }

	    public void addGenerator(String name, String account) {
	        addNew.click();
	        generator.click();
	        genName.sendKeys(name);
	        accNo.sendKeys(account);
	    }
	    public WebElement  submitBt()
	    {
	    	 return submitBtn;
	    }



}
