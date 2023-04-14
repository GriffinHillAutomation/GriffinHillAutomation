package com.griffinhill.site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static com.griffinhill.site.pages.BasePageObject.*;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;
import static com.griffinhill.utils.PageUtils.pause;

public class ScorecardBetaPage {

    @FindBy(xpath = "//li/a[text()='Pipeline']")
    private static WebElement pipeline;
    @FindBy(xpath = "//li/a[text()='Contacts']")
    private static WebElement contacts;
    @FindBy(xpath = "//button[text()='Add Suspect']")
    private static WebElement addSuspect;
    @FindBy(xpath = "//button[text()='Add Lead']")
    private static WebElement addLead;
    @FindBy(xpath = "//li/a[text()='Reports']")
    private static WebElement reports;
    @FindBy(xpath = "//li/a[text()='Attempts']")
    private static WebElement attempts;
    @FindBy(xpath = "//div[@ng-hide='showAddContact']")
    private static WebElement attemptModal;
    @FindBy(xpath = "//h4[text()='Attempts']/parent::div/parent::div//button[text()='Cancel']")
    private static WebElement attemptModalCancel;
    @FindBy(xpath = "//h4[text()='Attempts']/parent::div/parent::div//button[text()='Add Contact']")
    private static WebElement attemptModalAddContact;
    @FindBy(xpath = "//h4[text()='Attempts']/parent::div/parent::div//button[text()='Add Attempts']")
    private static WebElement attemptModalAddAttempts;
    @FindBy(xpath = "//h4[text()='Attempts']/parent::div/parent::div//button[text()='Save']")
    private static WebElement attemptModalSave;
    @FindBy(xpath = "//div[@class=\"search-form-container\"]/*[@class=\"add-new-prospect-case\"]")
    private WebElement quickAdd;
    @FindBy(xpath = "//li/a[text()='Active']")
    private static WebElement active;
    @FindBy(xpath = "//li/a[text()='Closed Deals']")
    private static WebElement dealsClosed;
    @FindBy(xpath = "//li/a[text()='Pitch & Miss']")
    private static WebElement pitchAndMiss;
    @FindBy(xpath = "//li/a[text()='All']")
    private static WebElement all;
    @FindBy(xpath = "//li/a[text()='Archived']")
    private static WebElement archived;
    @FindBy(css = "div.GriffinTable img.add-new-prospect-case")
    private static WebElement addContact;
    @FindBy(id = "suspectModal")
    private static WebElement addProspectModal;
    @FindBy(css = "input[name='first_name']")
    private WebElement addFirstName;
    @FindBy(css = "input[name='last_name']")
    private WebElement addLastName;
    @FindBy(css = "//input[@name='company_name']")
    private WebElement addCompanyName;
    @FindBy(xpath = "//button[text()='+ Add a new Case']")
    private static WebElement addNewCase;
    @FindBy(css = "input[name='case_name']")
    private static WebElement caseName;
    @FindBy(xpath = "//div[@class='action-wrapper show-import']//button[text()='Save']")
    private static WebElement addContactSaveButton;
    @FindBy(xpath = "//div[@class='modal-content']")
    private static WebElement addContactSuccessModal;
    @FindBy(xpath = "//div[@class='ModalConfirmContent ']/h4")
    private static WebElement addContactSuccessHeader;
    @FindBy(xpath = "//div[@class='modal-content']//button[text()='Done']")
    private static WebElement addContactModalDone;
    @FindBy(xpath = "//div[@class='dropdown-menu show dropdown-menu-right']")
    private static WebElement caseViewDropdown;
    @FindBy(xpath = "//span[text()='Edit Case Details']/parent::a")
    private static WebElement editCaseDetails;
    @FindBy(xpath = "//span[text()='View Case Details']/parent::a")
    private static WebElement viewCaseDetails;
    @FindBy(xpath = "//span[text()='View Contact Record']/parent::a")
    private static WebElement viewContactRecord;
    @FindBy(xpath = "//div[@class='ContactBasicInfo']//div[@class='GriffinLabel  row'][1]//div[@class='right col-md-9']/p")
    private static WebElement viewContactRecordFirstName;
    @FindBy(xpath = "//div[@class='ContactBasicInfo']//div[@class='GriffinLabel  row'][2]//div[@class='right col-md-9']/p")
    private static WebElement viewContactRecordLastName;
    @FindBy(xpath = "//input[@label='Case Name']")
    private static WebElement editCaseName;
    @FindBy(xpath = "//div[@class='action-wrapper SaveCancel']//button[text()='Save']")
    private static WebElement editCaseDetailsSave;
    @FindBy(xpath = "//div[@class='CaseDetail']//div[@class='detail-title']/h3")
    private static WebElement viewCaseDetailsNameHeader;
    @FindBy(css = "input[name='position']")
    private static WebElement addPosition;
    @FindBy(xpath = "//*[@id='suspectModal']/div/div/div[3]/div/div/button[2]|//button[text()='Save']")
    private WebElement addProspectSaveBtn;
    @FindBy(xpath = "//a[text()='Case']")
    private static WebElement dealsClosedCase;
    @FindBy(xpath = "//a[text()='Needs Audit']")
    private static WebElement dealsClosedNeedsAudit;
    @FindBy(xpath = "//a[text()='Solution Presentation']")
    private static WebElement dealsClosedSolutionPresentation;
    @FindBy(xpath = "//a[text()='Adapted Solution']")
    private static WebElement dealsClosedAdaptedSolution;
    @FindBy(xpath = "//a[text()='Closing Interactions']")
    private static WebElement dealsClosedClosingInteractions;
    @FindBy(xpath = "//a[text()='Closed']")
    private static WebElement dealsClosedHeader;
    @FindBy(xpath = "//a[text()='Fulfilled']")
    private static WebElement dealsClosedFulfilled;
    @FindBy(xpath = "//a[text()='Fulfillment and Follow Up']")
    private static WebElement dealsClosedFulfillmentFollowUp;
    @FindBy(xpath = "//a[text()='Product']")
    private static WebElement dealsClosedProduct;
    @FindBy(xpath = "//a[text()='Options']")
    private static WebElement dealsClosedOptions;
    @FindBy(xpath = "//li/a[text()='Prospects']")
    private static WebElement contactsProspects;
    @FindBy(xpath = "//li/a[text()='Suspects']")
    private static WebElement contactsSuspects;
    @FindBy(xpath = "//li/a[text()='Leads']")
    private static WebElement contactsLeads;
    @FindBy(xpath = "//li/a[text()='All']")
    private static WebElement contactsAll;
    @FindBy(xpath = "//li/a[text()='Productivity']")
    private static WebElement reportsProductivity;
    @FindBy(xpath = "//canvas[@name='chartCAP_Productivity']")
    private static WebElement reportsChartProductivity;
    @FindBy(xpath = "//button[text()='Attempts and Points']")
    private static WebElement productivityAttemptsAndPoints;
    @FindBy(xpath = "//button[text()='Demo']")
    private static WebElement productivityDemo;
    @FindBy(xpath = "//button[text()='Points by Events']")
    private static WebElement productivityPointsByEvents;
    @FindBy(xpath = "//button[text()='Active Cases Count']")
    private static WebElement productivityActiveCasesCount;
    @FindBy(xpath = "//button[text()='Active Cases Percent']")
    private static WebElement productivityActiveCasesPercent;
    @FindBy(xpath = "//button[text()='Point Trends by Week']")
    private static WebElement productivityPointTrendsByWeek;
    @FindBy(xpath = "//button[text()='Points Trend by Day of Week']")
    private static WebElement productivityPointTrendsDayByWeek;
    @FindBy(xpath = "//li/a[text()='Proficiency']")
    private static WebElement reportsProficiency;
    @FindBy(xpath = "//canvas[@name='chartRNA_Proficiency']")
    private static WebElement reportsChartRNAProficiency;
    @FindBy(xpath = "//button[text()='Ratios - By NA']")
    private static WebElement proficiencyRatiosByNa;
    @FindBy(xpath = "//button[text()='Ratios - By SP']")
    private static WebElement proficiencyRatiosBySp;
    @FindBy(xpath = "//button[text()='Ratios - By AS']")
    private static WebElement proficiencyRatiosByAs;
    @FindBy(xpath = "//button[text()='Ratios - By CL']")
    private static WebElement proficiencyRatiosByCl;
    @FindBy(xpath = "//button[text()='Pipeline Advancement Counts']")
    private static WebElement proficiencyPipelineAdvancementCounts;
    @FindBy(xpath = "//button[text()='Pipeline Advancement Percent']")
    private static WebElement proficiencyPipelineAdvancementPercent;
    @FindBy(css = "input[name='filters[0].from']")
    private static WebElement filterDateFrom;
    @FindBy(css = "input[name='filters[0].to']")
    private static WebElement filterDateTo;
    @FindBy(xpath = "//button[text()='Year to Date']")
    private static WebElement yearToDate;
    @FindBy(xpath = "//button[text()='Month to Date']")
    private static WebElement monthToDate;
    @FindBy(xpath = "//button[text()='Last Year']")
    private static WebElement lastYear;
    @FindBy(xpath = "//button[text()='Last Quarter']")
    private static WebElement lastQuarter;
    @FindBy(xpath = "//button[text()='Last Month']")
    private static WebElement lastMonth;
    @FindBy(xpath = "//button[text()='Last Week']")
    private static WebElement lastWeek;
    @FindBy(xpath = "//button[text()='Yesterday']")
    private static WebElement yesterday;
    @FindBy(xpath = "//button[text()='Submit']")
    private static WebElement submit;
    @FindBy(css = "label.InputTag")
    private static WebElement filterByLabel;
    @FindBy(xpath = "//button[text()='Apply']")
    private static WebElement apply;
    @FindBy(xpath = "//button[text()='Export Sheet']")
    private static WebElement exportSheet;
    @FindBy(xpath = "//button[text()='Export PDF']")
    private static WebElement exportPdf;
    @FindBy(xpath = "//button[text()='Compare']")
    private static WebElement compare;
    @FindBy(xpath = "//div[@class='chart-container undefined']")
    private static WebElement reportsChart;
    @FindBy(xpath = "//li/a[text()='Performance']")
    private static WebElement reportsPerformance;
    @FindBy(xpath = "//canvas[@name='chartGA_Performance']")
    private static WebElement reportsChartGAPerformance;
    @FindBy(xpath = "//button[text()='Goal Analysis']")
    private static WebElement reportsGoalAnalysis;
    @FindBy(xpath = "//button[text()='Closes']")
    private static WebElement reportsCloses;


