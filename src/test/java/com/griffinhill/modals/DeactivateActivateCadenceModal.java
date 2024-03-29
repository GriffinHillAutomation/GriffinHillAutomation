package com.griffinhill.modals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static com.griffinhill.site.pages.BasePageObject.*;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;

public class DeactivateActivateCadenceModal {

    @FindBy(css = "div.ModalConfirmContent")
    private static WebElement deactivateActivateCadence;
    @FindBy(css = "div.ModalConfirmContent p")
    private static WebElement deactivateActivateCadenceReminder;
    @FindBy(xpath = "//button[text()='Cancel']")
    private static WebElement cancel;
    @FindBy(xpath = "//button[text()='Confirm']")
    private static WebElement confirm;


    public void checkCadenceStatusModal(String message) {
        deactivateActivateCadence.isDisplayed();
        checkElementsEnabled(new WebElement[]{cancel, confirm});
        verifyContent(deactivateActivateCadenceReminder, message);
    }

    public void confirm() {
        click(confirm);
    }

    public void cancel() {
        click(cancel);
    }
}
