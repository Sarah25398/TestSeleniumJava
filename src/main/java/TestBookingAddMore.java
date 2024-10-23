import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

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
            Thread.sleep(3000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestAddMorePagination(){

        //CreateAddMore("MyTest");
        AddMorePlanButton();
        driver.quit();

    }
    public void AddMorePlanButton(){
        driver.get("https://portal-app-dev2.portal-nonprod.vela.com.vn/booking/create-booking");
        try {
            Thread.sleep(5000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = driver.findElement(By.xpath("(//div[@role='tab'])[3]"));
        element.click();
        WebElement SearchQuotation = driver.findElement(By.xpath("//input[@placeholder='Search Quotation ID']"));
        SearchQuotation.sendKeys("VQN040759821300WH");
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        radio.click();
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement addMore = driver.findElement(By.xpath("(//app-base-button[@classname='nv-border-none'])[2]"));
        for(int i = 0; i < 500; i++ )
        {
            addMore.click();
        }
        WebElement SaveDraft = driver.findElement(By.xpath("(//button[@class='ant-btn base-button'])[2]"));
        SaveDraft.click();


    }
    public void CreateAddMore(String TextTest){
        driver.get("https://portal-app-dev2.portal-nonprod.vela.com.vn/booking/create-booking");
        try {
            Thread.sleep(3000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = driver.findElement(By.xpath("(//div[@role='tab'])[3]"));
        element.click();
        WebElement SearchQuotation = driver.findElement(By.xpath("//input[@placeholder='Search Quotation ID']"));
        SearchQuotation.sendKeys("VQN040759821300WH");
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

        for(int i = 0; i < 50; i++ )
        {
            addMore.click();
            WebElement ShipperText = driver.findElement(By.xpath("(//input[@class='ant-input nv-input nv-input-ssmall ng-untouched ng-pristine ng-valid'])[7]"));
            ShipperText.sendKeys(TextTest);}
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement SaveDraft = driver.findElement(By.xpath("(//button[@class='ant-btn base-button'])[2]"));
        SaveDraft.click();

    }
    @Test
    public void TestAddMore() {

        WebElement element = driver.findElement(By.xpath("(//div[@role='tab'])[3]"));
        element.click();
        WebElement SearchQuotation = driver.findElement(By.xpath("//input[@placeholder='Search Quotation ID']"));
        SearchQuotation.sendKeys("VQN040759821300WH");
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        for(int i = 0; i < 1; i++ )
        {
        addMore.click(); }
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement LCLBooking = driver.findElement(By.xpath("(//div[@role='tab'])[3]"));
        LCLBooking.click();
        WebElement AddFileClick = driver.findElement(By.xpath("//input[@type='file']"));
        String FilePath = "C:\\Users\\vela.os010\\IdeaProjects\\untitled\\src\\main\\java\\Thomas (8).jpg";
        for (int i =0; i < 22; i++){
        AddFileClick.sendKeys(FilePath);
        }
        WebElement SaveDraft = driver.findElement(By.xpath("(//button[@class='ant-btn base-button'])[2]"));
        SaveDraft.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //WebElement BookingID = driver.findElement(By.xpath("//div[@class='nv-flex nv-flex-col nv-body-12-regular']"));
        // String NameBookingID = BookingID.getText();
        // System.out.println(NameBookingID);

    }

}


