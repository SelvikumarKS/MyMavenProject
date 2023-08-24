package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Before_Aftersuite {
		@Test
		public void openGoogle() {

		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\MyMavenProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total taken Time"+totalTime);
		
	}
		@Test
		public void openGmail() {
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\MyMavenProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.quit();
		 long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total taken Time"+totalTime);
		}
		
		
		@Test
		public void openYahoo() {

		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\MyMavenProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com");
		driver.quit();
		 long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total taken Time"+totalTime);
		}
		

	/*@Test
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
	}*/

}
