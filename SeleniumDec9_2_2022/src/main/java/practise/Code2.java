package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Code2 {

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mca.gov.in/MinistryV2/incorporation_company.html");
		System.out.println(driver.findElement(By.xpath("//img[contains(@alt,'Ministry')]")).isDisplayed());

		// Get all the header names
		List<WebElement> headers = driver.findElements(By.cssSelector("li.paddi"));

		for (WebElement header : headers) {
			System.out.println(header.getText());
		}

		driver.quit();
	}

}
