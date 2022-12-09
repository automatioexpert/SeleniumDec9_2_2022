package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Code3 {

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mca.gov.in/MinistryV2/incorporation_company.html");
		driver.findElement(By.cssSelector("input[name='query']")).sendKeys("services");
		driver.findElement(By.cssSelector("input#search-submit")).click();
		
	WebElement searchResult=driver.findElement(By.cssSelector("p#search-result-for"));
	
	//Add Explicit wait
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(searchResult));
	
	System.out.println(searchResult.getText());
	
	}

}
