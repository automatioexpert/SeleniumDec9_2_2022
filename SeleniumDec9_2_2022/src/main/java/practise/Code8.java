package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Code8 {

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mca.gov.in/MinistryV2/incorporation_company.html");

		driver.findElement(By.xpath("//a[contains(text(),'Apply for DIN')]")).click();
		List<WebElement> elements = driver.findElements(By.cssSelector("p.floatLeft"));

		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}
		
		driver.quit();
	}

}
