import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.RandomDataUtility;
import java.util.Map;

import static java.lang.Thread.sleep;

public class TestSignUp {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://customer-dev2.vela.com.vn/account/register");
        try {
            sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void VerifyCreateUser() {
        String filePath = "randomData.txt";
        RandomDataUtility.generateAndSaveEmailAndText(filePath);
        Map<String, String> data = RandomDataUtility.readEmailAndTextFromFile(filePath);
        WebElement CompanyName = driver.findElement(By.xpath("//input[@formcontrolname='companyName']") );
        WebElement FullName = driver.findElement(By.id("fullName"));
        WebElement Email = driver.findElement(By.id("email"));
        WebElement PhoneNumber = driver.findElement(By.id("'phoneNumber'"));
        WebElement PassWord = driver.findElement(By.id("password"));
        WebElement CheckPassWord = driver.findElement(By.id("checkPassword"));
        WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement Button = driver.findElement(By.xpath("//button[@nztype='primary'][1]"));
        CompanyName.sendKeys(data.get("text"));
        FullName.sendKeys(data.get("text"));
        Email.sendKeys(data.get("email"));
        PhoneNumber.sendKeys("01285985889");
        PassWord.sendKeys("Hello@123");
        CheckPassWord.sendKeys("Hello@123");
        CheckBox.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Button.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Form filled with email: " + data.get("email"));
        System.out.println("Form filled with text: " + data.get("text"));
        WebElement element = driver.findElement(By.xpath("(//button[@nztype='primary'])[3]"));
        if (element.isDisplayed()) {
            // If the element is visible, click on it
            element.click();
            System.out.println("Element clicked successfully.");
        } else {
            System.out.println("Element is not visible.");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void tearDown() {
        driver.close();
    }
}