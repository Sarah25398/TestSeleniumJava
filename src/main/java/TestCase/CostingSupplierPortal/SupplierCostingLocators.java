package TestCase.CostingSupplierPortal;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static TestCase.CostingSupplierPortal.TestCreateCosting.driver;

public class SupplierCostingLocators {

    public SupplierCostingLocators(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public static final By LOGIN_BUTTON = By.id("btnlogin");
    public static final By USERNAME_FIELD = By.id("username");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By Create_Costing_Button = By.xpath("(//span[@class='ng-star-inserted'])[2]");
    public static final By Scope_of_service_DT = By.xpath("(//input[@type='radio'])[2]");
    public static final By Charge_Type = By.xpath("(//input[@type='radio'])[5]");
    public static final By Button_Next = By.xpath("(//button[@class='ant-btn ant-btn-primary'])[2]");


    public static final By Button_Next_Step1 = By.xpath("//button[@class='ant-btn ant-col ant-btn-primary ng-star-inserted']");
    @FindBy(xpath ="//nz-select[@formcontrolname='modeofTransport']")
    private WebElement SelectModeSea;
    @FindBy(xpath ="//nz-option-item[@title='Sea FCL']")
    private WebElement SelectModeSeaFCL;
    @FindBy(xpath ="//nz-option-item[@title='Sea LCL']")
    private WebElement SelectModeSeaLCL;
    @FindBy(xpath ="//nz-option-item[@title='Air']")
    private WebElement SelectModeOfServiceAir;

    @FindBy(xpath ="//nz-select[@formcontrolname='additionalRequest']")
    private WebElement SelectAdditionalRequest;
    @FindBy(xpath ="//nz-option-item[@ng-reflect-title='Door-Door']")
    private WebElement SelectDoorToDoor;
    @FindBy(xpath ="//nz-range-picker[@nzformat='dd/MM/yyyy']")
    private WebElement SelectValidity;
    @FindBy(xpath ="//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today ng-star-inserted']")
    private WebElement SelectTodayDate;
    @FindBy(xpath ="//td[@title='2/1/2025']")
    private WebElement SelectToDate;
    @FindBy(xpath ="//nz-select[@ng-reflect-nz-place-holder='Select Hub']")
    private WebElement SelectHub;
    @FindBy(xpath ="//nz-option-item[@title='Da Nang Hub']")
    private WebElement SelectDaNangHub;

    @FindBy(xpath ="//nz-select[@ng-reflect-nz-place-holder='Select Operating Area']")
    private WebElement ClickOperationArea;
    @FindBy(xpath ="//nz-option-item[@title='South Central Coast']")
    private WebElement SelectOperationArea;
    @FindBy(xpath ="//nz-select-top-control[@ng-reflect-place-holder='Select UOM of Transport']")
    private WebElement SelectUOM;
    @FindBy(xpath ="(//input[@type='checkbox'])[2]")
    private WebElement SelectAllUnits;
    @FindBy(xpath ="(//nz-select[@formcontrolname='province'])[1]")
    private WebElement SelectPickUpAddress;
    @FindBy(xpath ="//nz-option-item[@title='Bac Giang']")
    private WebElement SelectPickUpProvince;
    @FindBy(xpath ="(//nz-select[@ng-reflect-nz-place-holder='Select District'])[1]")
    private WebElement SelectDistrict;
    @FindBy(xpath ="//nz-option-item[@class='ant-select-item ant-select-item-option ant-select-item-option-disabled ng-star-inserted']")
    private WebElement SelectAllDistrict;
    @FindBy(xpath ="(//nz-select[@formcontrolname='province'])[2]")
    private WebElement SelectDeliveryAddress;
    @FindBy(xpath ="//nz-option-item[@title='Binh Dinh']")
    private WebElement SelectDeliveryProvince;
    @FindBy(xpath ="(//nz-select[@ng-reflect-nz-place-holder='Select District'])[2]")
    private WebElement SelectDeliveryDistrict;
    @FindBy(xpath ="//nz-option-item[@class='ant-select-item ant-select-item-option ant-select-item-option-disabled ng-star-inserted']")
    private WebElement SelectAllDistrictDelivery;
    @FindBy(xpath ="//input[@placeholder='Enter Lead Time']")
    private WebElement EnterLeadTime;
    @FindBy(xpath ="//button[@class='ant-btn btn-border-blue mt-16 ant-btn-primary ant-btn-background-ghost ant-btn-block']")
    private WebElement MapRouting;
    @FindBy(xpath ="//label[@formcontrolname='bothWay']")
    private WebElement BothWay;
    @FindBy(xpath ="//button[@class='ant-btn ant-col ant-btn-primary ng-star-inserted']")
    private WebElement NextInputCondition;
    // add mode seaLCL
    @FindBy(xpath ="(//div[@nzalign='middle']/div/button)[3]")
    private WebElement AddMoreService;
    @FindBy(xpath ="(//nz-select[@formcontrolname='modeofTransport'])[2]")
    private WebElement AddModeOfTransport;
    @FindBy(xpath ="//nz-range-picker[@nzformat='dd/MM/yyyy'][2]")
    private WebElement SelectValiditySeaLCL;
    @FindBy(xpath ="//nz-select[@ng-reflect-nz-place-holder='Select Hub'][2]")
    private WebElement SelectHubData ;
    @FindBy(xpath ="//nz-option-item[@title='Tra Vinh Hub']")
    private WebElement SelectTraVinhHub;
    @FindBy(xpath ="(//nz-select[@ng-reflect-nz-place-holder='Select Operating Area'])[2]")
    private WebElement SelectOperationAreaSeaLCL;
    @FindBy(xpath ="//nz-option-item[@title='Southwest']")
    private WebElement SelectSouthWest;
    @FindBy(xpath ="(//nz-select[@ng-reflect-nz-place-holder='Select UOM of Transport'])[2]")
    private WebElement SelectUOMSeaLCL;
    @FindBy(xpath ="(//input[@type='checkbox'])[222]")
    private WebElement SelectAllUnitSeaLCL;
    @FindBy(xpath ="(//nz-select[@formcontrolname='province'])[3]")
    private WebElement PickUpSeaLCL;
    // ModeAir
    @FindBy(xpath ="(//div[@class='ant-tabs-tab ng-star-inserted'])[1]")
    private WebElement SelectModeAir;
    @FindBy(xpath ="//nz-option-item[@title='Kien Giang Hub']")
    private WebElement SelectKienGiangHub;
    @FindBy(xpath ="//nz-option-item[@title='kg']")
    private WebElement SelectUOMkg;
    @FindBy(xpath ="//nz-option-item[@title='An Giang']")
    private WebElement SelectDeliveryProvinceModeAir;
    @FindBy(xpath ="//nz-select[@ng-reflect-nz-place-holder='Select Airline']")
    private WebElement SelectAirlines;
    @FindBy(xpath ="//nz-option-item[@ng-reflect-title='VJ']")
    private WebElement SelectVJ;
    @FindBy(xpath ="//nz-option-item[@ng-reflect-title='VN']")
    private WebElement SelectVN;
    //ModeRoadFCL
    @FindBy(xpath ="(//div[@class='ant-tabs-tab ng-star-inserted'])[2]")
    private WebElement SelectModeRoadFCL;
    @FindBy(xpath ="//nz-option-item[@title='Road FCL']")
    private WebElement SelectRoadFCL ;
    //Mode rail FCL
    @FindBy(xpath ="(//div[@class='ant-tabs-tab ng-star-inserted'])[3]")
    private WebElement SelectModeRailFCL;
    @FindBy(xpath ="//nz-option-item[@title='Rail FCL']")
    private WebElement SelectRailFCL ;

    @FindBy(xpath ="//nz-option-item[@title='Bac Kan Hub']")
    private WebElement SelectBacKanHub;
    @FindBy(xpath ="//nz-option-item[@title='Northeast']")
    private WebElement SeelectNorthEast;
    @FindBy(xpath ="//nz-select[@ng-reflect-nz-place-holder='Select UOM of Transport']")
    private WebElement SelectUOMModeRail;
    @FindBy(xpath ="(//input[@type='checkbox'])[4]")
    private WebElement SelectAllUnitsModeRail;
    @FindBy(xpath ="//nz-option-item[@title='Quang Ninh']")
    private WebElement SelectDistrictRail;
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





    public void SelectModeSea(){
        SelectModeSea.click();
    }
    public void SelectModeSeaFCL(){
        SelectModeSeaFCL.click();
    }
    public void SelectAdditionalRequest(){
        SelectAdditionalRequest.click();
    }
    public void SelectDoorToDoor(){
        SelectDoorToDoor.click();
    }
    public void SelectValidity(){
        SelectValidity.click();
    }
    public void SelectTodayDate(){
        SelectTodayDate.click();
    }
    public void SelectToDate(){
        SelectToDate.click();
    }
    public void SelectHub(){
        SelectHub.click();
    }
    public void SelectDaNangHub(){
        SelectDaNangHub.click();
        new Actions(driver).moveToElement(SelectDaNangHub).sendKeys(Keys.TAB).perform();
    }
    public void ClickOperationArea(){
        ClickOperationArea.click();
        SelectOperationArea.click();
        new Actions(driver).moveToElement(SelectOperationArea).sendKeys(Keys.TAB).perform();
    }
    public void SelectUOM() throws InterruptedException {
        SelectUOM.click();
        Thread.sleep(2000);
        SelectAllUnits.click();
        new Actions(driver).moveToElement(SelectAllUnits).sendKeys(Keys.TAB).perform();
    }
    public void ScrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public void SelectPickUpAddress(){
        SelectPickUpAddress.click();
        SelectPickUpProvince.click();
    }
    public void SelectDistrict(){
        SelectDistrict.click();
        SelectAllDistrict.click();
        new Actions(driver).moveToElement(SelectAllDistrict).sendKeys(Keys.TAB).perform();
    }
    public void SelectDeliveryAddress() throws InterruptedException {
        SelectDeliveryAddress.click();
        SelectDeliveryProvince.click();
        SelectDeliveryDistrict.click();
        Thread.sleep(1000);
        SelectAllDistrictDelivery.click();
        new Actions(driver).moveToElement(SelectAllDistrictDelivery).sendKeys(Keys.TAB).perform();
    }
    public void EnterLeadTime(){
        EnterLeadTime.sendKeys("40");
    }
    public void MapRouting(){
        MapRouting.click();
    }
    public void BothWay(){
        BothWay.click();
    }
    public void NextInputCondition(){
        NextInputCondition.click();
    }
    //Mode Air
    public void SelectModeAir() throws InterruptedException {
        SelectModeAir.click();
        Thread.sleep(20000);
        SelectModeSea.click();
        SelectModeOfServiceAir.click();
    }
    public void SelectKienGiangHub() throws InterruptedException {
        SelectHub.click();
        Thread.sleep(5000);
        SelectKienGiangHub.click();
        new Actions(driver).moveToElement(SelectKienGiangHub).sendKeys(Keys.TAB).perform();
    }
    public void ClickOperationAreaModeAir() throws InterruptedException {
        ClickOperationArea.click();
        SelectSouthWest.click();
        Thread.sleep(3000);
        new Actions(driver).moveToElement(SelectSouthWest).sendKeys(Keys.TAB).perform();
    }
    public void SelectUOMkG() {
        SelectUOM.click();
        SelectUOMkg.click();
        new Actions(driver).moveToElement(SelectUOMkg).sendKeys(Keys.TAB).perform();
    }
    public void SelectDeliveryAddressModeAir() throws InterruptedException {
        SelectDeliveryAddress.click();
        SelectDeliveryProvinceModeAir.click();
        SelectDeliveryDistrict.click();
        Thread.sleep(3000);
        SelectAllDistrictDelivery.click();
        new Actions(driver).moveToElement(SelectAllDistrictDelivery).sendKeys(Keys.TAB).perform();
    }
    public void SelectAirline(){
        SelectAirlines.click();
        SelectVJ.click();
        SelectVN.click();
        new Actions(driver).moveToElement(SelectVN).sendKeys(Keys.TAB).perform();
    }
    //ModeRoadFCL
    public void SelectModeRoadFCL() throws InterruptedException {
        SelectModeRoadFCL.click();
        Thread.sleep(30000);
        SelectModeSea.click();
        SelectRoadFCL.click();
    }
    //Mode Rail FCL
    public void SelectModeRailFCL() throws InterruptedException {
        SelectModeRailFCL.click();
        Thread.sleep(30000);
        SelectModeSea.click();
        SelectRailFCL.click();
    }
    public void SelectBacKanHub() throws InterruptedException {
        SelectHub.click();
        Thread.sleep(3000);
        SelectBacKanHub.click();
        new Actions(driver).moveToElement(SelectBacKanHub).sendKeys(Keys.TAB).perform();
        ClickOperationArea.click();
        SeelectNorthEast.click();
        new Actions(driver).moveToElement(SeelectNorthEast).sendKeys(Keys.TAB).perform();

        SelectUOMModeRail.click();
        Thread.sleep(2000);

        SelectAllUnitsModeRail.click();
        new Actions(driver).moveToElement(SelectAllUnitsModeRail).sendKeys(Keys.TAB).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        SelectPickUpAddress.click();
        SelectPickUpProvince.click();
        Thread.sleep(2000);
        SelectDistrict.click();
        Thread.sleep(2000);
        SelectAllDistrict.click();
        new Actions(driver).moveToElement(SelectAllDistrict).sendKeys(Keys.TAB).perform();

        SelectDeliveryAddress.click();
        Thread.sleep(2000);
        SelectDistrictRail.click();
        SelectDeliveryDistrict.click();
        SelectAllDistrictDelivery.click();
        new Actions(driver).moveToElement(SelectAllDistrictDelivery).sendKeys(Keys.TAB).perform();
        //Rail service level
        List<WebElement> RailServiceLevel = driver.findElements(By.xpath("//input[@type='text']")).stream().limit(2).toList();
        for(int i =0; i < RailServiceLevel.size(); i++ ) {
            RailServiceLevel.get(i).sendKeys("20");
        }
        MapRouting.click();
        BothWay.click();

    }
    public void NextInputCosting() throws InterruptedException {
        Thread.sleep(1000);
        NextInputCondition.click();
        Thread.sleep(3000);
    }

    public void InputCostingSMC(){
        List<WebElement> InputCostings = driver.findElements(By.xpath("//input[@formcontrolname='cost']"));
        String randomNumber = GeneratingCostingNumber.Costing();
        for( WebElement InputCosting : InputCostings){
            InputCosting.sendKeys(randomNumber);
        }
    }
    // Function input costing page size < 5 page
    public void EnterCostInEachPageSMC() throws InterruptedException {

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
            InputCostingSMC();
        }
    }

    public void TabAirInputCosting() throws InterruptedException {
        TabAirInputCosting.click();
        Thread.sleep(10000);


    }
    public void TabRoadInputCosting() throws InterruptedException {
        TabRoadInputCosting.click();
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) CostingVAS.driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

    }
    public void TabRailInputCosting() throws InterruptedException {
        TabRailInputCosting.click();
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) CostingVAS.driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

    }
    public void SubmitCosting() throws InterruptedException {
        NextButtonInputCosting.click();
        Thread.sleep(10000);

        SubmitCostingButton.click();
        Thread.sleep(10000);

    }


}
