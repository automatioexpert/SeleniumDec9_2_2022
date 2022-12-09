package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Code4 {

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mca.gov.in/MinistryV2/incorporation_company.html");

		WebElement services = driver.findElement(By.xpath("//a[contains(text(),'MCA Services')]"));

		Actions action = new Actions(driver);
		action.moveToElement(services).build().perform();
		
		List<WebElement> elements=driver.findElements(By.cssSelector("li.level-1>a"));

		System.out.println("================================");
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
		}
		System.out.println("================================");
		System.out.println("Total elements present inside list is : "+elements.size());
	}

}
