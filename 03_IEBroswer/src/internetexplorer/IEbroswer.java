package internetexplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbroswer {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.ie.driver", "F:\\SeliniumDrivers\\IEDriver_32\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", "F:\\SeliniumDrivers\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
}
