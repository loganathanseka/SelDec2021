package week6day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import base_feature.baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class combinedclass extends baseclass implements IRetryAnalyzer{
	int count = 0;
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
	@Then("Check whether {string} is {string}")
	public void validation(String check, String check2) {
		String text = driver.findElement(By.xpath(check)).getText();
		Assert.assertEquals(check2, text);
		System.out.println(check2+" is Verified");
		
	}
	//@Then("retry")
	//public boolean retry(ITestResult result) {
		//if (count < 2) {
			//count++;
			//return true;
		//}
		//return false;
	//}
	

}
