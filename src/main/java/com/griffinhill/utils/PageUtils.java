package com.griffinhill.utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageUtils {

    public static void checkElementsEnabled(WebElement... elements) {
        for (WebElement element : elements) {
            element.isDisplayed();
            element.isEnabled();
        }
    }

    public static void validateActualAndExpected(String actual, String expected) {
        Assert.assertEquals(actual, expected);
        System.out.println("Actual is: " + actual + " & Expected value is: " + expected);
    }

    public static void validateActualAndExpected(Double actual, Double expected) {
        Assert.assertEquals(actual, expected);
        System.out.println("Actual is: " + actual + " & Expected value is: " + expected);
    }

    public static void validateActualAndExpected(Integer actual, Integer expected) {
        Assert.assertEquals(actual, expected);
        System.out.println("Actual is: " + actual + " & Expected value is: " + expected);
    }

    public static void validateConditionIsTrue(Boolean isTrue) {
        Assert.assertTrue(isTrue.booleanValue() == true);
    }

    public static void pause(long l) {
        try {
            Thread.sleep(l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
