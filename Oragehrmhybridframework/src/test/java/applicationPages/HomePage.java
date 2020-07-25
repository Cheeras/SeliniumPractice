package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import dataProvider.DataProviderFactory;
import helper.Utlity;

public class HomePage {
	
	WebDriver driver;

	
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="txtUsername") WebElement username;
	@FindBy(id="txtPassword") WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']") WebElement loginButton;

	public void verifyHomePageTitle()
	{		
		Utlity.verifyTitleContains(driver, "OrangeHRM");	
	}
	
	public void loginAsAdmin()
	{
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		/*username.sendKeys(DataProviderFactory.getExcel().getStringCellData("OrangeHRM", 0, 0));
		
		password.sendKeys(DataProviderFactory.getExcel().getStringCellData("OrangeHRM", 0, 1));*/
		
		loginButton.click();
		
		Utlity.verifyUrlContains(driver,"dashboard");
	}
		
}
