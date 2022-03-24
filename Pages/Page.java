package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
	protected WebDriver driver;
	
	protected HomePage openHomePage() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://explorance.com/");
		HomePage homePage = new HomePage(driver);
		return homePage;
		
	}

}
