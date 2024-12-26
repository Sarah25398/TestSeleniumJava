package TestCase.CostingSupplierPortal;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.RetryAnalyzer;
import utility.VideoRecorderUtil;

public class TestCreateCosting {
    static WebDriver driver = null;
    @BeforeMethod
    public void Setup() throws Exception {
        //VideoRecorderUtil.startRecording("VideoRecordingTest");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        new LoginCostingSupplier(driver).LoginSupplier();
    }
    @Test
    public void CreateCostingDT() throws Exception {
        Thread.sleep(1000);
        WebElement createCosting = driver.findElement(SupplierCostingLocators.Create_Costing_Button);
        createCosting.click();
        Thread.sleep(1000);
        WebElement ScopeServiceDT = driver.findElement(SupplierCostingLocators.Scope_of_service_DT);
        ScopeServiceDT.click();
        Thread.sleep(2000);
        WebElement Charge_Type = driver.findElement(SupplierCostingLocators.Charge_Type);
        Charge_Type.click();
        Thread.sleep(2000);
        WebElement ButtonNext = driver.findElement(SupplierCostingLocators.Button_Next);
        ButtonNext.click();
        Thread.sleep(2000);
        WebElement ButtonNextStep1 = driver.findElement(SupplierCostingLocators.Button_Next_Step1);
        ButtonNextStep1.click();
        Thread.sleep(1000);
        new SupplierCostingLocators(driver).SelectModeSea();
        Thread.sleep(1000);
        new SupplierCostingLocators(driver).SelectModeSeaFCL();
        Thread.sleep(1000);
        new SupplierCostingLocators(driver).SelectAdditionalRequest();
        new SupplierCostingLocators(driver).SelectDoorToDoor();
        Thread.sleep(1000);
        new SupplierCostingLocators(driver).SelectValidity();
        new SupplierCostingLocators(driver).SelectTodayDate();
        new SupplierCostingLocators(driver).SelectToDate();
        new SupplierCostingLocators(driver).SelectHub();
        new SupplierCostingLocators(driver).SelectDaNangHub();
        Thread.sleep(2000);
        new SupplierCostingLocators(driver).ClickOperationArea();
        Thread.sleep(1000);
        new SupplierCostingLocators(driver).SelectUOM();
        new SupplierCostingLocators(driver).ScrollPage();
        Thread.sleep(1000);
        new SupplierCostingLocators(driver).SelectPickUpAddress();
        Thread.sleep(2000);
        new SupplierCostingLocators(driver).SelectDistrict();
        Thread.sleep(2000);
        new SupplierCostingLocators(driver).SelectDeliveryAddress();
        new SupplierCostingLocators(driver).EnterLeadTime();
        new SupplierCostingLocators(driver).MapRouting();
        new SupplierCostingLocators(driver).BothWay();
        //Mode Air
        new SupplierCostingLocators(driver).SelectModeAir();
        new SupplierCostingLocators(driver).SelectValidity();
        new SupplierCostingLocators(driver).SelectTodayDate();
        new SupplierCostingLocators(driver).SelectToDate();
        new SupplierCostingLocators(driver).SelectKienGiangHub();
        new SupplierCostingLocators(driver).ClickOperationAreaModeAir();
        new SupplierCostingLocators(driver).SelectUOMkG();
        new SupplierCostingLocators(driver).ScrollPage();
        new SupplierCostingLocators(driver).SelectPickUpAddress();
        Thread.sleep(2000);
        new SupplierCostingLocators(driver).SelectDistrict();
        new SupplierCostingLocators(driver).SelectDeliveryAddressModeAir();
        new SupplierCostingLocators(driver).SelectAirline();
        new SupplierCostingLocators(driver).EnterLeadTime();
        new SupplierCostingLocators(driver).MapRouting();
        new SupplierCostingLocators(driver).BothWay();
        //Mode Road FCL
        new SupplierCostingLocators(driver).SelectModeRoadFCL();
        new SupplierCostingLocators(driver).SelectValidity();
        new SupplierCostingLocators(driver).SelectTodayDate();
        new SupplierCostingLocators(driver).SelectToDate();
        new SupplierCostingLocators(driver).SelectKienGiangHub();
        new SupplierCostingLocators(driver).ClickOperationAreaModeAir();
        new SupplierCostingLocators(driver).ScrollPage();
        new SupplierCostingLocators(driver).SelectUOM();

        new SupplierCostingLocators(driver).SelectPickUpAddress();
        Thread.sleep(2000);
        new SupplierCostingLocators(driver).SelectDistrict();
        new SupplierCostingLocators(driver).SelectDeliveryAddressModeAir();
        new SupplierCostingLocators(driver).EnterLeadTime();
        new SupplierCostingLocators(driver).MapRouting();
        new SupplierCostingLocators(driver).BothWay();
        //Mode rail FCL
        new SupplierCostingLocators(driver).SelectModeRailFCL();
        new SupplierCostingLocators(driver).SelectAdditionalRequest();
        new SupplierCostingLocators(driver).SelectDoorToDoor();
        new SupplierCostingLocators(driver).SelectValidity();
        new SupplierCostingLocators(driver).SelectTodayDate();
        new SupplierCostingLocators(driver).SelectToDate();

        new SupplierCostingLocators(driver).SelectBacKanHub();
        new SupplierCostingLocators(driver).NextInputCosting();
        Thread.sleep(20000);
        new SupplierCostingLocators(driver).EnterCostInEachPageSMC();
        new SupplierCostingLocators(driver).TabAirInputCosting();
        new SupplierCostingLocators(driver).EnterCostInEachPageSMC();
        new SupplierCostingLocators(driver).TabRoadInputCosting();
        new SupplierCostingLocators(driver).EnterCostInEachPageSMC();
        new SupplierCostingLocators(driver).TabRailInputCosting();
        new SupplierCostingLocators(driver).EnterCostInEachPageSMC();
        new SupplierCostingLocators(driver).SubmitCosting();
    }
    @AfterTest
    public void tearDown() throws Exception {
        //VideoRecorderUtil.stopRecording();

    }

}
