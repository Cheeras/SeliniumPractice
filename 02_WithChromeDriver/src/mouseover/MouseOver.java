package mouseover;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {

		// http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		int count_links = element.size();
		
		for(int i=0; i<count_links; i++){
			
			WebElement ele1 = element.get(i);
			String text = ele1.getAttribute("innerHTML");
			System.out.println("links are ==="+text);
			if(text.equalsIgnoreCase("Appium")){
				ele1.click();
			}
		}
		
		driver.close();
		
	}
}
