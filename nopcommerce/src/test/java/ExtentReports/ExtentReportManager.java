package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;

public class ExtentReportManager {

    static String reportDir = System.getProperty("user.dir") + "/Reports/nopCommerce.html";

    private static ExtentReports extentReport;
    private static ExtentSparkReporter extentSparkReporter;

    public static ExtentReports extentSetup(){
        extentReport = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(new File(reportDir));
        extentReport.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setDocumentTitle("FLASH - Extent Report");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setReportName("NopCommerce App");
        extentReport.setSystemInfo("OS", System.getProperty("os.name"));
        extentReport.setSystemInfo("Execution Machine", System.getProperty("user.name"));

        return extentReport;
    }
}