package TestCase.CostingSupplierPortal;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.RandomDataUtility;

import java.util.List;

import static TestCase.CostingSupplierPortal.BLCTest.driver;

public class BLCLocator {

    @FindBy(xpath ="(//span[@class='ng-star-inserted'])[2]")
    private WebElement Create_Costing_Button;
    @FindBy(xpath ="(//input[@type='radio'])[2]")
    private WebElement Scope_of_service_DT;
    @FindBy(xpath ="(//label[@nzspan='12'])[7]")
    private WebElement Charge_Type;
    @FindBy(xpath ="(//button[@class='ant-btn ant-btn-primary'])[2]")
    private WebElement Button_Next;
    @FindBy(xpath ="//button[@class='ant-btn ant-col ant-btn-primary ng-star-inserted']")
    private WebElement ButtonNextStep1;
    @FindBy(xpath ="//button[@class='ant-btn ant-col ant-btn-primary ng-star-inserted']")
    private WebElement NextButtonInputCosting;
    @FindBy(xpath ="//button[@class='ant-btn ant-col ant-btn-primary ng-star-inserted']")
    private WebElement SubmitCostingButton;
    @FindBy(xpath ="//nz-range-picker[@nzformat='dd/MM/yyyy']")
    private WebElement SelectValidity;
    @FindBy(xpath ="//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today ng-star-inserted']")
    private WebElement SelectTodayDate;
    @FindBy(xpath ="//td[@title='2/1/2025']")
    private WebElement SelectToDate;





    public void Create_Costing_Button() throws InterruptedException {
        Create_Costing_Button.click();
        Thread.sleep(2000);
        Scope_of_service_DT.click();
        Charge_Type.click();
        Thread.sleep(4000);
        Button_Next.click();
        Thread.sleep(2000);
        ButtonNextStep1.click();
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) BLCTest.driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);
        SelectValidity.click();
        SelectTodayDate.click();
        SelectToDate.click();

    }

    public void inputCosting(){

        List<WebElement> InputCostings = driver.findElements(By.xpath("//input[@formcontrolname='cost']"));
        int counter = 1;

        for( WebElement InputCosting : InputCostings){
            String randomNumber = GeneratingCostingNumber.Costing() + counter ;
            InputCosting.sendKeys(randomNumber);
            counter++;
        }

    }
    public void InputRemark() throws InterruptedException {
        List<WebElement> RemarkLists  = driver.findElements(By.xpath("//input[@formcontrolname='remark']"));
        int counter = 1;
        for (WebElement RemarkList : RemarkLists){
            String Remark = RandomDataUtility.generateRandomText();
            RemarkList.sendKeys(Remark);
            counter++;
        }
        Thread.sleep(2000);

    }
    public void SubmitCosting() throws InterruptedException {
        NextButtonInputCosting.click();
        Thread.sleep(10000);

        SubmitCostingButton.click();
        Thread.sleep(10000);

    }



    public BLCLocator(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