    public void checkOpenedPage() {
        checkElementsEnabled(new WebElement[]{pipeline, contacts, reports, quickAdd, active, dealsClosed, pitchAndMiss, all, archived});
    }

    public void quickAdd() {
        click(quickAdd);
        checkElementsEnabled(new WebElement[]{
                addFirstName,
                addLastName,
                addNewCase
        });
        //addProspectModal.isDisplayed();
    }

    public void clickContacts() {
        click(contacts);
        click(addSuspect);
        addProspectModal.isDisplayed();
    }

    public void clickReports() {
        click(reports);
    }

    public void clickAttempts() {
        click(attempts);
    }

    public void validateAttemptForm() {
        attemptModal.isDisplayed();
        checkElementsEnabled(new WebElement[]{attemptModalCancel, attemptModalAddAttempts, attemptModalAddContact, attemptModalSave});
    }

    public void validateReportsView() {
        List<WebElement> reportsView = driver.findElements(By.xpath("//div[@class='chartjs-size-monitor-expand']")); {
            for (WebElement report : reportsView) {
                report.isDisplayed();
            }
        }
    }

    public void fillProspect(String firstName, String lastName, String companyName) {
        sendKeys(addFirstName, firstName);
        sendKeys(addLastName, lastName);
        inputCompanyName(companyName);
    }

