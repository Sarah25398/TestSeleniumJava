package TestCase.CostingSupplierPortal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BLCTest {
    static WebDriver driver = null;

    @BeforeMethod
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        new LoginCostingSupplier(driver).LoginSupplier();
    }

    @Test(invocationCount = 100)
    public void BLCDTCosting() throws Exception {
        new BLCLocator(driver).Create_Costing_Button();
        new BLCLocator(driver).inputCosting();
        new BLCLocator(driver).InputRemark();
        new BLCLocator(driver).SubmitCosting();

    }
    //@AfterTest
    public void tearDown(){
        if(driver != null){
        driver.quit(); }
    }

}
