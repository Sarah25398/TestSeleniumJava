import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InsertionSort {
    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://customer-dev2.vela.com.vn/account/register");
    }
    @Test
    public void TestInsertionSort() {
        try {

            List<WebElement> elements = driver.findElements(By.xpath("//label[@class='ant-form-item-required'][position() <= 6]"));
            insertionSort(elements);
            for (WebElement element : elements) {
                System.out.println("Text: " + element.getText());
            }
        } finally {
            driver.quit();
        }
    }

    public static void insertionSort(List<WebElement> elements) {
        for (int i = 1; i < elements.size(); i++) {
            WebElement keyElement = elements.get(i);
            String keyText = keyElement.getText().trim();
            int j = i - 1;
            while (j >= 0 && elements.get(j).getText().trim().compareTo(keyText) > 0) {
                elements.set(j + 1, elements.get(j));
                j = j - 1;
            }
            elements.set(j + 1, keyElement);
        }
    }
    @Test
    public void CollectionSort(){
        List<WebElement> elements = driver.findElements(By.xpath("//label[@class='ant-form-item-required'][position() <= 6]"));
        List<String> elementTexts = new ArrayList<>();
        for(WebElement element: elements){
            elementTexts.add(element.getText().trim());
        }
        Collections.sort(elementTexts, Comparator.reverseOrder());
        for(String text : elementTexts){
            System.out.println(text);

        };

    }
}
