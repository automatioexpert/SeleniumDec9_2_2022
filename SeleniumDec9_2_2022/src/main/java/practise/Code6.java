package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Code6 {

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mca.gov.in/MinistryV2/incorporation_company.html");

		driver.findElement(By.xpath("//span[contains(text(),'Sign In/Sign Up')]")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Welcome')]")).getText());

		List<WebElement> elements=driver.findElements(By.cssSelector("span.word-align.footer-menu-link"));

		for(WebElement element:elements) {
			System.out.println(element.getText());
		}
		
		driver.quit();
	}

}
