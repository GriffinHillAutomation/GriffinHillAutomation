package com.griffinhill.site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static com.griffinhill.site.pages.BasePageObject.*;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;
import static com.griffinhill.utils.PageUtils.pause;

public class ScorecardBetaPage {

    String savedNotes;

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
    @FindBy(css = "span.spanCaption")
    private static WebElement addCaseHereLink;
    @FindBy(css = "input[name='made_on']")
    private static WebElement attemptDate;
    @FindBy(xpath = "//div[@class='AddAttemptModalForm']//div[@class='Select css-2b097c-container']")
    private static WebElement attemptType;
    @FindBy(xpath = "//span[text()='Add Attempt']/parent::div/parent::button")
    private static WebElement addAttempt;
    @FindBy(xpath = "//span[text()='Add Case']/parent::div/parent::button")
    private static WebElement contactViewAddCase;
    @FindBy(xpath = "//button[text()='Add New Case']")
    private static WebElement caseDetailsAddCase;
    @FindBy(xpath = "//span[text()='Attempts']/parent::div")
    private static WebElement contactViewRecordAttempts;
    @FindBy(xpath = "//span[text()='Cadences']/parent::div")
    private static WebElement contactViewRecordCadences;
    @FindBy(xpath = "//span[text()='Emails']/parent::div")
    private static WebElement contactViewRecordEmails;
    @FindBy(xpath = "//span[text()='Activity']/parent::div")
    private static WebElement contactViewRecordActivity;
    @FindBy(xpath = "//span[text()='Texts']/parent::div")
    private static WebElement contactViewRecordTexts;
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
    @FindBy(xpath = "//li/a[text()='Quick Add']")
    private WebElement quickAdd;
    @FindBy(xpath = "//li/a[text()='Active']")
    private static WebElement active;
    @FindBy(xpath = "//li/a[text()='Closed Deals']")
    private static WebElement dealsClosed;
    @FindBy(xpath = "//button[text()='Load All Data']")
    private static WebElement loadAllData;
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
    @FindBy(xpath = "//button[text()='Advanced']")
    private WebElement advanced;
    @FindBy(css = "input[placeholder='Search for...']")
    private WebElement advanceSearchBar;
    @FindBy(xpath = "//span[text()='Toggle dropdown']/parent::button")
    private WebElement deleteAttemptDropdown;
    @FindBy(xpath = "//span[text()='Delete']/parent::a")
    private WebElement deleteAttemptOption;
    @FindBy(css = "input[name='first_name']")
    private WebElement addFirstName;
    @FindBy(css = "div.AddProspectCaseModalForm input[name='first_name']")
    private WebElement contactsAddFirstName;
    @FindBy(css = "input[name='last_name']")
    private WebElement addLastName;
    @FindBy(css = "div.AddProspectCaseModalForm input[name='last_name']")
    private WebElement contactsAddLastName;
    @FindBy(xpath = "//input[@name='company_name']")
    private WebElement addCompanyName;
    @FindBy(xpath = "//div[@class='AddProspectCaseModalForm']//input[@name='company_name']")
    private WebElement contactsAddCompanyName;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement addEmail;
    @FindBy(xpath = "//div[@class='AddProspectCaseModalForm']//input[@name='email']")
    private WebElement contactsAddEmail;
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
    @FindBy(xpath = "//span[text()='Pause cadence']/parent::a")
    private static WebElement pauseCadence;
    @FindBy(xpath = "//span[text()='Activate cadence']/parent::a")
    private static WebElement activateCadence;
    @FindBy(xpath = "//span[text()='Remove from cadence']/parent::a")
    private static WebElement removeCadence;
    @FindBy(xpath = "//button[text()='Transfer Case']")
    private static WebElement transferCase;
    @FindBy(css = "div.modal-content")
    private static WebElement transferCaseModal;
    @FindBy(xpath = "//button[text()='Transfer']")
    private static WebElement transfer;
    @FindBy(xpath = "//span[text()='Edit Case Details']/parent::a")
    private static WebElement editCaseDetails;
    @FindBy(xpath = "//span[text()='View Case Details']/parent::a")
    private static WebElement viewCaseDetails;
    @FindBy(css = "div.CaseDetail")
    private static WebElement contactViewCaseDetails;
    @FindBy(xpath = "//span[text()='View Contact Record']/parent::a")
    private static WebElement viewContactRecord;
    @FindBy(css = "div.ContactBasicInfo")
    private static WebElement contactBasicInformation;
    @FindBy(css = "div.ContactInfo")
    private static WebElement contactInformation;
    @FindBy(css = "div.SocialMediaInfo")
    private static WebElement contactSocialMedia;
    @FindBy(css = "div.CustomFieldInfo")
    private static WebElement customFieldInfo;
    @FindBy(css = "div.CasesTabContent")
    private static WebElement contactCasesInfo;
    @FindBy(css = "div.ContactNotes")
    private static WebElement contactCasesNotes;
    @FindBy(css = "div.AttemptsTabContent")
    private static WebElement contactAttempts;
    @FindBy(css = "div.CadenceTabContent")
    private static WebElement contactsCadence;
    @FindBy(css = "div.EmailsTabContent")
    private static WebElement contactsEmail;
    @FindBy(css = "div.TextsTabContent")
    private static WebElement contactsTexts;
    @FindBy(css = "div.ActivityTabContent")
    private static WebElement contactsActivity;
    @FindBy(xpath = "//span[text()='Send to Pitch & Miss']/parent::a")
    private static WebElement sendToPitchAndMiss;
    @FindBy(xpath = "//span[text()='Close Case']/parent::a")
    private static WebElement closeCase;
    @FindBy(xpath = "//input[@label='Amount']")
    private static WebElement closeCaseAmount;
    @FindBy(xpath = "//input[@label='Product']")
    private static WebElement closeCaseProduct;
    @FindBy(xpath = "//span[text()='Archive Case']/parent::a")
    private static WebElement archiveCase;
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
    @FindBy(xpath = "//button[text()='Search']")
    private static WebElement search;
    @FindBy(xpath = "//div[@class='right col-md-5']//div[contains(@class, 'IndicatorsContainer')]")
    private static WebElement tagsDropdown;
    @FindBy(css = "ul.input-tag-lists")
    private static WebElement tags;
    @FindBy(xpath = "//table")
    private static WebElement contactsTable;
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
    @FindBy(xpath = "//span[text()='Add to ScoreCard Calendar']/parent::a")
    private static WebElement addToScoreCardCalendar;
    @FindBy(xpath = "//button[text()='Confirm']")
    private static WebElement confirm;
    @FindBy(xpath = "//input[@name='product_name']")
    private static WebElement productName;
    @FindBy(xpath = "//li/a[text()='Calendar']")
    private static WebElement calendar;
    @FindBy(xpath = "//span[text()='Add Notes']/parent::a")
    private static WebElement addNotes;
    @FindBy(css = "div.AddNote")
    private static WebElement contactViewAddNote;
    @FindBy(xpath = "//div[@class='input-group']//textarea")
    private static WebElement addNotesTextfield;
    @FindBy(xpath = "//button[text()='Save']")
    private static WebElement save;
    @FindBy(xpath = "//button[text()='Add']")
    private static WebElement add;
    @FindBy(xpath = "//div[@class='note']")
    private static WebElement viewCaseNoteValue;
    @FindBy(xpath = "//div[@class='Pagination']/span")
    private static WebElement test2;


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
    }

    public void clickContactsAddSuspect() {
        click(contacts);
        click(addSuspect);
        addProspectModal.isDisplayed();
    }

    public void validateContactsAdvanced() {
        click(contacts);
        click(advanced);
        checkElementsEnabled(new WebElement[]{addFirstName, addLastName, addCompanyName, addEmail});
    }

    public void contactsAdvancedSearch(String searchName) {
        sendKeys(advanceSearchBar, searchName);
    }

    public void deleteAttempt() {
        click(deleteAttemptDropdown);
        click(deleteAttemptOption);
    }

    public void searchContactFirstName(String firstName) {
        click(contacts);
        click(advanced);
        sendKeys(addFirstName, firstName);
        click(search);
    }

    public void searchContactLastName(String lastName) {
        click(contacts);
        click(advanced);
        sendKeys(addLastName, lastName);
        click(search);
    }

    public void searchContactCompanyName(String companyName) {
        click(contacts);
        click(advanced);
        sendKeys(addCompanyName, companyName);
        click(search);
    }

    public void searchContactEmail(String email) {
        click(contacts);
        click(advanced);
        sendKeys(addEmail, email);
        click(search);
    }

    public void selectTags(String tagName) {
        WebElement tagOption;
        click(contacts);
        click(advanced);
        click(tagsDropdown);
        if (tagName.equalsIgnoreCase("with any of these tags")) {
            tagOption = driver.findElement(By.id("react-select-6-option-0"));
            tagOption.click();
        } else if (tagName.equalsIgnoreCase("with all of these tags")) {
            tagOption = driver.findElement(By.id("react-select-6-option-1"));
            tagOption.click();
        } else if (tagName.equalsIgnoreCase("doesn't have any of these tags")) {
            tagOption = driver.findElement(By.id("react-select-6-option-2"));
            tagOption.click();
        } else if (tagName.equalsIgnoreCase("doesn't have all of these tags")) {
            tagOption = driver.findElement(By.id("react-select-6-option-3"));
            tagOption.click();
        }
        click(search);
    }

    public void selectTagsCategory(String tagCategory) {
        click(tags);
        WebElement tagOption = driver.findElement(By.xpath("//p[text()='"+ tagCategory +"']/parent::li"));
        click(tagOption);
        click(search);
    }

    public Boolean validateSearchResultTableIsNotEmpty() {
        verifyElementDisplayed(contactsTable);
        return contactsTable.findElements(By.xpath("tbody/tr")).size() >= 1;
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

    public void verifyClosedDeals(String closedDealsValue) {
        pause(3000);
        WebElement closedDeals = driver.findElement(By.xpath("//a[text()='"+ closedDealsValue +"']"));
        Assert.assertTrue(closedDeals.isDisplayed());
    }

    public void verifyArchivedDeals(String archivedDealsValue) {
        pause(3000);
        WebElement archivedDeals = driver.findElement(By.xpath("//a[text()='"+ archivedDealsValue +"']"));
        Assert.assertTrue(archivedDeals.isDisplayed());
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
        pause(1000);
        checkElementsEnabled(new WebElement[]{
                contactsAddFirstName,
                contactsAddLastName,
                addNewCase
        });
    }

    public void fillContact(String firstName, String lastName) {
        pause(2000);
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
        pause(1000);
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

    public void clickPauseCadence() {
        click(pauseCadence);
    }

    public void clickActivateCadence() {
        click(activateCadence);
    }

    public void clickRemoveCadence() {
        click(removeCadence);
    }

    public void clickContactCaseNameDropdown(String caseName) {
        pause(5000);
        advanceSearchBar.sendKeys(caseName);
        pause(2000);
        WebElement contactCaseNameElement = driver.findElement(By.xpath("//td[text()='"+ caseName +"']/parent::tr//button[2]"));
        contactCaseNameElement.click();
        caseViewDropdown.isDisplayed();
    }

    public void selectCaseOption(String option) {
        driver.findElement(By.xpath("//span[text()='"+ option +"']/parent::a")).click();
        pause(5000);
    }

    public void clickEditCaseDetails() {
        click(editCaseDetails);
    }

    public void clickViewCaseDetails() {
        click(viewCaseDetails);
    }

    public void validateCaseDetailView() {
        Assert.assertTrue(contactViewCaseDetails.isDisplayed());
    }

    public void clickViewContactRecord() {
        click(viewContactRecord);
    }

    public void clickContactRecordView(String contactName) {
        WebElement contactViewRecord = driver.findElement(By.xpath("//td[text()='"+ contactName +"']/parent::tr//button[text()='View']"));
        contactViewRecord.click();
    }

    public boolean validateContactCaseExists(String contactName) {
        boolean recordExist = false;
        List<WebElement> caseNames = driver.findElements(By.xpath("//table//tbody/tr/td[1]"));
        for (WebElement caseName : caseNames) {
            if (caseName.getText().equalsIgnoreCase(contactName)) {
                recordExist = true;
            } else {
                recordExist = false;
            }
        }
        return recordExist;
    }

    public void clickAddCaseHereLink() {
        click(addCaseHereLink);
    }

    public void clickAddAttempt() {
        click(addAttempt);
    }

    public void inputAttemptDate(String date) {
        sendKeys(attemptDate, date);
        pause(1000);
    }

    public void selectAttemptType(String attemptTypeOption) {
        WebElement attemptOption;
        click(attemptType);
        if (attemptTypeOption.equalsIgnoreCase("Manual Email")) {
            attemptOption = driver.findElement(By.cssSelector("#react-select-7-option-0"));
            attemptOption.click();
        } else if (attemptTypeOption.equalsIgnoreCase("Automatic Email")) {
            attemptOption = driver.findElement(By.cssSelector("#react-select-7-option-1"));
            attemptOption.click();
        } else if (attemptTypeOption.equalsIgnoreCase("Phone Call")) {
            attemptOption = driver.findElement(By.cssSelector("#react-select-7-option-2"));
            attemptOption.click();
        } else if (attemptTypeOption.equalsIgnoreCase("LinkedIn - Send a Connection Request")) {
            attemptOption = driver.findElement(By.cssSelector("#react-select-7-option-3"));
            attemptOption.click();
        } else if (attemptTypeOption.equalsIgnoreCase("LinkedIn - Send Message")) {
            attemptOption = driver.findElement(By.cssSelector("#react-select-7-option-4"));
            attemptOption.click();
        } else if (attemptTypeOption.equalsIgnoreCase("LinkedIn - View Profile")) {
            attemptOption = driver.findElement(By.cssSelector("#react-select-7-option-5"));
            attemptOption.click();
        } else if (attemptTypeOption.equalsIgnoreCase("LinkedIn - Interaction")) {
            attemptOption = driver.findElement(By.cssSelector("#react-select-7-option-6"));
            attemptOption.click();
        } else if (attemptTypeOption.equalsIgnoreCase("Text Message")) {
            attemptOption = driver.findElement(By.cssSelector("#react-select-7-option-7"));
            attemptOption.click();
        } else if (attemptTypeOption.equalsIgnoreCase("Other Task")) {
            attemptOption = driver.findElement(By.cssSelector("#react-select-7-option-8"));
            attemptOption.click();
        }
    }

    public void clickContactViewAddCase() {
        click(contactViewAddCase);
    }

    public void validateContactRecordCasesView() {
        checkElementsEnabled(new WebElement[]{contactBasicInformation, contactInformation, contactSocialMedia, customFieldInfo, contactCasesInfo, contactCasesNotes});
    }

    public void validateContactRecordAttemptsView() {
        checkElementsEnabled(new WebElement[]{contactBasicInformation, contactInformation, contactSocialMedia, customFieldInfo, contactAttempts, contactCasesNotes});
    }

    public void validateContactRecordCadencesView() {
        checkElementsEnabled(new WebElement[]{contactBasicInformation, contactInformation, contactSocialMedia, customFieldInfo, contactsCadence, contactCasesNotes});
    }

    public void validateContactRecordEmailsView() {
        checkElementsEnabled(new WebElement[]{contactBasicInformation, contactInformation, contactSocialMedia, customFieldInfo, contactsEmail, contactCasesNotes});
    }

    public void validateContactRecordTextsView() {
        checkElementsEnabled(new WebElement[]{contactBasicInformation, contactInformation, contactSocialMedia, customFieldInfo, contactsTexts, contactCasesNotes});
    }

    public void validateContactRecordActivityView() {
        checkElementsEnabled(new WebElement[]{contactBasicInformation, contactInformation, contactSocialMedia, customFieldInfo, contactsActivity, contactCasesNotes});
    }

    public void clickContactRecordsAttempts() {
        click(contactViewRecordAttempts);
    }

    public void clickContactRecordsCadences() {
        click(contactViewRecordCadences);
    }

    public void clickContactRecordsEmails() {
        click(contactViewRecordEmails);
    }

    public void clickContactRecordsTexts() {
        click(contactViewRecordTexts);
    }

    public void clickContactRecordsActivity() {
        click(contactViewRecordActivity);
    }

    public void editCaseName(String name) {
        editCaseName.clear();
        sendKeys(editCaseName, name);
    }

    public void clickEditCaseSave() {
        click(editCaseDetailsSave);
    }

    public void clickSendToPitchAndMiss() {
        click(sendToPitchAndMiss);
    }

    public void clickCloseCase() {
        click(closeCase);
    }

    public void inputCloseCaseAmount(String amount) {
        sendKeys(closeCaseAmount, amount);
    }

    public void inputCloseCaseProduct(String product) {
        sendKeys(closeCaseProduct, product);
    }

    public void clickArchivedCase() {
        click(archiveCase);
    }

    public void clickSave() {
        click(save);
    }

    public void clickConfirm() {
        click(confirm);
        pause(3000);
    }

    public void inputProduct(String productNameValue) {
        sendKeys(productName, productNameValue);
        pause(3000);
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

    public void clickAddToScoreCardCalendar() {
        click(addToScoreCardCalendar);
    }

    public void clickAddToScoreCardCalendarConfirm() {
        click(confirm);
        pause(3000);
    }

    public void clickLoadAllData() {
        click(loadAllData);
        pause(3000);
    }

    public void clickTransferCase() {
        click(transferCase);
        transferCaseModal.isDisplayed();
    }

    public void clickCaseDetailsAddCase() {
        pause(2000);
        click(caseDetailsAddCase);
    }

    public void selectSalesPerson(String salesPerson) {
        WebElement salesPersonElement = driver.findElement(By.xpath("//span[text()='"+ salesPerson +"']/parent::div"));
        salesPersonElement.click();
    }

    public void selectCadenceName(String cadence) {
        WebElement cadenceElement = driver.findElement(By.xpath("//span[text()='"+ cadence +"']/parent::div"));
        cadenceElement.click();
    }

    public void clickTransfer() {
        click(transfer);
    }

    public void clickCalendar() {
        click(calendar);
    }

    public void verifyScorecardAddedToDate(String date, String scorecardName) {
        WebElement scorecardSchedule = driver.findElement(By.xpath("//td[@data-date='"+ date +"']//span"));
        System.out.println("GET TEXT!!! " + scorecardSchedule.getText());
        System.out.println("SCORECARD NAME!!! " + scorecardName);
        //Assert.assertTrue(scorecardSchedule.getText().equalsIgnoreCase(scorecardName));
    }

    public void clickAddNotes() {
        click(addNotes);
    }

    public void clickContactViewAddNote() {
        click(contactViewAddNote);
    }

    public void inputNotes(String notes) {
        sendKeys(addNotesTextfield, notes);
        savedNotes = notes;
    }

    public void saveNotes() {
        click(save);
        pause(3000);
    }

    public void clickAdd() {
        click(add);
        pause(3000);
    }

    public void verifySavedCaseNote() {
        pause(3000);
        Assert.assertTrue(viewCaseNoteValue.getText().equalsIgnoreCase(savedNotes));
    }

    public void test() {
        pause(1000);
        System.out.println(test2.getText());
        System.out.println("SIZE: " + test2.getSize());
        String s = test2.getText();
        String[] split = s.split(" rows");
        String firstSubString = split[0];
        System.out.println("TEST: " + firstSubString);
    }
}
