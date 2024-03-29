package com.griffinhill.site.pages;

import com.griffinhill.enums.PageNavigation;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.griffinhill.site.pages.BasePageObject.*;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;
import static com.griffinhill.utils.PageUtils.validateActualAndExpected;

public class IlassoBetaPage {

    @FindBy(xpath = "//a[contains(text(), 'Tasks')]")
    private static WebElement tasks;
    @FindBy(xpath = "//a[contains(text(), 'Contacts')]")
    private static WebElement contacts;
    @FindBy(xpath = "//a[contains(text(), 'Calendar')]")
    private static WebElement calendar;
    @FindBy(xpath = "//a[contains(text(), 'Reports')]")
    private static WebElement reports;
    @FindBy(xpath = "//a[contains(text(), 'Phone Logs')]")
    private static WebElement phoneLogs;
    @FindBy(xpath = "//a[contains(text(), 'Cadences')]")
    private static WebElement cadences;
    @FindBy(xpath = "//a[contains(text(), 'Scorecard')]")
    private static WebElement scoreCard;
    @FindBy(xpath = "//button[contains(text(), ' Add Cadence')]")
    private static WebElement addCadence;
    @FindBy(css = "input[placeholder='Search for...']")
    private static WebElement searchBar;
    @FindBy(xpath = "//button[contains(text(), 'Search')]")
    private static WebElement searchButton;
    @FindBy(css = "div.GriffinTable ")
    private static WebElement searchTable;
    @FindBy(xpath = "//table")
    private static WebElement cadenceTable;
    @FindBy(css = "table p.GriffinText span")
    private static List<WebElement> searchResults;
    @FindBy(xpath = "//button[contains(text(), 'Load All Data')]")
    private static WebElement loadAllData;
    @FindBy(css = "span.showing select")
    private static WebElement selectShowData;
    @FindBy(css = "div.modal-content div.CreateCadenceOption:nth-child(1)")
    private static WebElement newCadence;
    @FindBy(css = "div.modal-content div.CreateCadenceOption:nth-child(2)")
    private static WebElement copyCadence;
    @FindBy(xpath = "//input[@label='Cadence name']")
    private static WebElement cadenceName;
    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement add;
    @FindBy(css = "table[role='table'] tbody tr:nth-child(1) td div.ClickableList")
    private static WebElement copyFirstCadence;
    @FindBy(xpath = "//button[contains(text(), 'Delete')]")
    private static WebElement delete;
    @FindBy(xpath = "//div[@class='modal-content']//button[contains(text(), 'Confirm')]")
    private static WebElement confirmDelete;
    @FindBy(xpath = "//div[@class='modal-content']//button[contains(text(), 'Cancel')]")
    private static WebElement confirmCancel;
    @FindBy(css = "div.Alert")
    private static WebElement successMsg;
    @FindBy(xpath = "//button[@class='dropdown-toggle dropdown-toggle-split btn btn-griffin btn-sm']")
    private static WebElement cadenceViewArrowDown;
    @FindBy(xpath = "//div[@class='dropdown-menu show dropdown-menu-right']")
    private static WebElement cadenceViewOptions;
    @FindBy(xpath = "//div[@class='dropdown-menu show dropdown-menu-right']/a[1]")
    private static WebElement optionViewCadence;
    @FindBy(xpath = "//div[@class='dropdown-menu show dropdown-menu-right']/a[2]")
    private static WebElement optionEditCadenceName;
    @FindBy(xpath = "//div[@class='dropdown-menu show dropdown-menu-right']/a[3]")
    private static WebElement optionOragnizeStep;
    @FindBy(xpath = "//div[@class='dropdown-menu show dropdown-menu-right']/a[4]")
    private static WebElement optionDeactivateCadence;
    @FindBy(xpath = "//div[@class='dropdown-menu show dropdown-menu-right']/a[5]")
    private static WebElement optionDeleteCadence;
    @FindBy(css = "button.CadenceStatusBtn")
    private static List<WebElement> cadenceStatusIndicator;
    @FindBy(css = "button.CadenceStatusBtn")
    private static WebElement cadenceStatusIndicator_Element;
    @FindBy(xpath = "//span[text()='Add Step']/parent::div/parent::button")
    private static WebElement addStep;
    @FindBy(css = "div.AddStepModalForm")
    private static WebElement addStepModalForm;
    @FindBy(xpath = "//div[@class='col-lg-12'][1]//div[@class='Select css-2b097c-container']")
    private static WebElement timer;
    @FindBy(xpath = "//div[@class='col-lg-12'][2]//div[@class='Select css-2b097c-container']")
    private static WebElement stepType;
    @FindBy(xpath = "//div[@class='col-lg-12'][3]//div[@class='Select css-2b097c-container']")
    private static WebElement stepAction;
    @FindBy(css = "textarea[label='Notes']")
    private static WebElement addStepNotes;
    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement next;
    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement save;
    @FindBy(css = "div.CadenceEmailTemplate")
    private static WebElement emailTemplate;
    @FindBy(css = "div.CadenceMessageTemplate")
    private static WebElement textMessageTemplate;
    @FindBy(xpath = "//p[text()='Template name:']/parent::div/parent::div//input")
    private static WebElement templateName;
    @FindBy(xpath = "//p[text()='Subject: ']/parent::div/parent::div//input")
    private static WebElement subject;
    @FindBy(xpath = "//div[@role='textbox']")
    private static WebElement textbox;
    @FindBy(css = "input[label='Step/task name']")
    private static WebElement otherTaskName;


