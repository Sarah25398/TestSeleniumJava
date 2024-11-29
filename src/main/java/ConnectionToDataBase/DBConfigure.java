package ConnectionToDataBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.RandomDataUtility;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
public class DBConfigure {
    WebDriver driver;
    public static String GetLoginData() throws SQLException {
        Connection connection = TestDBInLoginPage.DBConfigure();
        String query = "SELECT Email from dev3_customerRfi.User where email ='vela.os015@itlvncom.onmicrosoft.com'; ";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        String emailUser = null;
        while (result.next()) {
            emailUser = result.getString("Email");
            System.out.println(emailUser);
        }
        result.close();
        statement.close();
        connection.close();
        return emailUser;
    }
    @BeforeMethod
    public void setUp() throws InterruptedException, SQLException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://customer-dev2.vela.com.vn/");
        Thread.sleep(2000);
    }
    @Test
    public void TestLoginDev() throws SQLException {

        WebElement usernameField = driver.findElement(By.name("Username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("btnlogin"));
        usernameField.sendKeys(GetLoginData());
        passwordField.sendKeys("Hello@12");
        loginButton.click();
        try {
            Thread.sleep(2000);  // 2 seconds wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void tearDown() {
        driver.quit();
    }
}