    public void inputCompanyName(String companyName) {
        if (!companyName.equalsIgnoreCase("")) {
            sendKeys(addCompanyName, companyName);
        }
    }

    public void inputPosition(String position) {
        if (!position.equalsIgnoreCase("")) {
            sendKeys(addPosition, position);
        }
    }

    public void clickSaveProspect() {
        click(addProspectSaveBtn);
    }

    public void clickPipelineDealsClosed() {
        click(dealsClosed);
    }

    public void validateDealsClosedView() {
        checkElementsEnabled(new WebElement[]{
                dealsClosedCase, dealsClosedCase,
                dealsClosedNeedsAudit, dealsClosedSolutionPresentation,
                dealsClosedAdaptedSolution, dealsClosedClosingInteractions,
                dealsClosedClosingInteractions, dealsClosedHeader,
                dealsClosedFulfilled, dealsClosedFulfillmentFollowUp,
                dealsClosedProduct, dealsClosedOptions
        });
    }

    public void clickPipelinePitchAndMiss() {
        click(dealsClosed);
    }

    public void validatePitchAndMiss() {
        checkElementsEnabled(new WebElement[]{
                dealsClosedCase, dealsClosedCase,
                dealsClosedNeedsAudit, dealsClosedSolutionPresentation,
                dealsClosedAdaptedSolution, dealsClosedClosingInteractions,
                dealsClosedFulfilled, dealsClosedFulfillmentFollowUp,
                dealsClosedProduct, dealsClosedOptions
        });
    }

    public void clickPipelineAll() {
        click(all);
    }

    public void validatePipelineAll() {
        checkElementsEnabled(new WebElement[]{
                dealsClosedCase, dealsClosedCase,
                dealsClosedNeedsAudit, dealsClosedSolutionPresentation,
                dealsClosedAdaptedSolution, dealsClosedClosingInteractions,
                dealsClosedClosingInteractions, dealsClosedHeader,
                dealsClosedFulfilled, dealsClosedFulfillmentFollowUp,
                dealsClosedProduct, dealsClosedOptions
        });
    }

    public void clickPipelineArchived() {
        click(archived);
    }

