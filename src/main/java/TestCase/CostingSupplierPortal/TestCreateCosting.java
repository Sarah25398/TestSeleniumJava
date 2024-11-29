package TestCase.CostingSupplierPortal;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestCreateCosting {
    static WebDriver driver = null;

    @BeforeMethod
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        new LoginCostingSupplier(driver).LoginSupplier();
        Thread.sleep(2000);;
    }
    @Test
    public void CreateCostingDT() throws InterruptedException {
        Thread.sleep(3000);
        WebElement createCosting = driver.findElement(SupplierCostingLocators.Create_Costing_Button);
        createCosting.click();
        WebElement ScopeServiceDT = driver.findElement(SupplierCostingLocators.Scope_of_service_DT);
        ScopeServiceDT.click();
        WebElement Charge_Type = driver.findElement(SupplierCostingLocators.Charge_Type);
        Charge_Type.click();
        WebElement ButtonNext = driver.findElement(SupplierCostingLocators.Button_Next);
        ButtonNext.click();
        Thread.sleep(2000);
        WebElement ButtonNextStep1 = driver.findElement(SupplierCostingLocators.Button_Next_Step1);
        ButtonNextStep1.click();

    }
}
