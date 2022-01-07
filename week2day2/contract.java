package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class contract {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Loganathan");
		driver.findElement(By.id("lastNameField")).sendKeys("Sekar");
		
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("10/07/2021");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("logansekar008@gmail.com");
		
		driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("5/114 S.parraipatti");
		driver.findElement(By.id("createContactForm_generalCity")).sendKeys("Dindigul");
		driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("624802");
		WebElement drop = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select dropdown = new Select(drop);
		dropdown.selectByVisibleText("India");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement pick = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select pickup = new Select(pick);
		int size = pickup.getOptions().size();
		pickup.selectByIndex(size-5);
		
		driver.findElement(By.className("smallSubmit")).click();

	}

}
