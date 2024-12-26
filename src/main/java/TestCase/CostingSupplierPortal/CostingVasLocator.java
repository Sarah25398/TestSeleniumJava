package TestCase.CostingSupplierPortal;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import scala.Int;

import java.util.ArrayList;
import java.util.List;

import static TestCase.CostingSupplierPortal.CostingVAS.driver;

public class CostingVasLocator {
    @FindBy(xpath ="(//span[@class='ng-star-inserted'])[2]")
    private WebElement Create_Costing_Button;
    @FindBy(xpath ="(//input[@type='radio'])[2]")
    private WebElement Scope_of_service_DT;
    @FindBy(xpath ="(//label[@nzspan='12'])[6]")
    private WebElement Charge_Type;
    @FindBy(xpath ="(//button[@class='ant-btn ant-btn-primary'])[2]")
    private WebElement Button_Next;
    @FindBy(xpath ="//button[@class='ant-btn ant-col ant-btn-primary ng-star-inserted']")
    private WebElement ButtonNextStep1;
    @FindBy(xpath ="//nz-select[@formcontrolname='modeofTransport']")
    private WebElement SelectModeSea;
    @FindBy(xpath ="//nz-option-item[@title='Sea FCL']")
    private WebElement SelectModeSeaFCL;
    @FindBy(xpath ="//nz-range-picker[@nzformat='dd/MM/yyyy']")
    private WebElement SelectValidity;
    @FindBy(xpath ="//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today ng-star-inserted']")
    private WebElement SelectTodayDate;
    @FindBy(xpath ="//td[@title='2/1/2025']")
    private WebElement SelectToDate;
    @FindBy(xpath ="//nz-select[@ng-reflect-nz-place-holder='Select Charge Name']")
    private WebElement SelectChargeName;
    @FindBy(xpath ="//nz-option-item[@class='ant-select-item ant-select-item-option ant-select-item-option-disabled ng-star-inserted']")
    private WebElement SelectAllChargeName;
    @FindBy(xpath ="(//nz-select-top-control[@ng-reflect-place-holder='Select Unit'])[1]")
    private WebElement SeaFCLDangerousSurcharge;
    @FindBy(xpath ="//nz-option-item[@class='ant-select-item ant-select-item-option ant-select-item-option-disabled ng-star-inserted']")
    private WebElement SelectAllUnitDangerousSurcharge;
    @FindBy(xpath ="(//nz-select-top-control[@ng-reflect-place-holder='Select Unit'])[2]")
    private WebElement SelectDetentionFee;
    @FindBy(xpath ="(//nz-select-top-control[@ng-reflect-place-holder='Select Unit'])[3]")
    private WebElement SelectDropPointFee;
    @FindBy(xpath ="(//nz-select-top-control[@ng-reflect-place-holder='Select Unit'])[4]")
    private WebElement SelectLoadingFee;
    @FindBy(xpath ="(//nz-select-top-control[@ng-reflect-place-holder='Select Unit'])[5]")
    private WebElement SelectPickUpFee;
    @FindBy(xpath ="(//nz-select-top-control[@ng-reflect-place-holder='Select Unit'])[6]")
    private WebElement SelectTallyFee;
    @FindBy(xpath ="(//nz-select-top-control[@ng-reflect-place-holder='Select Unit'])[7]")
    private WebElement SelectUnloadingFee;
    @FindBy(xpath ="(//nz-select-top-control[@ng-reflect-place-holder='Select Unit'])[8]")
    private WebElement SelectWaitingFee;
    @FindBy(xpath ="(//nz-select[@ng-reflect-nz-place-holder='Select Location'])[5]")
    private WebElement SelectLocationChargePickUp;
    @FindBy(xpath ="//nz-option-item[@ng-reflect-label='container']")
    private WebElement SelectContainerChargePickUp;
    //VAS Mode Air
    @FindBy(xpath ="(//div[@class='ant-tabs-tab ng-star-inserted'])[1]")
    private WebElement SelectModeAirTab;
    @FindBy(xpath ="//nz-option-item[@title='Air']")
    private WebElement SelectModeSeaAir;
    //Mode Road
    @FindBy(xpath ="//nz-option-item[@title='Road FCL']")
    private WebElement SelectModeRoadFCL ;
    @FindBy(xpath ="(//div[@class='ant-tabs-tab ng-star-inserted'])[2]")
    private WebElement SelectModeRoadTab;
    @FindBy(xpath ="(//nz-select-top-control[@ng-reflect-place-holder='Select Unit'])[9]")
    private WebElement ChargeRoad9 ;
    @FindBy(xpath ="(//nz-select-top-control[@ng-reflect-place-holder='Select Unit'])[10]")
    private WebElement ChargeRoad10 ;
    @FindBy(xpath ="(//nz-select[@ng-reflect-nz-place-holder='Select Location'])[7]")
    private WebElement SelectLocationModeRoadFCL;
    //mode rail
    @FindBy(xpath ="//nz-option-item[@title='Rail FCL']")
    private WebElement SelectModeRailFCL ;
    @FindBy(xpath ="(//div[@class='ant-tabs-tab ng-star-inserted'])[3]")
    private WebElement SelectModeRailTab;
    @FindBy(xpath ="(//nz-select[@ng-reflect-nz-place-holder='Select Location'])[4]")
    private WebElement SelectLocationRail;
    @FindBy(xpath ="//button[@class='ant-btn ant-col ant-btn-primary ng-star-inserted']")
    private WebElement ButtonNextStep;

