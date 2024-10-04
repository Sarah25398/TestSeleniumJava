
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class verifysignupfield {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://customer-dev2.vela.com.vn/account/register");


    }
    @Test
    public void VerifyCompanyName() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        VerifyElement(driver,"//label[@class='ant-form-item-required'][1]", "Company Name");

    }
    public void VerifyElement(WebDriver driver, String xpath, String expectedText) {

        WebElement CompanyName = driver.findElement(By.xpath(xpath));
        String TextCompany = CompanyName.getText();
        if(TextCompany.equals(expectedText)) {
            System.out.println("Company Name is displayed correctly");
        }
        {System.out.println("Company Name is displayed incorrectly");}
    }
    public void CheckCompanyName(WebDriver driver, String xpath,String inputValue,String Attribute) {

        WebElement CompanyName = driver.findElement(By.xpath(xpath));
        CompanyName.sendKeys(inputValue);
        WebElement Xpath = driver.findElement(By.xpath("//div[@ng-reflect-title]"));
        String expectedValue = Xpath.getAttribute("ng-reflect-title");
        Assert.assertEquals(inputValue,expectedValue);
    }

    public void tearDown() {
        driver.quit();
    }
}