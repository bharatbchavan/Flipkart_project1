package Utilites;


import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_class extends Listner_logic {

	@Parameters("Browser")
	@BeforeMethod
	public void launchbrowser(String numofbrowser) {
 
		
		if(numofbrowser.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
		}
		
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
	}
	@AfterMethod
	public void clasebrowser() {

		driver.quit();

	}
	
}


