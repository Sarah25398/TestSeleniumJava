package TestCase.PageFactory;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.RetryAnalyzer;

import java.sql.SQLException;

public class CreateBuyerConsolBooking {
    private WebDriver driver;
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
    @Test(retryAnalyzer = RetryAnalyzer.class )
    public void SearchQuotationID(String QuotationCode) throws InterruptedException, SQLException {

        new PageBaseLogin(driver).SearchBoxQuotation(QuotationCode);
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickCheckBoxQuotation();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickNetButton();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickInboundButton();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickBuyerConsolRadio();
        Thread.sleep(1000);
        new PageBaseLogin(driver).EnterConsigneeField();
        Thread.sleep(1000);
        new PageBaseLogin(driver).DestinationEnter();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickDestination();
        Thread.sleep(1000);
        new PageBaseLogin(driver).DischargePortClick();
        Thread.sleep(1000);
        new PageBaseLogin(driver).SelectDaNangPort();
        Thread.sleep(1000);
        new PageBaseLogin(driver).OkButtonPort();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ImportButtonClick();
        Thread.sleep(2000);
        new PageBaseLogin(driver).CloseImportBuyer();
        Thread.sleep(1000);
        new PageBaseLogin(driver).UploadDocumentFileLCL();
        new PageBaseLogin(driver).LCLDocumentFile();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickConsolGroupBuyer();
        Thread.sleep(1000);
        new PageBaseLogin(driver).EnterQtyBuyer();
        Thread.sleep(1000);
        new PageBaseLogin(driver).SelectContainerBuyer();
        Thread.sleep(1000);
        new PageBaseLogin(driver).Select40OT();
        Thread.sleep(1000);
        new PageBaseLogin(driver).OkeCreateConsolBuyer();
        Thread.sleep(1000);
        new PageBaseLogin(driver).addRowCommodity();
        Thread.sleep(2000);
        new PageBaseLogin(driver).OkeCommodityBuyerConsol();
        Thread.sleep(1000);
        new PageBaseLogin(driver).NextButtonStep1();
        Thread.sleep(2000);
        new PageBaseLogin(driver).SubmitButtonBuyerConsol();
        Thread.sleep(5000);
        new PageBaseLogin(driver).GetBookingCode();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