    //inputCosting
    //Mode Air
    @FindBy(xpath ="(//div[@class='ant-tabs-tab ng-star-inserted'])[1]")
    private WebElement TabAirInputCosting;
    @FindBy(xpath ="(//div[@class='ant-tabs-tab ng-star-inserted'])[2]")
    private WebElement TabRoadInputCosting;
    @FindBy(xpath ="(//div[@class='ant-tabs-tab ng-star-inserted'])[3]")
    private WebElement TabRailInputCosting;
    @FindBy(xpath ="//button[@class='ant-btn ant-col ant-btn-primary ng-star-inserted']")
    private WebElement NextButtonInputCosting;
    @FindBy(xpath ="//button[@class='ant-btn ant-col ant-btn-primary ng-star-inserted']")
    private WebElement SubmitCostingButton;



    public void createCostingDTVas() throws InterruptedException {
        Create_Costing_Button.click();
        Thread.sleep(1000);
        Scope_of_service_DT.click();
        Thread.sleep(1000);
        Charge_Type.click();
    }
    public void buttonNextStep1() throws InterruptedException {
        Button_Next.click();
        Thread.sleep(3000);
        ButtonNextStep1.click();
    }
    public void SelectModeSea(){
        SelectModeSea.click();
        SelectModeSeaFCL.click();
        SelectValidity.click();
        SelectTodayDate.click();
        SelectToDate.click();

    }
    public void SelectChargeName(){
        SelectChargeName.click();
        SelectAllChargeName.click();
        new Actions(driver).moveToElement(SelectAllChargeName).sendKeys(Keys.TAB).perform();
    }
    public void SelectDangerousSurcharge() throws InterruptedException {
        SeaFCLDangerousSurcharge.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectDetentionFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectDropPointFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectLoadingFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);
        SelectPickUpFee.click();
        Thread.sleep(1000);
        SelectContainerChargePickUp.click();
        new Actions(driver).moveToElement(SelectContainerChargePickUp).sendKeys(Keys.TAB).perform();
        SelectLocationChargePickUp.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectTallyFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectUnloadingFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectWaitingFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();

    }

    public void ModeAirVas() throws InterruptedException {
        SelectModeAirTab.click();
        Thread.sleep(20000);
        SelectModeSea.click();
        SelectModeSeaAir.click();
        SelectValidity.click();
        SelectTodayDate.click();
        SelectToDate.click();
        SelectChargeName.click();
        SelectAllChargeName.click();
        new Actions(driver).moveToElement(SelectAllChargeName).sendKeys(Keys.TAB).perform();
        SeaFCLDangerousSurcharge.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectDetentionFee.click();
        Thread.sleep(3000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectDropPointFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectLoadingFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();

    }
    public void ModeRoad() throws InterruptedException {
        SelectModeRoadTab.click();
        Thread.sleep(20000);
        SelectModeSea.click();
        SelectModeRoadFCL.click();
        SelectValidity.click();
        SelectTodayDate.click();
        SelectToDate.click();
        SelectChargeName.click();
        SelectAllChargeName.click();
        new Actions(driver).moveToElement(SelectAllChargeName).sendKeys(Keys.TAB).perform();
        SeaFCLDangerousSurcharge.click();
        Thread.sleep(2000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectDetentionFee.click();
        Thread.sleep(4000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectDropPointFee.click();
        Thread.sleep(2000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectLoadingFee.click();
        Thread.sleep(2000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectPickUpFee.click();
        Thread.sleep(2000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        SelectTallyFee.click();
        Thread.sleep(2000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectUnloadingFee.click();
        Thread.sleep(2000);
        SelectContainerChargePickUp.click();
        new Actions(driver).moveToElement(SelectContainerChargePickUp).sendKeys(Keys.TAB).perform();
        //SelectLocation
        SelectLocationModeRoadFCL.click();
        Thread.sleep(2000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();

        SelectWaitingFee.click();
        Thread.sleep(2000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();

        ChargeRoad9.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(ChargeRoad9).sendKeys(Keys.TAB).perform();
        ChargeRoad10.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(ChargeRoad10).sendKeys(Keys.TAB).perform();

    }
    public void ModeRail() throws InterruptedException {
        SelectModeRailTab.click();
        Thread.sleep(20000);
        SelectModeSea.click();
        SelectModeRailFCL.click();
        SelectValidity.click();
        SelectTodayDate.click();
        SelectToDate.click();
        SelectChargeName.click();
        SelectAllChargeName.click();
        new Actions(driver).moveToElement(SelectAllChargeName).sendKeys(Keys.TAB).perform();
        SeaFCLDangerousSurcharge.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectDetentionFee.click();
        Thread.sleep(3000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectDropPointFee.click();
        Thread.sleep(2000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectLoadingFee.click();
        Thread.sleep(2000);
        SelectContainerChargePickUp.click();
        new Actions(driver).moveToElement(SelectContainerChargePickUp).sendKeys(Keys.TAB).perform();

        SelectLocationRail.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectPickUpFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        SelectTallyFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        SelectUnloadingFee.click();
        Thread.sleep(1000);
        SelectAllUnitDangerousSurcharge.click();
        new Actions(driver).moveToElement(SelectAllUnitDangerousSurcharge).sendKeys(Keys.TAB).perform();

    }
    public void NextStep(){
        ButtonNextStep.click();
    }

    public void InputCosting(){
        List<WebElement> InputCostings = driver.findElements(By.xpath("//input[@formcontrolname='cost']"));
        String randomNumber = GeneratingCostingNumber.Costing();
        for( WebElement InputCosting : InputCostings){
            InputCosting.sendKeys(randomNumber);
        }
    }
    // Function input costing page size < 5 page
    public void EnterCostInEachPage() throws InterruptedException {

        List<WebElement> PageElement1 = driver.findElements(By.xpath("//li[@ng-reflect-index]"));
        int totalPageElement = PageElement1.size();
        WebElement lastPage = PageElement1.get(totalPageElement-1);
        int lastPageNumber = Integer.parseInt(lastPage.getText());
        System.out.println(lastPageNumber);
        for (int page = 1;page <= lastPageNumber; page++ ){

            String PageXpath = "//li[@title='" + page + "']";
            WebElement PageElement = driver.findElement(By.xpath(PageXpath));
            PageElement.click();
            Thread.sleep(5000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            Thread.sleep(2000);
            InputCosting();
        }
    }
    public CostingVasLocator(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void TabAirInputCosting() throws InterruptedException {
        TabAirInputCosting.click();
        Thread.sleep(10000);


    }
    public void TabRoadInputCosting() throws InterruptedException {
        TabRoadInputCosting.click();
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

    }
    public void TabRailInputCosting() throws InterruptedException {
        TabRailInputCosting.click();
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

    }
    public void SubmitCosting() throws InterruptedException {
        NextButtonInputCosting.click();
        Thread.sleep(10000);

        SubmitCostingButton.click();
        Thread.sleep(10000);

    }
}
