package pageObejctModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class GeneratorDetailsPagePom {


	// ================= INDUSTRY =================

	@FindBy(xpath = "//input[@placeholder='Select Industry Type']")
	private WebElement industryDropdown;

	@FindBy(xpath = "//span[text()='Urgent Care Clinics']")
	private WebElement industryOption;

	// ================= ADDRESS =================

	@FindBy(id = "serviceAddress-street")
	private WebElement street;

	@FindBy(id = "serviceAddress-city")
	private WebElement city;

	@FindBy(id = "serviceAddress-state")
	private WebElement stateDropdown;

	@FindBy(xpath = "//span[text()='IN']")
	private WebElement stateOption;

	@FindBy(id = "serviceAddress-zipCode")
	private WebElement zipCode;

	@FindBy(id = "serviceAddress-email")
	private WebElement email;

	@FindBy(id = "serviceAddress-phone")
	private WebElement phone;

	@FindBy(xpath = "//button[contains(@class,'enabled:hover:text-primary')]")
	private WebElement copyToBilling;

	// ================= MAP SECTION =================

	@FindBy(xpath = "//button[text()='Edit Position On Map']")
	private WebElement editMap;

	@FindBy(xpath = "(//input[@type='number'])[1]")
	private WebElement latitude;

	@FindBy(xpath = "(//input[@type='number'])[2]")
	private WebElement longitude;

	@FindBy(xpath = "//button[text()='Update Address']")
	private WebElement updateAddress;

	// ================= OFFICE HOURS =================

	@FindBy(xpath = "//input[@placeholder='Monday Opening Time']")
	private WebElement mondayOpen;

	@FindBy(xpath = "//span[text()='9:00 AM']")
	private WebElement nineAM;

	@FindBy(xpath = "//input[@placeholder='Monday Lunch Start Time']")
	private WebElement lunchStart;

	@FindBy(xpath = "//span[text()='1:00 PM']")
	private WebElement onePM;

	@FindBy(xpath = "//input[@placeholder='Monday Lunch End Time']")
	private WebElement lunchEnd;

	@FindBy(xpath = "//span[text()='2:00 PM']")
	private WebElement twoPM;

	@FindBy(xpath = "//input[@placeholder='Monday Closing Time']")
	private WebElement mondayClose;

	@FindBy(xpath = "//span[text()='5:00 PM']")
	private WebElement fivePM;

	@FindBy(xpath = "(//span[@class='w-1/4 flex items-center justify-center'])[1]")
	private WebElement copyMonday;

	@FindBy(xpath = "(//span[@class='w-1/4 flex items-center justify-center'])[4]")
	private WebElement pasteTue;

	@FindBy(xpath = "(//span[@class='w-1/4 flex items-center justify-center'])[6]")
	private WebElement pasteWed;

	@FindBy(xpath = "(//span[@class='w-1/4 flex items-center justify-center'])[8]")
	private WebElement pasteThu;

	@FindBy(xpath = "(//span[@class='w-1/4 flex items-center justify-center'])[10]")
	private WebElement pasteFri;

	@FindBy(xpath = "(//span[@class='w-1/2 flex items-center justify-center'])[6]")
	private WebElement saturdayClose;

	@FindBy(xpath = "(//span[@class='w-1/2 flex items-center justify-center'])[7]")
	private WebElement sundayClose;

	@FindBy(xpath = "(//div[@role='checkbox']/div)[1]")
	private WebElement contractedBtn;
	@FindBy(xpath = "//div[@class='modal-box']/div[3]/button[2]")
	private WebElement cnfBtn;

	public GeneratorDetailsPagePom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void selectIndustry()
	{
		industryDropdown.click();
		industryOption.click();
	}
	public void enterAddressDetails(String st, String c, String zip, String mail, String ph)
	{
		street.sendKeys(st);
		city.sendKeys(c);
		stateDropdown.click();
		stateOption.click();
		zipCode.sendKeys(zip);
		email.sendKeys(mail);
		phone.sendKeys(ph);
		copyToBilling.click();
	}
	public void setLocation(String lat, String lon)
	{
		editMap.click();
		latitude.sendKeys(lat);
		longitude.sendKeys(lon);
		if (latitude.isDisplayed()) {
			System.out.println("Latitude verified successfully");
		}
		if (longitude.isDisplayed()) {
			System.out.println("Longitude verified successfully");
		}
		updateAddress.click();
	}

	public void setOfficeHours()
	{
		mondayOpen.click();
		nineAM.click();
		lunchStart.click();
		onePM.click();
		lunchEnd.click();
		twoPM.click();
		mondayClose.click();
		fivePM.click();
		copyMonday.click();
		pasteTue.click();
		pasteWed.click();
		pasteThu.click();
		pasteFri.click();
		saturdayClose.click();
		sundayClose.click();
	}
	public WebElement contbtn()
	{
		return	contractedBtn;
	}
	public WebElement cnfBtn()
	{
		return cnfBtn;
	}
}
