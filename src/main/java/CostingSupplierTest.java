import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.RandomDataUtility;

import java.util.List;
import java.util.Map;
public class CostingSupplierTest {
    WebDriver driver;

    @BeforeMethod
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://customer-dev2.vela.com.vn/");
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("btnlogin"));
        usernameField.sendKeys("testcontractvela5@yopmail.com");
        passwordField.sendKeys("Hello@12");
        loginButton.click();
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test

    public void TestListElement() {
        driver.get("https://portal-app-dev2.portal-nonprod.vela.com.vn/booking/create-booking");
        try {
            Thread.sleep(3000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ClickEachCheckBoxes(driver,"//input[@type='checkbox']");
    }
    public void ClickEachCheckBoxes(WebDriver driver, String xpath) {
        List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int elementSize = elements.size();
        System.out.println(elementSize);
        for(int i = 0; i < 3; i++ )
        {
            elements.get(i).click();
        }
    }
}

