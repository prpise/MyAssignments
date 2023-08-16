package learnSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) {
	
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.close();
			}

	}


