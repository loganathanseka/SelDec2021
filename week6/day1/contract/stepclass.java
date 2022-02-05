package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base_feature.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepclass extends baseclass {

	@When("Click the {string} login button")
	public void clickTheLoginButton(String submit) {
		driver.findElement(By.className(submit)).click();
	}
	@When("Click the {string} button")
	public void clickTheButton(String link) {
		driver.findElement(By.linkText(link)).click();
	}
	
	@Then("Enter the {string} in form as {string}")
	public void entertheDetails(String details, String det) {
		driver.findElement(By.id(details)).sendKeys(det);
	}
	@Then("select the {string} in form as {string}")
	public void selectdropdown(String sel, String drops) {
		WebElement drop = driver.findElement(By.id(sel));
		Select dropdown = new Select(drop);
		dropdown.selectByVisibleText(drops);
	}
	@Then("wait")
	public void waitsec() throws InterruptedException {
		Thread.sleep(3000);
	}
		
	

}
