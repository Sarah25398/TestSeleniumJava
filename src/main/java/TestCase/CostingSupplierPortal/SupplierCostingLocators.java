package TestCase.CostingSupplierPortal;


import org.openqa.selenium.By;

public class SupplierCostingLocators {
    public static final By LOGIN_BUTTON = By.id("btnlogin");
    public static final By USERNAME_FIELD = By.id("username");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By Create_Costing_Button = By.xpath("(//span[@class='ng-star-inserted'])[2]");
    public static final By Scope_of_service_DT = By.xpath("(//input[@type='radio'])[2]");
    public static final By Charge_Type = By.xpath("(//input[@type='radio'])[5]");
    public static final By Button_Next = By.xpath("(//button[@class='ant-btn ant-btn-primary'])[2]");
    public static final By Button_Next_Step1 = By.xpath("//button[@class='ant-btn ant-col ant-btn-primary ng-star-inserted']");
}
