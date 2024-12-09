package TestCase.PageFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.GetKeyPropertyEnv;

public class MethodCalls {
    WebDriver driver;
    public MethodCalls(WebDriver driver){
        this.driver = driver;
    }
    @Test
    public void LoginPageCustomerPortal() throws InterruptedException {
        String baseUrl = GetKeyPropertyEnv.getBaseUrl();
        driver.get(baseUrl);
        Thread.sleep(2000);
        PageBaseLogin PageBaseLogin = new PageBaseLogin(driver);
        String userName = GetKeyPropertyEnv.getUserName();
        String passWord = GetKeyPropertyEnv.getPassWord();
        PageBaseLogin.enterUserName(userName);
        PageBaseLogin.enterPassword(passWord);
        PageBaseLogin.ClickButton();
        Thread.sleep(2000);
    }



}
