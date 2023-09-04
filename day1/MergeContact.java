package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[1]")).click();
		//resulting 1st contact
		Set<String> windowHandles = driver.getWindowHandles();
	    List<String> lstWindow =new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstWindow.get(1));
		System.out.println("Child window title : " +driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		driver.switchTo().window(lstWindow.get(0));
		System.out.println("Parent window title : " +driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]")).click();
		Thread.sleep(3000);
		//resulting 2nd contact
		Set<String> windowHandles1 = driver.getWindowHandles();
	    List<String> lstWindow1 =new ArrayList<String>(windowHandles1);
		driver.switchTo().window(lstWindow1.get(1));
		System.out.println("Child window title :" +driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		driver.switchTo().window(lstWindow1.get(0));
		System.out.println("Parent window title : "+driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		System.out.println("Current Title : "+driver.getTitle());

	

	}

}
