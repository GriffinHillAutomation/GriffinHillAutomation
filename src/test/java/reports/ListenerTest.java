package reports;

import com.griffinhill.site.pages.BasePageObject;
import io.qameta.allure.Allure;
import io.qameta.allure.model.TestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public abstract class ListenerTest extends BasePageObject implements ITestListener {

    @Override
    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public abstract void beforeTestSuiteStart(TestResult testResult);

    public abstract void afterTestSuiteFinish(TestResult testResult);

    public abstract void beforeTestStart(TestResult testResult);

    @Override
    public void onTestFailure(ITestResult arg0) {
        // TODO Auto-generated method stub
        takeScreenshot(driver);
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub
        takeScreenshot(driver);

    }

    @Override
    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub
        takeScreenshot(driver);
    }


    public void afterTestFinish(TestResult testResult)
    {
    }

    public abstract void afterTestFinish(ITestResult testResult);

    public void takeScreenshot(WebDriver driver) {
        Allure.addAttachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

   /* @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(WebDriver driver) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        return screenshot; }*/
}
