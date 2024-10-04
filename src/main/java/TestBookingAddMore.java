import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestBookingAddMore {
    WebDriver driver;
    @BeforeMethod
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://customer-dev2.vela.com.vn/");
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("btnlogin"));
        usernameField.sendKeys("vela.os015@itlvncom.onmicrosoft.com");
        passwordField.sendKeys("Hello@12");
        loginButton.click();
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void TestAddMore() {
        driver.get("https://portal-app-dev2.portal-nonprod.vela.com.vn/booking/create-booking");
        try {
            Thread.sleep(5000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = driver.findElement(By.xpath("(//div[@role='tab'])[3]"));
        element.click();
        WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        checkbox.click();
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement button = driver.findElement(By.xpath("(//app-base-button[@class='nv-h-fit'])[2]"));
        button.click();
        try {
            Thread.sleep(3000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        radio.click();
        WebElement addMore = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
        for(int i = 0; i < 500; i++ )
        {
        addMore.click(); }
        


    }

}


