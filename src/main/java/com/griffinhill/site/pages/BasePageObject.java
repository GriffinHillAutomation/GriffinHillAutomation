package com.griffinhill.site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.function.Function;

import static com.griffinhill.utils.PageUtils.pause;

public class BasePageObject {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public BasePageObject(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30000);
    }

    public static void click(WebElement element) {
        waitForElementVisibility(element);
        element.click();
    }

    public static void sendKeys(WebElement element, String data) {
        waitForElementVisibility(element);
        element.clear();
        element.sendKeys(data);
    }

    private static ExpectedCondition<WebElement> waitForElementVisibility(WebElement locator){
        return ExpectedConditions.visibilityOf(locator);
    }

    public static void verifyElementDisplayed(WebElement element) {
        waitForElementVisibility(element);
        element.isDisplayed();
    }

    public static void verifyContent(WebElement element, String message) {
        waitForElementVisibility(element);
        Assert.assertTrue(element.getText().equalsIgnoreCase(message));
    }

    protected void waitForVisibilityOf(By locator){
        int attempts = 0;
        while (attempts < 2){
            try {
               wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
               pause(1000);
            } catch(Exception e) {

            }
            attempts++;
        }
    }

    public static void waitForVisibilityOfAllElement(WebElement element, Integer... timeOutInSeconds){
        int attempts = 0;
        while (attempts < 2){
            try {
                waitFor(ExpectedConditions.visibilityOf(element), (timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
                System.out.println("Attempting to find element: " + element + " -- attempt count: " + attempts);
                pause(1000);
            } catch(Exception e) {
                System.out.println("Unable to find element: " + element);
            }
            attempts++;
        }
    }

    public static void waitForVisibilityOfAllElements(List<WebElement> elements, Integer... timeOutInSeconds){
        int attempts = 0;
        while (attempts < 2){
            try {
                waitForElements(ExpectedConditions.visibilityOfAllElements(elements), (timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
                System.out.println("Attempting to find element: " + elements.get(0) + " -- attempt count: " + attempts);
                pause(1000);
            } catch(Exception e) {
                System.out.println("Unable to find element: " + elements.get(0));
            }
            attempts++;
        }
    }

    private static void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds){
        timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(condition);
    }

    private static void waitForElements(ExpectedCondition<List<WebElement>> condition, Integer timeOutInSeconds){
        timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(condition);
    }

    public static void waitForPageLoad() {
        wait = new WebDriverWait(driver, 30);
        wait.until(driver -> {
            System.out.println("Current Window State: " + (((JavascriptExecutor) driver).executeScript("return document.readyState")));
            return String
                    .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                    .equals("complete");
        });
    }
}
