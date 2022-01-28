package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class contact extends baseclass {

	
		@Test(priority = 0)
		public void f() throws InterruptedException {
			    
			    
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Create Contact")).click();
				driver.findElement(By.id("firstNameField")).sendKeys("Loganathan");
				driver.findElement(By.id("lastNameField")).sendKeys("Sekar");
				WebElement drop = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
				Select dropdown = new Select(drop);
				dropdown.selectByVisibleText("India");
				driver.findElement(By.id("createContactForm_birthDate")).sendKeys("10/07/2021");
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("logansekar008@gmail.com");
				
				driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("5/114 S.parraipatti");
				driver.findElement(By.id("createContactForm_generalCity")).sendKeys("Dindigul");
				driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("624802");
				//WebElement drop = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
				//Select dropdown = new Select(drop);
				//dropdown.selectByVisibleText("India");
				Thread.sleep(5);
				WebElement pick = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
				Select pickup = new Select(pick);
				//pickup.selectByVisibleText("TAMILNADU");
				int size = pickup.getOptions().size();
				pickup.selectByIndex(size-5);
				
				driver.findElement(By.className("smallSubmit")).click();

	}

}
