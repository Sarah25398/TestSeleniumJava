package TestCase.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run100timesCreatBookingCFSInbound {
    static WebDriver driver;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i< 1 ; i++) {

            executor.submit(() ->
            {
             createCFSInboundButton runTestCreateCFSinbound = new createCFSInboundButton();
                try {
                    runTestCreateCFSinbound.setUp();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    runTestCreateCFSinbound.SearchQuotationID();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                runTestCreateCFSinbound.tearDown();

            });
        }

    }

}

