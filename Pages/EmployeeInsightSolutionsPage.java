package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeInsightSolutionsPage extends Page {
	WebDriver driver;
	String expectedUrl = "https://explorance.com/solutions/employee-experience-management/";
	By title = By.xpath("//h1[text() = 'Employee Insight Solutions']");
	
	public EmployeeInsightSolutionsPage(WebDriver driver) {
		// write code here
		this.driver = driver;
	}
	
	public EmployeeInsightSolutionsPage assertEmployeeInsightSolutionsPageIsOpened() {
		assertTrue(driver.getCurrentUrl().equals(expectedUrl), "Current URL '" + driver.getCurrentUrl() + "' is different with expected URL '" + expectedUrl + "'. ");
		return this;		
	}
	
	public EmployeeInsightSolutionsPage assertPageContainsCorrectTitle() {
		assertTrue(driver.findElement(title).isDisplayed(), "Title '" + title + "' wasn't displayed, but it should be. ");
		return this;
	}

}
