package TestCase.CostingSupplierPortal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.RetryAnalyzer;

public class CostingVAS {
    static WebDriver driver = null;
    @BeforeMethod
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        new LoginCostingSupplier(driver).LoginSupplier();
    }
    @Test
    public void CreateCostingDT() throws Exception {
        new CostingVasLocator(driver).createCostingDTVas();
        Thread.sleep(2000);
        new CostingVasLocator(driver).buttonNextStep1();
        Thread.sleep(2000);
        new CostingVasLocator(driver).SelectModeSea();
        new CostingVasLocator(driver).SelectChargeName();
        new CostingVasLocator(driver).SelectDangerousSurcharge();
        new CostingVasLocator(driver).ModeAirVas();
        new CostingVasLocator(driver).ModeRoad();
        new CostingVasLocator(driver).ModeRail();
        Thread.sleep(2000);
        new CostingVasLocator(driver).NextStep();
        Thread.sleep(5000);
        new CostingVasLocator(driver).EnterCostInEachPage();
        new CostingVasLocator(driver).TabAirInputCosting();
        new CostingVasLocator(driver).EnterCostInEachPage();
        new CostingVasLocator(driver).TabRoadInputCosting();
        new CostingVasLocator(driver).EnterCostInEachPage();
        new CostingVasLocator(driver).TabRailInputCosting();
        new CostingVasLocator(driver).EnterCostInEachPage();
        new CostingVasLocator(driver).SubmitCosting();


    }

}

