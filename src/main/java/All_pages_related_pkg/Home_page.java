package All_pages_related_pkg;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_page {
	WebDriver driver;
	
	WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(10));
	//declaration--locating all elelment using Findby anotation
	@FindBy(xpath = "//span[@class='b3wTlE']")
	private WebElement crossbutton;
	
	//initilization creating cunstructore
public	Home_page(WebDriver driver) {
	PageFactory.initElements(driver,this);
		
	}

//utilization
public void clickoncrossbutton() {
	wt.until(ExpectedConditions.visibilityOf(crossbutton));
	crossbutton.click();
}
	

}
