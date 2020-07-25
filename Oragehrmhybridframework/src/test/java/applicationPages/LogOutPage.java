package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utlity;

public class LogOutPage {
	
	
	WebDriver driver;
	
	public LogOutPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(id="welcome")WebElement clickonWelcomeText;
	
	@FindBy(xpath="//a[text()='Logout']") WebElement logout;

	public void logOutFromApplication()
	{
		clickonWelcomeText.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(logout)).click();
	}
	
}
