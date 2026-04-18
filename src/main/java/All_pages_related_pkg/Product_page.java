package All_pages_related_pkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class Product_page {

    WebDriver driver;
    WebDriverWait wt;

    // ================= LOCATORS =================

    // close popup
    @FindBy(xpath = "//span[@role='button']")
    private WebElement crossbutton;

    // search field
    @FindBy(name = "q")
    private WebElement insertinput4;

    // ✅ correct product locator (Flipkart)
    @FindBy(xpath = "//div[@data-id]//a[1]")
    private List<WebElement> products;

    // ================= CONSTRUCTOR =================

    public Product_page(WebDriver driver) {

        this.driver = driver;   // ✅ MUST
        this.wt = new WebDriverWait(driver, Duration.ofSeconds(15)); // ✅ correct

        PageFactory.initElements(driver, this);
    }

    // ================= METHODS =================

    public void clickoncrossbutton() {

        try {
            wt.until(ExpectedConditions.elementToBeClickable(crossbutton)).click();
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }
    }

    public void searchfield3() {

        wt.until(ExpectedConditions.visibilityOf(insertinput4));
        insertinput4.sendKeys("shoes");
        insertinput4.sendKeys(Keys.ENTER);

        // ✅ wait for search results
        wt.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@data-id]")
        ));
    }

    public void clickonfirstproduct() {

        wt.until(ExpectedConditions.visibilityOfAllElements(products));

        int size = products.size();
        System.out.println("Total products: " + size);
        products.get(0).click();
      

    }
}