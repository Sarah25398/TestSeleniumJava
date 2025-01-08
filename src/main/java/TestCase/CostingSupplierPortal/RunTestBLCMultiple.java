package TestCase.CostingSupplierPortal;

import TestCase.CostingSupplierPortal.BLCLocator;
import TestCase.CostingSupplierPortal.LoginCostingSupplier;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunTestBLCMultiple {
    // ThreadLocal to ensure each thread gets its own instance of WebDriver
    private static ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(() -> null);

    @BeforeMethod
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
        new LoginCostingSupplier(driver.get()).LoginSupplier();
    }

    @Test(invocationCount = 100)
    public void BLCDTCosting() throws Exception {
        new BLCLocator(driver.get()).Create_Costing_Button();
        new BLCLocator(driver.get()).inputCosting();
        new BLCLocator(driver.get()).InputRemark();
        new BLCLocator(driver.get()).SubmitCosting();
    }

    @AfterTest
    public void tearDown(){
        if(driver.get() != null){
            driver.get().quit();
            driver.remove();
        }
    }

    // Running the tests concurrently using ExecutorService
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // Create a pool of 20 threads

        for (int i = 0; i < 20; i++) {
            executorService.submit(() -> {
                try {
                    BLCTest test = new BLCTest();
                    test.Setup(); // Initialize WebDriver
                    test.BLCDTCosting(); // Run the test
                    test.tearDown(); // Clean up
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

        executorService.shutdown(); // Shutdown the executor service
    }
}
