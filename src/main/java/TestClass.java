import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestClass {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://supplier-dev3.vela.com.vn/");
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("btnlogin"));
        usernameField.sendKeys("chaperone@yopmail.com");
        passwordField.sendKeys("Hello@12");
        loginButton.click();
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void VerifyUrl() {
        String url = driver.getCurrentUrl();
        String expectedUrl = "https://supplier-dev3.vela.com.vn/rfi";
        Assert.assertEquals(url, expectedUrl, "return to correct url");

    }

    public void tearDown() {
        driver.quit();
    }
}