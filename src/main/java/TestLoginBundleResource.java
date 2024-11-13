import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLoginBundleResource {
    @Test
    public void LoginTestUsingBundleResource(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Config.getURL());
        WebElement emailName = driver.findElement(By.id("username"));
        emailName.sendKeys(Config.getUserName());
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys(Config.getPassWord());
        WebElement button = driver.findElement(By.id("btnlogin"));
        button.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(driver.getCurrentUrl().equals("https://customer-dev2.vela.com.vn/rfi")) {
            System.out.println("He thong login thanh cong");
        }

    }
}
