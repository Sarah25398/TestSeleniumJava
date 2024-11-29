package TestCase.PageFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MethodCalls {
    WebDriver driver;
    public MethodCalls(WebDriver driver){
        this.driver = driver;
    }
    @Test
    public void LoginPageCustomerPortal() throws InterruptedException {
        driver.get("https://customer-dev2.vela.com.vn/");
        Thread.sleep(2000);
        PageBaseLogin PageBaseLogin = new PageBaseLogin(driver);
        PageBaseLogin.enterUserName("vela.os015@itlvncom.onmicrosoft.com");
        PageBaseLogin.enterPassword("Hello@12");
        PageBaseLogin.ClickButton();
        Thread.sleep(2000);
    }



}
