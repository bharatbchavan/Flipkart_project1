package All_pages_related_pkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchfield_page {
	
WebDriver driver;
	
	WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(10));
	//declaration--locating all elelment using Findby anotation
	@FindBy(xpath = "//span[@class='b3wTlE']")
	private WebElement crossbutton;
	
   @FindBy(xpath = "(//input[@class='nw1UBF v1zwn25'])[1]")
	private WebElement insertinput4;
	
	//initilization creating cunstructore
public	Searchfield_page(WebDriver driver) {
	
	 this.driver = driver; 
	PageFactory.initElements(driver,this);
		
	}

//utilization
public void clickoncrossbutton() {
	wt.until(ExpectedConditions.elementToBeClickable(crossbutton));
	crossbutton.click();
}


public void searchfield3() {

	wt.until(ExpectedConditions.visibilityOf(insertinput4));
	insertinput4.sendKeys("shoes"+Keys.ENTER);
	
	Set<String> allwindow=driver.getWindowHandles();
	int count=allwindow.size();
	System.out.println(count);
}

}
