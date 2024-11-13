import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

public class TestDataProvider {
    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    @DataProvider(name = "loginDataTest", parallel = true)
    public Object[][] GetDataLogin() throws FileNotFoundException {
        return (Object[][]) UtilityData.GetData("TestData.xlsx");
    }
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
        driver.get().get("https://customer-dev2.vela.com.vn/");
    }
    @Test(dataProvider = "loginDataTest" )
    public void LoginTestDataCustomer(String UserName,String PassWord){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement username = driver.get().findElement(By.id("username"));
        username.sendKeys(UserName);
        WebElement password = driver.get().findElement(By.id("password"));
        password.sendKeys(PassWord);
        WebElement Button = driver.get().findElement(By.xpath("//button[@type='submit']"));
        Button.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(driver.get().getCurrentUrl().equals("https://customer-dev2.vela.com.vn/rfi")){
            System.out.println("He thong dang nhap thanh cong");
        }
    }
    @AfterTest
    public void tearDown(){
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }








}