    public void validatePipelineArchived() {
        checkElementsEnabled(new WebElement[]{
                dealsClosedCase, dealsClosedCase,
                dealsClosedNeedsAudit, dealsClosedSolutionPresentation,
                dealsClosedAdaptedSolution, dealsClosedClosingInteractions,
                dealsClosedClosingInteractions, dealsClosedHeader,
                dealsClosedFulfilled, dealsClosedFulfillmentFollowUp,
                dealsClosedProduct, dealsClosedOptions
        });
    }

    public void validateContactsProspect() {
        checkElementsEnabled(new WebElement[]{
                addSuspect
        });
    }

    public void validateContactsSuspect() {
        click(contactsSuspects);
        checkElementsEnabled(new WebElement[]{
                addSuspect
        });
    }

    public void validateContactsLead() {
        click(contactsLeads);
        checkElementsEnabled(new WebElement[]{
                addLead, addSuspect
        });
    }

    public void validateContactsAll() {
        click(contactsLeads);
        checkElementsEnabled(new WebElement[]{
                addSuspect
        });
    }

    public void validateReportsProductivity() {
        click(reportsProductivity);
        checkElementsEnabled(new WebElement[]{
                reportsProductivity, reportsChartProductivity,
                productivityAttemptsAndPoints, productivityDemo,
                productivityPointsByEvents, productivityActiveCasesCount,
                productivityActiveCasesPercent, productivityPointTrendsByWeek,
                productivityPointTrendsDayByWeek
        });
    }

    public void validateReportsProficiency() {
        checkElementsEnabled(new WebElement[]{proficiencyRatiosByNa ,proficiencyRatiosBySp, proficiencyRatiosByAs,
                proficiencyRatiosByCl, proficiencyPipelineAdvancementCounts,
                proficiencyPipelineAdvancementPercent, filterDateFrom,
                filterDateTo, yearToDate, monthToDate, lastYear,
                lastQuarter, lastMonth, lastWeek, yesterday,
                submit, filterByLabel, apply, exportSheet, exportPdf, compare,
                reportsChart});
    }

    public void validateReportsPerformance() {
        click(reportsPerformance);
        checkElementsEnabled(new WebElement[]{
                reportsChartGAPerformance,
                reportsGoalAnalysis,
                reportsCloses
        });
    }

    public void clickAddContact() {
        click(addContact);
        checkElementsEnabled(new WebElement[]{
                addFirstName,
                addLastName,
                addNewCase
        });
    }

    public void fillContact(String firstName, String lastName) {
        sendKeys(addFirstName, firstName);
        sendKeys(addLastName, lastName);
    }

    public void clickAddNewCase() {
        click(addNewCase);
    }

    public void inputCaseName(String caseNameValue) {
        sendKeys(caseName, caseNameValue);
    }

    public void clickAddNewContactSave() {
        click(addContactSaveButton);
    }

    public void verifyAddNewContactSuccess() {
        addContactSuccessModal.isDisplayed();
        Assert.assertTrue(addContactSuccessHeader.getText().equalsIgnoreCase("Success!"));
        addContactModalDone.isDisplayed();
    }

    public void confirmAddContact() {
        click(addContactModalDone);
        pause(5000);
    }

    public void clickCaseNameDropdown(String caseName) {
        driver.findElement(By.xpath("//a[text()='"+ caseName +"']/parent::span/parent::div/parent::div/parent::td/parent::tr//button[@class='dropdown-toggle dropdown-toggle-split btn btn-griffin btn-sm']")).click();
        caseViewDropdown.isDisplayed();
    }

    public void clickEditCaseDetails() {
        click(editCaseDetails);
    }

    public void clickViewCaseDetails() {
        click(viewCaseDetails);
    }

    public void clickViewContactRecord() {
        click(viewContactRecord);
    }

    public void editCaseName(String name) {
        editCaseName.clear();
        sendKeys(editCaseName, name);
    }

    public void clickEditCaseSave() {
        click(editCaseDetailsSave);
    }

    public void verifyCaseNewName(String caseNewName) {
        List<WebElement> caseNames = driver.findElements(By.xpath("//div[@class='CaseLabel']//span/a"));

        for (WebElement caseName : caseNames) {
            if (caseName.getText().equalsIgnoreCase(caseNewName)) {
                Assert.assertTrue(caseName.getText().equalsIgnoreCase(caseNewName));
                break;
            }
        }
    }

    public void verifyCaseDetailsName(String caseNewName) {
        pause(5000);
        Assert.assertTrue(viewCaseDetailsNameHeader.getText().equalsIgnoreCase(caseNewName));
    }

    public void verifyContactRecordDetails(String firstName, String lastName) {
        pause(3000);
        Assert.assertTrue(viewContactRecordFirstName.getText().equalsIgnoreCase(firstName));
        Assert.assertTrue(viewContactRecordLastName.getText().equalsIgnoreCase(lastName));
    }
}
