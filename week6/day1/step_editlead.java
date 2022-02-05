package editleadfile_steps;

import org.openqa.selenium.By;

import base_feature.baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_editlead extends baseclass {
	
	@When("Click the {string} link")
	public void clicklink(String link) {
		driver.findElement(By.xpath(link)).click();
		
	}
	@Then("Enter the {string} as {string}")
	public void Enterfields(String field, String details) {
		driver.findElement(By.xpath(field)).sendKeys(details);
		
	}
	@Then("wait")
	public void waitsec() throws InterruptedException {
		Thread.sleep(3000);
	}
	@Then("Clear {string} data")
	public void cleardata(String clr) {
		driver.findElement(By.xpath(clr)).clear();
		
	}
	

}
