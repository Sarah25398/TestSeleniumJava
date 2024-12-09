package TestCase.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBaseLogin {
    @FindBy(id ="username")
    private WebElement UserNameField;
    @FindBy(id ="password")
    private WebElement PassWordField;
    @FindBy(id ="btnlogin")
    private WebElement ButtonLogin;
    @FindBy(xpath ="//input[@placeholder='Search Quotation ID']")
    private WebElement SearchBoxQuotation;
    @FindBy(xpath ="//input[@type='checkbox']")
    private WebElement CheckBoxQuotation;
    @FindBy(xpath ="(//button[@type='button'])[13]")
    private WebElement NextButton ;
    @FindBy(xpath = "(//input[@type='radio'])[1]")
    private WebElement InboundRadio;
    @FindBy(xpath = "(//input[@type='radio'])[3]")
    private WebElement LCLConsolBoxRadio;
    @FindBy(xpath ="(//input[@type='file'])[1]")
    private WebElement ImportButton ;
    @FindBy(xpath ="(//div[@class='ant-tabs-tab ng-star-inserted'])[1]")
    private WebElement UploadDocumentFileLCLbooking ;
    @FindBy(xpath ="(//input[@type='file'])[2]")
    private WebElement UploadFileCLCDocument ;
    @FindBy(xpath ="(//button[@type='button'])[16]")
    private WebElement CloseImportPopup ;
    @FindBy(xpath ="(//button[@type='button'])[15]")
    private WebElement ButtonNextStep1 ;
    @FindBy(xpath ="(//button[@type='button'])[7]")
    private WebElement ClickConsol;
    @FindBy(xpath ="(//input[@nztooltipoverlayclassname='nv-base-tooltip'])[19]")
    private WebElement EnterQty;
    @FindBy(xpath ="//nz-select[@nzplaceholder='Select']")
    private WebElement SelectContainer;
    @FindBy(xpath ="//nz-option-item[@title='40OT']")
    private WebElement Select40OT;
    @FindBy(xpath ="(//button[@type='button'])[18]")
    private WebElement OKcreateConsol;
    @FindBy(xpath ="(//span[@class='ng-star-inserted'])[64]")
    private WebElement ClcikCommodityRow;
    @FindBy(xpath ="(//button[@type='button'])[16]")
    private WebElement OkeCommodityDetail;
    @FindBy(xpath ="(//button[@type='button'])[14]")
    private WebElement SubmitButton;
    //Create Inbound CFS Buyer Consol
    @FindBy(xpath ="(//input[@type='radio'])[4]")
    private WebElement BuyerConsolRadio;
    @FindBy(xpath ="(//input[@nztooltipoverlayclassname='nv-base-tooltip'])[4]")
    private WebElement ConsigneeFillData ;
    @FindBy(xpath ="(//input[@autocomplete='off'])[2]")
    private WebElement DestinationSelect ;
    @FindBy(xpath ="(//button[@type='button'])[5]")
    private WebElement DischargePortClick ;
    @FindBy(xpath ="(//li[@class='nv-menu-item ant-dropdown-menu-item ng-star-inserted'])[1]")
    private WebElement DaNangPort ;
    @FindBy(xpath ="(//button[@type='button'])[16]")
    private WebElement OKDischargePort ;
    @FindBy(xpath ="//nz-option-item[@title='Austria']")
    private WebElement ClickDestination ;
    @FindBy(xpath ="(//button[@type='button'])[17]")
    private WebElement CloseImportPopupBuyer ;
    @FindBy(xpath ="(//button[@type='button'])[8]")
    private WebElement clickConsolBuyer ;
    @FindBy(xpath ="(//input[@nztooltipoverlayclassname='nv-base-tooltip'])[20]")
    private WebElement EnterQtyBuyer ;
    @FindBy(xpath ="(//nz-select[@nztooltipoverlayclassname='nv-base-tooltip'])[3]")
    private WebElement SelectContainerBuyer ;
    @FindBy(xpath ="//button[@class='ant-btn base-button base-button--primary']")
    private WebElement OkeCreateConsolBuyer ;
    @FindBy(xpath ="//app-base-button[@classname='base-button--primary']")
    private WebElement OkeCommodityBuyerConsol ;
    @FindBy(xpath ="//app-base-button[@classname='base-button--primary nv-flex-center nv-gap-8']")
    private WebElement NextButtonStep1  ;
    @FindBy(xpath ="(//button[@type='button'])[15]")
    private WebElement SubmitButtonBuyerConsol  ;
    @FindBy(xpath ="//div[@class='nv-flex nv-flex-col nv-body-12-regular']")
    private WebElement GetBookingCode  ;
    //CreateOutboundBooking
    @FindBy(xpath = "(//input[@type='radio'])[2]")
    private WebElement Outbound;
    @FindBy(xpath = "(//nz-date-picker)[2]")
    private WebElement CLPDateandTimeClick;
    @FindBy(xpath = "//a[@class='ant-picker-now-btn']")
    private WebElement SelectCLPDateTime;
    @FindBy(xpath = "//button[@nzsize='small']")
    private WebElement OKECLPdateTimeButton;
    @FindBy(xpath = "(//nz-date-picker)[3]")
    private WebElement DateAndTimeStuffing;
    @FindBy(xpath = "(//div[@class='ant-tabs-tab ng-star-inserted'])[1]")
    private WebElement ContainerLoadingPlan;
    @FindBy(xpath = "(//input[@type='file'])[1]")
    private WebElement UploadDocument;
    @FindBy(xpath = "(//input[@type='file'])[2]")
    private WebElement ImportOutbound;
    @FindBy(xpath = "(//button[@type='button'])[20]")
    private WebElement CloseImportButton;

    @FindBy(xpath = "(//button[@type='button'])[19]")
    private WebElement NextOutBoundButton;
    @FindBy(xpath = "(//button[@type='button'])[14]")
    private WebElement SubmitOutBoundButton;











    public PageBaseLogin(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void enterUserName(String userName){
        UserNameField.sendKeys(userName);
    }
    public void enterPassword(String passWord){
        PassWordField.sendKeys(passWord);
    }
    public void ClickButton(){
        ButtonLogin.click();
    }
    public void SearchBoxQuotation(String QuotationID){
        SearchBoxQuotation.sendKeys(QuotationID);
    }
    public void ClickCheckBoxQuotation(){
        CheckBoxQuotation.click();
    }
    public void ClickNetButton(){
        NextButton.click();
    }
    public void ClickInboundButton(){
        InboundRadio.click();
    }
    public void ClickLCLradio(){
        LCLConsolBoxRadio.click();
    }
    public void ImportButtonClick(){
        ImportButton.sendKeys("C:\\Users\\vela.os010\\IdeaProjects\\untitled\\Inbound CFS (11).xlsx");
    }
    public void CloseImport(){
        CloseImportPopup.click();
    }
    public void ClickConsol(){
        ClickConsol.click();

    }
    public void EnterQty(){
        EnterQty.sendKeys("50");

    }
    public void SelectContainer(){
        SelectContainer.click();

    }
    public void Select40OT(){
        Select40OT.click();

    }
    public void OKcreateConsol(){
        OKcreateConsol.click();

    }
    public void addRowCommodity(){
        ClcikCommodityRow.click();

    }
    public void OkeCommodity(){
        OkeCommodityDetail.click();

    }
    public void UploadDocumentFileLCL(){
        UploadDocumentFileLCLbooking.click();
    }
    public void LCLDocumentFile(){
        UploadFileCLCDocument.sendKeys("C:\\Users\\vela.os010\\IdeaProjects\\untitled\\Inbound CFS (11).xlsx");
    }
    public void ButtonNextStep1(){
        ButtonNextStep1.click();
    }
    public void SubmitButton(){
        SubmitButton.click();
    }
   // Create BuyerConsol inbound
    public void ClickBuyerConsolRadio(){
        BuyerConsolRadio.click();
    }
    String ConsigneeEnterText = "a".repeat(100);
    public void EnterConsigneeField(){
        ConsigneeFillData.sendKeys(ConsigneeEnterText);
    }
    public void DestinationEnter(){
        DestinationSelect.sendKeys("Austria");
    }
    public void ClickDestination(){
        ClickDestination.click();
    }
    public void DischargePortClick (){
        DischargePortClick.click();
    }
    public void SelectDaNangPort (){
        DaNangPort.click();
    }
    public void OkButtonPort (){
        OKDischargePort.click();
    }
    public void CloseImportBuyer(){
        CloseImportPopupBuyer.click();
    }
    public void ClickConsolGroupBuyer(){
        clickConsolBuyer.click();

    }
    public void EnterQtyBuyer(){
        EnterQtyBuyer.sendKeys("50");
    }
    public void SelectContainerBuyer(){
        SelectContainerBuyer.click();
    }
    public void OkeCreateConsolBuyer(){
        OkeCreateConsolBuyer.click();
    }
    public void OkeCommodityBuyerConsol(){
        OkeCommodityBuyerConsol.click();
    }
    public void NextButtonStep1(){
        NextButtonStep1.click();
    }
    public void SubmitButtonBuyerConsol(){
        SubmitButtonBuyerConsol.click();
    }
    public void GetBookingCode(){

        System.out.println(GetBookingCode.getText());
    }
    //CreateOutbound Booking
    public void SelectOutboundRadio(){
        Outbound.click();
    }
    public void ClickCLPDateandTime(){
        CLPDateandTimeClick.click();
    }
    public void SelectCLPDateandTime(){
        SelectCLPDateTime.click();
    }
    public void OKECLPdateTimeButton(){
        OKECLPdateTimeButton.click();
    }
    public void DateAndTimeStuffing(){
        DateAndTimeStuffing.click();
    }
    public void ContainerLoadingPlan(){
        ContainerLoadingPlan.click();
    }
    public void UploadDocument(){
        UploadDocument.sendKeys("C:\\Users\\vela.os010\\IdeaProjects\\untitled\\Inbound CFS (11).xlsx");
    }
    public void ImportButton(){
        ImportOutbound.sendKeys("C:\\Users\\vela.os010\\IdeaProjects\\untitled\\Outbound CFS (4).xlsx");
    }
    public void CloseImportButton(){
        CloseImportButton.click();
    }
    public void NextOutBoundButton(){
        NextOutBoundButton.click();
    }
    public void SubmitOutBoundButton(){
        SubmitOutBoundButton.click();

    }



}
