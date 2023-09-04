package week5.day1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightTicketWindowHandling {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
	    List<String> lstWindow =new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstWindow.get(1));
		File source = driver.getScreenshotAs(OutputType.FILE);
		//driver.getScreenshotAs(OutputType.FILE);//ctrl+2+l //create a folder 
		File Target =new File("./snap/snapdeal.png");
		FileUtils.copyFile(source, Target);
		
		//verify
		System.out.println(driver.getTitle());
		//driver.switchTo().window(lstWindow.get(0));
		driver.switchTo().window(lstWindow.get(0)).close();
		driver.switchTo().window(lstWindow.get(1));
		System.out.println("Child window title:" +driver.getTitle());
		
		

	}

}