    public void checkOpenedPage() {
        try {
            checkElementsEnabled(new WebElement[]{tasks, contacts, calendar, reports, phoneLogs, cadences, scoreCard});
        }
        catch (Exception e)
        {
            System.out.println("");
        }
    }

    @Step("Navigate To")
    public void navigateTo(PageNavigation page) throws Exception {
        checkOpenedPage();
        switch (page) {
            case TASKS:
                click(tasks);
                break;
            case CONTACTS:
                click(contacts);
                break;
            case CALENDAR:
                click(calendar);
                break;
            case REPORTS:
                click(reports);
                break;
            case PHONE_LOGS:
                click(phoneLogs);
                break;
            case CADENCES:
                //try {
                clickWithException(cadences);
                //}
                //catch (Exception e)
                //{
                //  throw new Exception("Element not clicked.");
                //}

                break;
            case SCORECARD:
                click(scoreCard);
                break;
        }
    }

    public void addCadence(String typeOfCadence, String name) {
        click(addCadence);
        if (typeOfCadence.equalsIgnoreCase("new")) {
            click(newCadence);
            cadenceName.isDisplayed();
            sendKeys(cadenceName, name);
            click(add);
        } else if (typeOfCadence.equalsIgnoreCase("copy")) {
            click(copyCadence);
            click(copyFirstCadence);
            validateActualAndExpected(cadenceName.getText(), name);
            click(add);
        }
    }

    public void deleteLatestCadenceRecord() {
        WebElement latestRecordCheckbox = driver.findElement(By.xpath("//table/tbody/tr[1]//input[@title='Toggle Row Selected']"));
        click(latestRecordCheckbox);
        click(delete);
        waitForVisibilityOfAllElement(confirmDelete);
        click(confirmDelete);
    }

    public void searchCadence(String cadence) {
        sendKeys(searchBar,cadence);
        searchButton.click();
    }

    public void loadAllData() {
        loadAllData.click();
    }

    public void verifySearchResult(String cadence) {
        waitForVisibilityOfAllElements(searchResults);
        List<String> result = new ArrayList<>();
        for (WebElement searchResult : searchResults) {
            result.add(searchResult.getText());
        }
        Assert.assertTrue(result.contains(cadence));
    }

    public void verifySearchResultTableIsNotEmpty() {
        waitForVisibilityOfAllElements(searchResults);
        for (WebElement result : searchResults) {
            Assert.assertTrue(result.isDisplayed());
        }
    }

    public Boolean validateSearchResultTableIsNotEmpty() {
        verifyElementDisplayed(cadenceTable);
        return cadenceTable.findElements(By.xpath("tbody/tr")).size() >= 1;

    }

    public void showCadenceList(int numberOfData) {
        Select showDataDropdown = new Select(selectShowData);
        showDataDropdown.selectByValue(String.valueOf(numberOfData));
    }

    public void verifySearchResults(int numberOfExpectedData) {
        waitForVisibilityOfAllElements(searchResults);
        boolean isTrue = searchResults.size() <= numberOfExpectedData;
        Assert.assertTrue(isTrue);
    }

