package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;
    public static ExtentReports createInstance( String filePath){
        ExtentSparkReporter reporter = new ExtentSparkReporter(filePath);
        reporter.config().setTheme(Theme.DARK);
        reporter.config().setDocumentTitle("Test Automation results");
        reporter.config().setReportName("Test Vela Automation report");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Tran Thi Tra My");
        extent.setSystemInfo("dev2","QA");
        extent.setSystemInfo("Browser","Chrome");

        return extent;
    }






}
