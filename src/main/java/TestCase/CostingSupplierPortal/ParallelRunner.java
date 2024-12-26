package TestCase.CostingSupplierPortal;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelRunner {
    static WebDriver driver;
    public static void main(String[] args) {
        ExecutorService executor = (ExecutorService) Executors.newFixedThreadPool(1);
        for (int i = 0; i <= 2; i++) {
            executor.submit(() -> {
                CostingVAS costingVAS = new CostingVAS();
                try {
                    costingVAS.Setup();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    costingVAS.CreateCostingDT();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }


            });
        }
    }

}
