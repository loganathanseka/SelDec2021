package week2.day1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class duplicatelead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName' ])[3]")).sendKeys("loganathan");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("sekar");
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("test leaf");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String value = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(value);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String dupname = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		String dupname1 = "Duplicate Lead";
		boolean dupname2 = dupname1.equals(dupname);
		if(dupname2 == true) {
			System.out.println("Title name Duplicate Lead matches");
		}
		else {
			System.out.println("Title name not matches");
		}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String leadname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		String leadname1 = "loganathan";
		boolean resultname = leadname.equals(leadname1);
		if(resultname == true) {
			System.out.println("Leadname matches");
		}
		else {
			System.out.println("Lead name not matches");
		}

	}

}
