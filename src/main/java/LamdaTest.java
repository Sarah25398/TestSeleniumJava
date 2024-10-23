import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.apache.commons.io.function.IOConsumer.forEach;

public class LamdaTest {

    WebDriver driver;
    @Test
    public void TestLamdaExpression(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://customer-dev2.vela.com.vn/account/register");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List <WebElement> elements = driver.findElements(By.xpath("//label[@class='ant-form-item-required']"));
        elements.stream()
                .limit(5)
                .forEach(element -> System.out.println(element.getText()));

    }

}
