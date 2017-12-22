package cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CSSLoacator {
	@Test
	public  void testCssLocator() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-login.php");
		driver.findElement(By.cssSelector("input#user_login")).sendKeys("user");
		driver.findElement(By.cssSelector("input#user_pass")).clear();
		driver.findElement(By.cssSelector("input#user_pass")).sendKeys("user");
		driver.findElement(By.cssSelector("input#wp-submit")).click();
		Thread.sleep(3000);
		System.out.println("after login ===="+driver.findElement(By.cssSelector("h1.wp-heading-inline")).getText());
		
		Assert.assertEquals(driver.findElement(By.cssSelector("h1.wp-heading-inline")).getText(), "Profile");
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("input#admin_color_light")).click();
		//entering Username field
		//driver.findElement(By.cssSelector("input#user_login.regular-text")).sendKeys("UserTest321");
		//Thread.sleep(3000);
		//entering first name field
		driver.findElement(By.cssSelector("input#first_name.regular-text")).sendKeys("firstname");
		
		//entering lastname field
		driver.findElement(By.cssSelector("input#last_name.regular-text")).sendKeys("lastname");
		
		//entering nick name
		driver.findElement(By.cssSelector("input#nickname.regular-text")).sendKeys("cheeras");
		
		//entering textarea
		driver.findElement(By.cssSelector("textarea#description")).sendKeys("Bio graphical information about MG");
		
		

	}

}
