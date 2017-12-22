package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithChromeBroswer {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cheeras\\Desktop\\SeliniumPractice\\SeliniumDrivers\\chromedriver_win32_2.33\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("Title of the page is::" + driver.getTitle());
	}
}
