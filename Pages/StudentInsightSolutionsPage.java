package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class StudentInsightSolutionsPage extends Page {
	WebDriver driver;
	String expectedUrl = "https://explorance.com/solutions/student-experience-management/";
	By title = By.xpath("//h1[text() = 'Student Insight Solutions']");

	public StudentInsightSolutionsPage(WebDriver driver) {
		// write code here
		this.driver = driver;
	}
	
	public StudentInsightSolutionsPage assertStudentInsightSolutionsPageIsOpened() {
		assertTrue(driver.getCurrentUrl().equals(expectedUrl), "Current URL '" + driver.getCurrentUrl() + "' is different with expected URL '" + expectedUrl + "'. ");
		return this;
	}
	
	public StudentInsightSolutionsPage assertPageContainsCorrectTitle() {
		assertTrue(driver.findElement(title).isDisplayed(),"Title '"+ title + "' wasn't displayed, but it should be.");
		return this;
	}
	
}
