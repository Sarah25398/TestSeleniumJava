import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

import static java.lang.Thread.sleep;

public class SignUpTaskVerify {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://customer-dev2.vela.com.vn");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }
    }
    @Test
    public void LoginTest(){
        VerifyUserNameAndPassWord("","Hello@12");
        driver.quit();
    }
    public void VerifyUserNameAndPassWord(String TextUserName,String TextPassWord){
        WebElement userName = driver.findElement(By.id("username"));
        WebElement passWord = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("btnlogin"));
        userName.sendKeys(TextUserName);
        passWord.sendKeys(TextPassWord);
        submitButton.click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }
        try {
            WebElement TextError1 = driver.findElement(By.id("usernameRequired"));
            WebElement TextError2 = driver.findElement(By.id("passwordRequired"));
            if ((TextError1.isDisplayed() && (TextError2.isDisplayed()))) {
                System.out.println("Test case shows the error id of both password and username");
            } else if (TextError1.isDisplayed()) {
                String VerifyErrorUserName = TextError1.getText();
                Assert.assertEquals(VerifyErrorUserName,"Vui lòng nhập địa chỉ email của bạn!");
                System.out.println("Missing data email of username");
            }
            else if (TextError2.isDisplayed()) {
                String VerifyErrorUserName = TextError2.getText();
                Assert.assertEquals(VerifyErrorUserName,"Vui lòng điền mật khẩu!");
                System.out.println("Missing data email of password");
            }
            else
            {
                System.out.println("Test case shows the error id of both password and username");
            } ;
        }
            catch(NoSuchElementException e){

               String expectedURL = "https://customer-dev2.vela.com.vn/rfi";
               String urlMain = driver.getCurrentUrl();
                Assert.assertEquals(expectedURL,urlMain);
            }



    }

}
