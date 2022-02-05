package week6day2retry;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class retryclass implements IRetryAnalyzer {
	ChromeDriver driver;
	
	@Test(retryAnalyzer = retryclass.class)
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SF")).click();
	  }

	int count=0;
	public boolean retry(ITestResult result) {
		if (count < 2) {
			count++;
			return true;
		}
		return false;
		
	}

}
