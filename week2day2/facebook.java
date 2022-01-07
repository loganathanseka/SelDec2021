package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button') and @role='button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Logan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sekar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567891");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456");
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day1 = new Select(day);
		day1.selectByVisibleText("10");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Jul");
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yr = new Select(year);
		yr.selectByVisibleText("1996");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}

}
