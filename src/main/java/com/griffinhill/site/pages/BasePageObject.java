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
        wait.until(waitForElementVisibility(element)).isDisplayed();
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

    public static void waitForVisibilityOfAllElement(WebElement element){
        int attempts = 0;
        while (attempts < 2){
            try {
                waitFor(ExpectedConditions.visibilityOf(element));
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
                waitForElements(ExpectedConditions.visibilityOfAllElements(elements));
                System.out.println("Attempting to find element: " + elements.get(0) + " -- attempt count: " + attempts);
                pause(1000);
            } catch(Exception e) {
                System.out.println("Unable to find element: " + elements.get(0));
            }
            attempts++;
        }
    }

    private static void waitFor(ExpectedCondition<WebElement> condition){
        wait.until(condition);
    }

    private static void waitForElements(ExpectedCondition<List<WebElement>> condition){
        wait.until(condition);
    }

    public static void waitForPageLoad() {
        wait.until(driver -> {
            System.out.println("Current Window State: " + (((JavascriptExecutor) driver).executeScript("return document.readyState")));
            return String
                    .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                    .equals("complete");
        });
    }
}