    public Boolean verifySuccessMsg() {
        waitForVisibilityOfAllElement(successMsg);
        verifyElementDisplayed(successMsg);
        return successMsg.isDisplayed();
    }

    private void verifyCadenceViewOptions() {
        verifyElementDisplayed(cadenceViewArrowDown);
        click(cadenceViewArrowDown);
        waitForVisibilityOfAllElement(cadenceViewOptions);
    }

    public void clickCadenceViewOption(String element) {
        verifyCadenceViewOptions();
        waitForPageLoad();
        switch (element) {
            case "VIEW_CADENCE":
                click(optionViewCadence);
                break;
            case "EDIT_CADENCE_NAME":
                click(optionEditCadenceName);
                break;
            case "ORGANIZE_STEP":
                click(optionOragnizeStep);
                break;
            case "DEACTIVATE_CADENCE":
                click(optionDeactivateCadence);
                break;
            case "DELETE_CADENCE":
                click(optionDeleteCadence);
                break;
        }
    }

    public void activateCadence() {
        verifyElementDisplayed(cadenceStatusIndicator_Element);
        waitForVisibilityOfAllElements(cadenceStatusIndicator);
        for (WebElement e : cadenceStatusIndicator) {
            String status = e.getText();
            if (status.equalsIgnoreCase("Inactive")) {
                verifyCadenceViewOptions();
                click(optionDeactivateCadence);
            }
        }
    }

    public boolean validateCadenceStatus(String statusValue) {
        boolean isActive = false;
        verifyElementDisplayed(cadenceStatusIndicator_Element);
        waitForVisibilityOfAllElements(cadenceStatusIndicator);
        for (WebElement e : cadenceStatusIndicator) {
            String status = e.getText();
            if (status.equalsIgnoreCase(statusValue)) {
                isActive = true;
            } else {
                isActive = false;
            }
        }
        return isActive;
    }

    public void clickCadence(String name) {
        waitForVisibilityOfAllElements(searchResults);
        WebElement e = driver.findElement(By.xpath(String.format("//span[text()='%s']", name)));
        click(e);
        sleep(1000);
    }

    public void clickAddStep() {
        sleep(2000);
        click(addStep);
        waitForVisibilityOfAllElement(addStepModalForm);
    }

    public void selectTimer(String timerValue) {
        click(timer);
        WebElement e = driver.findElement(By.xpath(String.format("//div[contains(text(), '%s')]", timerValue)));
        System.out.println(e.isDisplayed());
        click(e);
    }

    public void selectStepType(String stepTypeValue) {
        click(stepType);
        WebElement e = driver.findElement(By.xpath(String.format("//div[contains(text(), '%s')]", stepTypeValue)));
        System.out.println(e.isDisplayed());
        click(e);
    }

    public void selectStepAction(String stepActionValue) {
        click(stepAction);
        WebElement e = driver.findElement(By.xpath(String.format("//div[contains(text(), '%s')]", stepActionValue)));
        System.out.println(e.isDisplayed());
        click(e);
    }

    public void writeNotes(String notes) {
        sendKeys(addStepNotes, notes);
        click(next);
    }

    public void clickNext() {
        waitForVisibilityOfAllElement(next);
        click(next);
    }

    public void clickSave() {
        waitForVisibilityOfAllElement(save);
        click(save);
    }

    public void fillEmailTemplate(String templateNameValue, String subjectValue, String emailValue) {
        waitForVisibilityOfAllElement(emailTemplate);
        sendKeys(templateName, templateNameValue);
        sendKeys(subject, subjectValue);
        sendKeys(textbox, emailValue);
        this.clickSave();
    }

    public void fillTextMessageTemplate(String templateNameValue, String emailValue) {
        waitForVisibilityOfAllElement(textMessageTemplate);
        sendKeys(templateName, templateNameValue);
        sendKeys(textbox, emailValue);
        this.clickSave();
    }

    public void fillLinkedTemplate(String templateNameValue, String emailValue) {
        waitForVisibilityOfAllElement(textMessageTemplate);
        sendKeys(templateName, templateNameValue);
        sendKeys(textbox, emailValue);
        this.clickSave();
    }

    public void inputOtherTaskName(String otherTaskNameValue) {
        waitForVisibilityOfAllElement(otherTaskName);
        sendKeys(otherTaskName, otherTaskNameValue);
    }


}
