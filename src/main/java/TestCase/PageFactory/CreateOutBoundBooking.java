package TestCase.PageFactory;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.RetryAnalyzer;

public class CreateOutBoundBooking{
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
    public void createBookingOutboundData(String QuotationCode) throws InterruptedException {
        new PageBaseLogin(driver).SearchBoxQuotation(QuotationCode);
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickCheckBoxQuotation();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ClickNetButton();
        Thread.sleep(1000);
        new PageBaseLogin(driver).SelectOutboundRadio();
        Thread.sleep(2000);
        new PageBaseLogin(driver).ClickCLPDateandTime();
        Thread.sleep(1000);
        new PageBaseLogin(driver).SelectCLPDateandTime();
        Thread.sleep(1000);
        new PageBaseLogin(driver). OKECLPdateTimeButton();
        Thread.sleep(1000);
        new PageBaseLogin(driver).DateAndTimeStuffing();
        Thread.sleep(2000);
        new PageBaseLogin(driver).SelectCLPDateandTime();
        Thread.sleep(1000);
        new PageBaseLogin(driver).OKECLPdateTimeButton();
        Thread.sleep(1000);
        new PageBaseLogin(driver).ContainerLoadingPlan();
        Thread.sleep(2000);
        new PageBaseLogin(driver).UploadDocument();
        Thread.sleep(2000);
        new PageBaseLogin(driver).ImportButton();
        Thread.sleep(4000);
        new PageBaseLogin(driver).CloseImportButton();
        Thread.sleep(1000);
        new PageBaseLogin(driver).NextOutBoundButton();
        Thread.sleep(2000);
        new PageBaseLogin(driver).SubmitOutBoundButton();
        Thread.sleep(5000);
        new PageBaseLogin(driver).GetBookingCode();


    }
    @AfterTest
    public void CloseBrowserTest(){
        driver.quit();
    }
}

