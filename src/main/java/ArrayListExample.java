import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utility.RandomDataUtility;

import java.util.ArrayList;
import java.util.Map;

public class ArrayListExample {
    WebDriver driver;


    public void TestLoginData() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://customer-dev2.vela.com.vn/");

        ArrayList<UserNameData> UserDatas = new ArrayList<>();
        UserDatas.add(new UserNameData("vela.os015@itlvncom.onmicrosoft.com","Hello@121"));
        UserDatas.add(new UserNameData("vela.os015@itlvncom.onmicrosoft.com1","Hello@12"));
        UserDatas.add(new UserNameData("vela.os015@itlvncom.onmicrosoft.com","Hello@12"));
        UserDatas.forEach(UserData-> {
            WebElement usernameField = driver.findElement(By.name("Username"));

            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("btnlogin"));
            usernameField.sendKeys(UserData.GetUserName());
            passwordField.sendKeys("Hello@123");
            loginButton.click();
            try {
                Thread.sleep(2000);  // 2 seconds wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    class UserNameData {
        String UserName;
        String PassWord;
        public UserNameData(String UserName, String PassWord ){
            this.PassWord = PassWord;
            this.UserName = UserName;
        }
        public String GetUserName(){
            return UserName;
        }
        public String GetPassWord(){
            return PassWord;
        }

    }


    public static void main(String[] args){
        ArrayList <String> userNames = new ArrayList<>();
        userNames.add("Tran Thi Tra My");
        userNames.add("Nguyen Minh Tri");
        userNames.add("Nguyen Thu Trang");
        userNames.add("Katinat");
        userNames.add("Phe La");
        for(int i =0; i<userNames.size();i++ ) {
            String userName = userNames.get(i);
            System.out.println("Each people has a name such as " + userName);
        }

    }

}
