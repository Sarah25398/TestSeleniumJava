package TestCase.SignUpPageCustomerPortal;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.dom.DOM;
import org.openqa.selenium.devtools.v126.dom.DOM.EnableIncludeWhitespace;
import org.openqa.selenium.devtools.v126.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.openqa.selenium.devtools.v126.dom.DOM;


public class ValidateAllInputFields {
    WebDriver driver;
    private DOM.EnableIncludeWhitespace EnableIncludeWhitespace;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--auto-open-devtools-for-tabs");
        driver = new ChromeDriver(options);
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(DOM.enable(Optional.ofNullable(EnableIncludeWhitespace)));
        devTools.send(Page.enable());
        driver.manage().window().maximize();
        driver.get("https://customer-dev2.vela.com.vn/account/register");
        Thread.sleep(2000);
    }
    public String CompanyName(){
        String CompanyName = UUID.randomUUID().toString();
        return CompanyName;
    }
    @Test
    public void VerifyFieldCompanyNameAttribute(){
        WebElement CompanyName = driver.findElement(By.xpath("//input[@formcontrolname='companyName']"));
        CompanyName.sendKeys(CompanyName());
        WebElement CompanyNameAttribute = driver.findElement(By.xpath("//div[@ng-reflect-title]"));
        if((CompanyNameAttribute.getAttribute("ng-reflect-title").equals(CompanyName())))
        {
            System.out.println("Data companyName input correctly");
        }
        else  {
            System.out.println("Data companyName input incorrectly");
        }
    }
    @Test
    public void VerifyFullName() throws InterruptedException {
        WebElement FullName = driver.findElement(By.xpath("//input[@id='fullName']"));
        FullName.sendKeys(CompanyName());
        Thread.sleep(1000);
    }
    @Test
    public void VerifyPhoneNumberCountry() throws InterruptedException {
        WebElement PhoneNumber = driver.findElement(By.xpath("//nz-select[@formcontrolname='phoneNumberPrefix']"));
        PhoneNumber.click();
        Thread.sleep(3000);
        List<WebElement> PhoneCountry = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']"));
        System.out.println(PhoneCountry.size());
        PhoneCountry.get(0).click();
        WebElement PhoneNumberClick = driver.findElement(By.xpath("//nz-select-item[@title]"));
        if(PhoneNumberClick.getAttribute("title").equals(PhoneCountry.get(0).getText())){
            System.out.println("Data phonecountry fill in correctly");
        }
        else{
            System.out.println("Data phonecountry fill in incorrectly");
        }
  }
  @Test
  public void CheckBoxUnselected(){
      driver.findElements(By.cssSelector("input[type='checkbox']")).stream()
              .filter(checkbox -> !checkbox.isSelected())
              .forEach(WebElement::click);
      driver.findElements(By.cssSelector("input[type='checkbox']")).stream()
              .filter(WebElement::isSelected)
              .forEach(WebElement::click);
      try {
          WebElement roleAlert = driver.findElement(By.xpath("//div[@role='alert']"));
          Thread.sleep(2000);
          if (roleAlert.getText().equals("Vui lòng đồng ý với Điều khoản sử dụng và Chính sách quyền riêng tư!")) {
              System.out.println("Checkbox ko select can select checkbox");
          } else {
              System.out.println("Text hien thi alert ko dung");
          }
      }
      catch(NoSuchElementException | InterruptedException e){
          System.out.println("Khong chua element role alert");
      }

  }

}
