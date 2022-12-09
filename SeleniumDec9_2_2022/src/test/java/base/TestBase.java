package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	@BeforeSuite
	public void setUp() {
		System.out.println("Setup is called");
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		System.out.println("tearDown is called");
		
	}
}

