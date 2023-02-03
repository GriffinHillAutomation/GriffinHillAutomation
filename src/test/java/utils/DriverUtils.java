package utils;

import com.griffinhill.tests.TestsInit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtils {

    public static void waitUntilPageIsLoaded() {
        Wait<WebDriver> wait = new WebDriverWait(TestsInit.driver, 30);
        wait.until(driver1 -> ((JavascriptExecutor)TestsInit.driver).executeScript("return document.readyState").equals("complete"));
    }
}
