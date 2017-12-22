package dropdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DropDownSelect2 {
	@Test
	public  void selectDropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cheeras\\Desktop\\SeliniumPractice\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Title of the page is::" + driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement select_DropDown = driver.findElement(By.id("month"));
		
		Select select = new Select(select_DropDown);
		
		WebElement first_selected1 = select.getFirstSelectedOption();
		System.out.println("Before selecting value="+first_selected1.getText());
		
		//it will select march
		select.selectByIndex(3);
		
		WebElement first_selected = select.getFirstSelectedOption();
		System.out.println("After selecting value="+first_selected.getText());
		//Assert.assertTrue(first_selected.getText().equals("March"));
		Assert.assertEquals(first_selected.getText(), "Mar");
		System.out.println("after asserion...");
		
		
	}

}
