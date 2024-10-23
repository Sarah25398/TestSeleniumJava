import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

class multiThreads extends Thread {
    private WebDriver driver;
    private String BrowserType;
    public multiThreads(String BrowserType){
        this.BrowserType = BrowserType;
    }
    @Override
    public void run(){
        try {
            if (BrowserType.equals("chrome")) {
                driver = new ChromeDriver();
            } else if (BrowserType.equals("firefox")) {
                driver = new FirefoxDriver();
            }
        }
        catch(Exception y){}
        driver.get("https://customer-dev2.vela.com.vn/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("vela.os015@itlvncom.onmicrosoft.com");
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("Hello@12");
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if((driver.getCurrentUrl()).equals("https://customer-dev2.vela.com.vn/rfi")){
            System.out.println("Login successfully");
        }
        else{ System.out.println("Login unsuccessfully");}
    }

}

public class ThreadTest {
    @Test
    public void TestThreads() {
        multiThreads ChromeTest = new multiThreads("chrome");
        multiThreads FirefoxTest = new multiThreads("firefox");
        ChromeTest.start();
        FirefoxTest.start();
        try {
            ChromeTest.join();
            FirefoxTest.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
