import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Pages.EmployeeInsightSolutionsPage;
import Pages.Page;

public class SampleTests extends Page{
		
	@Test
	public void openHomePageTest() {
		openHomePage()
		.assertHomePageIsOpened();		
	}
	
	@Test
	public void homePageRightContainerWithInfoTest() {
		openHomePage()
		.assertHomePageIsOpened()
		.assertContainerDisplayedWithGivenTitle("Employee Insight Solutions");			
	}
	
	@Test	
	public void homePageLeftContainerWithInfoTest() {
		openHomePage()
		.assertHomePageIsOpened()
		.assertContainerDisplayedWithGivenTitle("Student Insight Solutions");			 
	}
	
	@Test	
	public void homePageRightClickContainerWithInfoTest() {
		openHomePage()
		.assertHomePageIsOpened()
		.declineCookies()
		.assertCookiesWereDeclined()
	    .clickRightContainerWithTitle("Employee Insight Solutions")
	    .assertEmployeeInsightSolutionsPageIsOpened()
		.assertPageContainsCorrectTitle();
	}
	
	@Test
	public void homePageLeftClickContainerWithInfoTest() {
		openHomePage()
		.assertHomePageIsOpened()
		.declineCookies()
		.assertCookiesWereDeclined()
		.clickLeftContainerWithTitle("Student Insight Solutions")
	    .assertStudentInsightSolutionsPageIsOpened()
	    .assertPageContainsCorrectTitle();		
	}

			
	@AfterTest
    public void closeDriver() {
        driver.close();
    } 
	
}
