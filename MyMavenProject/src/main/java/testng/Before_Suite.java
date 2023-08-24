package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Before_Suite {
	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void launchBroswer() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\MyMavenProject\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void openGoogle() {

		driver.get("https://www.google.com");
	}

	@Test
	public void openGmail() {

		driver.get("https://www.gmail.com");

	}

	@Test
	public void openYahoo() {

		driver.get("https://www.yahoo.com");

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken" + totalTime);
	}





}