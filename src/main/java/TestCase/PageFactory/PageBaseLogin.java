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


}
