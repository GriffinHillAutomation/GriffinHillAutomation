package com.griffinhill.modals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.griffinhill.site.pages.BasePageObject.click;
import static com.griffinhill.site.pages.BasePageObject.sendKeys;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;

public class OrganizeStepsModal {

    @FindBy(css = "div.OrganizeSteps")
    private static WebElement organizeStepsModal;
    @FindBy(css = "div.SaveCancel button[type='button']")
    private static WebElement cancel;
    @FindBy(css = "div.SaveCancel button[type='submit']")
    private static WebElement save;


    public static void checkOrganizeStepsModal() {
        organizeStepsModal.isDisplayed();
        checkElementsEnabled(cancel, save);
    }
}
