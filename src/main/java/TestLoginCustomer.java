import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLoginCustomer {
    WebDriver driver;
    @DataProvider(name = "loginData")
    public Object[] getData(){
        return new Object[][]{
                {"vela.os015@itlvncom.onmicrosoft.com","Hello@12"},
                {"testcontractvela5@yopmail.com","Hello@12"},
                {"",""},

        };
    }
    @Test(dataProvider = "loginData" )
    public void LoginTest(String UserName,String PassWord){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://customer-dev2.vela.com.vn/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys(UserName);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(PassWord);
        WebElement Button = driver.findElement(By.xpath("//button[@type='submit']"));
        Button.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(driver.getCurrentUrl().equals("https://customer-dev2.vela.com.vn/rfi")){
            System.out.println("He thong dang nhap thanh cong");
        }
        driver.quit();

    }

}
