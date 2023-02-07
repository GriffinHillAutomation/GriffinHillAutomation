package com.griffinhill.modals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.griffinhill.utils.PageUtils.checkElementsEnabled;
import static com.griffinhill.site.pages.BasePageObject.*;

public class EditCadenceNameModal {

    @FindBy(css = "div.modal-content")
    private static WebElement editCadenceForm;
    @FindBy(css = "input[label='Cadence name']")
    private static WebElement cadenceName;
    @FindBy(css = "div.SaveCancel button[type='button']")
    private static WebElement cancel;
    @FindBy(css = "div.SaveCancel button[type='submit']")
    private static WebElement save;


    public static void checkEditCadenceModal() {
        editCadenceForm.isDisplayed();
        checkElementsEnabled(cadenceName, cancel, save);
    }

    public void editCadenceName(String cadenceNameValue) {
        sendKeys(cadenceName, cadenceNameValue);
        click(save);
    }
}
