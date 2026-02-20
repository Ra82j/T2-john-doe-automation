package testCase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObejctModel.GeneratorDetailsPagePom;
import pageObejctModel.GeneratorPagePom;
import pageObejctModel.LoginPagePom;
import pageObejctModel.LogoutPage;
import pageObejctModel.PriceBookPage;
import pageObejctModel.RouteAssingmentPage;
import testBase.TestBase;

public class TestCase001 extends TestBase
{
	@Test
	public void test()
	{
		//Login
		LoginPagePom lp = new LoginPagePom(driver);
		lp.loginAction("henry@test.com", "Nayan123!@");
		System.out.println("======Login Done======");

		//generator
		GeneratorPagePom gpp=new GeneratorPagePom(driver);
		gpp.addGenerator("Moon34", "898790890890");
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ele = ew.until(ExpectedConditions.elementToBeClickable(gpp.submitBt()));
		ele.click();
		System.out.println("============generator clicked===============");

		//generator Details
		GeneratorDetailsPagePom gdpp=new GeneratorDetailsPagePom(driver);
		gdpp.selectIndustry();
		gdpp.enterAddressDetails("south kolkata", "kolkata", "700020","raj122@gmail.com", "9808907678");
		gdpp.setLocation("24.3", "98.0");
		gdpp.setOfficeHours();
		driver.navigate().refresh();
		gdpp.contbtn().click();
		gdpp.cnfBtn().click();
		System.out.println("=========Generators details Filled==========");

		//Route Assingment
		RouteAssingmentPage rap=new RouteAssingmentPage(driver);
		try {
			driver.switchTo().alert().dismiss();
			rap.popup();
		} catch (Exception e) {
			System.out.println("Popup not displayed or already closed");
			WebElement ele1 = rap.threedots();
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ele1);
			rap.assignRoute();
			e.printStackTrace();
		}
		System.out.println("==========Route Assinged==============");
		
		//price book
		PriceBookPage pp=new PriceBookPage(driver);
		pp.priceBook();
		System.out.println("=========Price book Completed==========");
		
		//Logout Actions
		LogoutPage lg= new LogoutPage(driver);
		lg.logoutAction();
		System.out.println("==========Logout Done==========");
	}
}
