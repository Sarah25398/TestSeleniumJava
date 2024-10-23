import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import static java.lang.Thread.sleep;
public class TestHoverName {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://customer-dev2.vela.com.vn/account/register");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void TestHover() {
        InteractWithHoverData("//input[@formcontrolname='companyName']", "cdk-overlay-1");
        driver.quit();
    }
    public void InteractWithHoverData(String xpath1, String xpath2) {
        WebElement CompanyName = driver.findElement(By.xpath(xpath1));
        String Text = "a".repeat(50);
        CompanyName.sendKeys(Text);
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions action = new Actions(driver);
        action.moveToElement(CompanyName).perform();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement HoverElement = driver.findElement(By.id(xpath2));
        if (HoverElement.isDisplayed()) {
            System.out.println("Data Hover showed up successfully");
        }
        {
            System.out.println("Data Hover showed up unsuccessfully");
        }
    }


}
