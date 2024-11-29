package TestCase.CostingSupplierPortal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginCostingSupplier {

    WebDriver driver;


    public LoginCostingSupplier(WebDriver driver) {
        this.driver = driver;
    }

    public void LoginSupplier() throws InterruptedException {
        driver.get("https://supplier-dev2.vela.com.vn/");
        Thread.sleep(2000);
        WebElement usernameField = driver.findElement(SupplierCostingLocators.USERNAME_FIELD);
        WebElement passwordField = driver.findElement(SupplierCostingLocators.PASSWORD_FIELD);
        WebElement loginButton = driver.findElement(SupplierCostingLocators.LOGIN_BUTTON);
        usernameField.sendKeys("resano4555@hutov.com");
        passwordField.sendKeys("Hello@123");
        loginButton.click();
        Thread.sleep(2000);
        driver.get("https://supplier-dev2.vela.com.vn/costing/list");



    }
}