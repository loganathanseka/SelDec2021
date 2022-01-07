package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class editlead {

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
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("updated test leaf");
		String spliting3 = " updated test leaf";
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String value1 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(value1);
		String spliting[] = value1.split(" ");
		String spliting2 = "";
		
		for(int i = 0; i<spliting.length-1; i++) {
			
			spliting2 = spliting2 + " " +spliting[i];
			
		}
		
	
		System.out.println(spliting2.equals(spliting3));
		boolean result = spliting2.equals(spliting3);
		
		if(result == true) {
			System.out.println("Company name updated");
		}
		else {
			System.out.println("Company name not updated");
		}
		

	}

}
