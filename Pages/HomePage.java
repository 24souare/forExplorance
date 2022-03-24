package Pages;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class HomePage extends Page {
	WebDriver driver;
	By declineBtnBy = By.id("hs-eu-decline-button");
	
	public HomePage(WebDriver driver) {
		// write code here
		this.driver = driver;
	}
	
	public HomePage assertHomePageIsOpened() {
		String currentUrl = driver.getCurrentUrl();
		assertTrue(currentUrl.equals("https://explorance.com/"), "Current url should be 'https://explorance.com/', but indeed it is '" + currentUrl + "'. ");
		return this;
	}
	
	public HomePage assertContainerDisplayedWithGivenTitle(String title) {
		By containerTitleBy = By.xpath("//h2[text() = '" + title + "']");
		WebElement containerTitle = driver.findElement(containerTitleBy);
		System.out.println(containerTitleBy.toString());
		assertTrue(containerTitle.getText().equals(title), "Container with title '" + title + "' isn't displayed, but it should be. ");
		return this;
	}
	
	public HomePage assertCookiesWereDeclined() {
		assertFalse(driver.findElement(declineBtnBy).isDisplayed(), "Cookies weren't declined, but they should be. ");
		return this;
	}
	
	public HomePage declineCookies() {
		driver.findElement(declineBtnBy).click();
		return this;
	}

	public EmployeeInsightSolutionsPage clickRightContainerWithTitle(String title) {		
		By containerTitleBy = By.xpath("//h2[text() = '" + title + "']");
		WebElement containerTitle = driver.findElement(containerTitleBy);
		containerTitle.click();
		EmployeeInsightSolutionsPage employeeInsightSolutionsPage = new EmployeeInsightSolutionsPage(driver);
		return employeeInsightSolutionsPage;		
	}
	
	public StudentInsightSolutionsPage clickLeftContainerWithTitle(String title) {
		By containerTitleBy = By.xpath("//h2[text() = '" + title + "']");
		WebElement containerTitle = driver.findElement(containerTitleBy);
		containerTitle.click();
		StudentInsightSolutionsPage studentInsightSolutionsPage = new StudentInsightSolutionsPage(driver);
		return studentInsightSolutionsPage;
				
	}
}
