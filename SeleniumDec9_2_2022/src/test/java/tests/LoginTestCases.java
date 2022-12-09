package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginTestCases extends TestBase {

	@Test
	public void loginTest() {
		System.out.println("Executing loginTest");
		driver.findElement(By.cssSelector("input#search-text")).sendKeys("services");
		driver.findElement(By.cssSelector("input#search-submit")).click();
		
		
		try {
		Thread.sleep(10000);
		System.out.println("Waiting for the results to be loaded");
		}
		catch (Exception e) {
			
			
		}
		String displayedResults = driver.findElement(By.cssSelector("span.displayed-results")).getText();
		System.out.println(displayedResults);
		System.out.println(driver.findElement(By.cssSelector("span.total-results")).getText());

		// Display all the results
		List<WebElement> results = driver.findElements(By.cssSelector("p.card-breadcrumb"));
		for (WebElement result : results) {
			System.out.println(result.getText());
		}
		
	}

	// @Test
	public void logoutTest() {
		System.out.println("Executing logoutTest");
	}

}
