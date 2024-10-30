import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMultipleLogin {
    WebDriver driver;
    @Test
    public void TestMultipleLogins() throws IOException {
        String FilePath = "TestData.xlsx";
        File file = new File(FilePath);
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String userName = row.getCell(0).getStringCellValue();
            String passWord = row.getCell(1).getStringCellValue();
            

        }
        workbook.close();
        fis.close();

    }
    public Runnable login(String userName, String passWord) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://customer-dev2.vela.com.vn/");
        Thread.sleep(2000);
        WebElement UserName = driver.findElement(By.id("username"));
        UserName.sendKeys(userName);
        WebElement PassWord = driver.findElement(By.id("password"));
        PassWord.sendKeys(passWord);
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

        return null;
    }







}
