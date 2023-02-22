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

    public static WebDriverWait wait;
    public static WebDriver driver;

    public BasePageObject() {
    }

    public static void waitUntilPageIsLoaded() {
        wait.until(driver1 -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }

    public static void click(WebElement element) {
        verifyElementDisplayed(element);
        verifyElementClickable(element);
        element.click();
        waitForPageLoad();
    }

    public static void sendKeys(WebElement element, String data) {
        verifyElementDisplayed(element);
        element.clear();
        element.sendKeys(data);
    }

    private static ExpectedCondition<WebElement> waitForElementVisibility(WebElement locator) {
        return ExpectedConditions.visibilityOf(locator);
    }

    public static void verifyElementDisplayed(WebElement element) {
        try {
            wait.until(waitForElementVisibility(element)).isDisplayed();
        } catch (Exception e) {

        }
    }

    public static void verifyElementClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {

        }

    }

    public static void verifyContent(WebElement element, String message) {
        verifyElementDisplayed(element);
        Assert.assertTrue(element.getText().equalsIgnoreCase(message));
    }

    protected void waitForVisibilityOf(By locator) {
        int attempts = 0;
        while (attempts < 2) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                pause(1000);
            } catch (Exception e) {

            }
            attempts++;
        }
    }

    public static void waitForVisibilityOfAllElement(WebElement element) {
        int attempts = 0;
        while (attempts < 2) {
            try {
                System.out.println("test");
                wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
                System.out.println("Attempting to find element: " + element + " -- attempt count: " + attempts);
                pause(1000);
            } catch (Exception e) {
                System.out.println("Unable to find element: " + element);
            }
            attempts++;
        }
    }

    public static void waitForVisibilityOfAllElements(List<WebElement> elements) {
        int attempts = 0;
        while (attempts < 2) {
            try {
                wait.until(ExpectedConditions.visibilityOfAllElements(elements));
                System.out.println("Attempting to find element: " + elements.get(0) + " -- attempt count: " + attempts);
                pause(1000);
            } catch (Exception e) {
                System.out.println("Unable to find element: " + elements.get(0));
            }
            attempts++;
        }
    }

    private static void waitFor(ExpectedCondition<WebElement> condition) {
        wait.until(condition).isDisplayed();
    }

    private static void waitForElements(ExpectedCondition<List<WebElement>> condition) {
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
