package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//to get title
		String title =driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("xyz");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		driver.findElement(By.name("submitButton")).click();
		//to verify text
		String text=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("Edit")).click();
		//clear name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		//enter edited name
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ABC Company");
		//Update
		driver.findElement(By.name("submitButton")).click();
		
		

	}

}
