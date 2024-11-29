package TestCase.PageFactory;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class createCFSInboundButton {
    static WebDriver driver = null;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        new MethodCalls(driver).LoginPageCustomerPortal();
        Thread.sleep(2000);
        driver.get("https://portal-app-dev2.portal-nonprod.vela.com.vn/booking");
        Thread.sleep(2000);
        driver.get("https://portal-app-dev2.portal-nonprod.vela.com.vn/booking/create-booking");
        Thread.sleep(2000);
    }
    @Test
    public void SearchQuotationID() throws InterruptedException {
        new PageBaseLogin(driver).SearchBoxQuotation("VQN220704048803WH");
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickCheckBoxQuotation();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickNetButton();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickInboundButton();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickLCLradio();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ImportButtonClick();
        Thread.sleep(2000);
        new PageBaseLogin(driver).CloseImport();
        Thread.sleep(1000);
        new PageBaseLogin(driver).UploadDocumentFileLCL();
        new PageBaseLogin(driver).LCLDocumentFile();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickConsol();
        Thread.sleep(2000);
        new PageBaseLogin(driver).EnterQty();
        Thread.sleep(2000);
        new PageBaseLogin(driver).SelectContainer();
        Thread.sleep(1000);
        new PageBaseLogin(driver).Select40OT();
        Thread.sleep(1000);
        new PageBaseLogin(driver).OKcreateConsol();
        Thread.sleep(1000);
        new PageBaseLogin(driver).addRowCommodity();
        Thread.sleep(2000);
        new PageBaseLogin(driver).OkeCommodity();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ButtonNextStep1();
        Thread.sleep(2000);
        new PageBaseLogin(driver).SubmitButton();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
