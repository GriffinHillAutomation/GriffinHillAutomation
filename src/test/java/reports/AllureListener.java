package reports;

import com.griffinhill.site.pages.BasePageObject;
import io.qameta.allure.Attachment;
import io.qameta.allure.model.TestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class AllureListener extends ListenerTest  {

    @Override
    public void beforeTestSuiteStart(TestResult testResult) {
        // Implement code to be executed before the test suite starts
    }

    @Override
    public void afterTestSuiteFinish(TestResult testResult) {
        // Implement code to be executed after the test suite finishes
    }


    @Override
    public void beforeTestStart(TestResult testResult) {
        // Implement code to be executed before each test case starts
    }

    @Override
    public void onTestFailure(ITestResult testResult) {
        // Implement code to be executed before each test case starts
        takeScreenshot(driver);
    }

    @Override
    public void afterTestFinish(TestResult testResult) {

    }

    @Override
    public void afterTestFinish(ITestResult testResult) {
        // Implement code to be executed after each test case finishes


    }

}
