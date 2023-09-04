package com.griffinhill.tests.testcases.v2;

import com.griffinhill.entities.LoginInfo;
import com.griffinhill.tests.TestsInit;
import com.griffinhill.utils.DateUtils;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import reports.AllureListener;

import static com.griffinhill.enums.PageNavigation.SCORE_CARD;
import static com.griffinhill.site.pages.LoginPage.login;
import static testdata.LoginDetails.loginCredentials;
import static testdata.LoginDetails.stagingLoginCredentials;

@Listeners({AllureListener.class})
public class ScorecardV2StagingTest extends TestsInit{

    LoginInfo user = stagingLoginCredentials();

    @BeforeMethod(alwaysRun = true)
    public void before() throws Exception {
        try {
            driver.get("https://phplaravel-144553-1687977.cloudwaysapps.com/");
            login(user);
            achievementHubPage.navigateTo(SCORE_CARD);
            waitUntilPageIsLoaded();
        }
        catch (Exception e)
        {
            driver.navigate().refresh();
            achievementHubPage.navigateTo(SCORE_CARD);
            waitUntilPageIsLoaded();
        }
    }
//    @Test
//    @Description("TCSC_001 - Verify Access in Scorecard Pipelines")
//    public void TCSC_001() {
//        scorecardPage.validateScorecardPiplelineActive();
//    }
//
//    @Test
//    @Description("TCSC_002 - Verify Access in Scorecard Contacts")
//    public void TCSC_002() {
//        scorecardPage.clickContacts();
//        scorecardPage.validateContactsAll();
//    }
//
//    @Test
//    @Description("TCSC_003 - Verify Access in Scorecard Calendar")
//    public void TCSC_003() {
//        scorecardPage.clickCalendar();
//        scorecardPage.validateCalendar();
//    }
//
//    @Test
//    @Description("TCSC_004 - Verify Access in Scorecard Reports")
//    public void TCSC_004() {
//        scorecardPage.clickReports();
//        scorecardPage.validateReportsOverview();
//    }
//
//    @Test
//    @Description("TCSC_005 - Verify Access View in Scorecard Pipelines Active Cases")
//    public void TCSC_005() {
//        scorecardPage.validateScorecardPiplelineActive();
//    }
//
//    @Test
//    @Description("TCSC_006 - Verify Access View in Scorecard Pipelines Pitch and Miss")
//    public void TCSC_006() {
//        scorecardPage.
//                clickPitchAndMiss();
//        scorecardPage.validatePiplelinePitchAndMiss();
//    }
//
//    @Test
//    @Description("TCSC_007 - Verify Access View in Scorecard Pipelines Closed Deals")
//    public void TCSC_007() {
//        scorecardPage.clickClosedDeals();
//        scorecardPage.validatePiplelineClosedDeals();
//    }
//
//    @Test
//    @Description("TCSC_008 - Verify Access View in Scorecard Pipelines All Cases")
//    public void TCSC_008() {
//        scorecardPage.clickPipelineAll();
//        scorecardPage.validatePiplelineAll();
//    }
//
//    @Test
//    @Description("TCSC_009 - Verify Access View in Scorecard Pipelines Archived")
//    public void TCSC_009() {
//        scorecardPage.clickArchived();
//        scorecardPage.validatePipelineArchived();
//    }
//
//    @Test
//    @Description("TCSC_010 - Verify Access View in Scorecard All Contacts")
//    public void TCSC_010() {
//        scorecardPage.clickContacts();
//        scorecardPage.validateContactsAll();
//    }
//
//    @Test
//    @Description("TCSC_011 - Verify Access View in Scorecard Prospects")
//    public void TCSC_011() {
//        scorecardPage.clickContacts();
//        scorecardPage.clickProspects();
//        scorecardPage.validateContactsProspects();
//    }
//
//    @Test
//    @Description("TCSC_012 - Verify Access View in Scorecard All Suspects")
//    public void TCSC_012() {
//        scorecardPage.clickContacts();
//        scorecardPage.clickSuspects();
//        scorecardPage.validateContactsSuspects();
//    }
//
//    @Test
//    @Description("TCSC_013 - Verify Access in Scorecard Reports Overview")
//    public void TCSC_013() {
//        scorecardPage.clickReports();
//        scorecardPage.validateReportsOverview();
//    }

//    @Test
//    @Description("TCSC_014 - Verify Access in Scorecard Reports Productivity")
//    public void TCSC_014() {
//        scorecardPage.clickReports();
//        scorecardPage.clickProductivity();
//        scorecardPage.validateReportsProductivity();
//    }
//
//    @Test
//    @Description("TCSC_015 -   Verify Access in Scorecard Reports Proficiency")
//    public void TCSC_015() {
//        scorecardPage.clickReports();
//        scorecardPage.clickProficiency();
//        scorecardPage.validateReportsProficiency();
//    }
//
//    @Test
//    @Description("TCSC_016 - Verify Access in Scorecard Reports Performance")
//    public void TCSC_016() {
//        scorecardPage.clickReports();
//        scorecardPage.clickPerformance();
//        scorecardPage.validateReportsPerfomance();
//    }
//
//    @Test
//    @Description("TCSC_017 - Create new Case in Active pipelines")
//    public void TCSC_017() {
//        scorecardBetaPage.clickAddContact();
//        scorecardBetaPage.fillContact("Auto", "Test");
//        scorecardBetaPage.clickAddNewCase();
//        scorecardBetaPage.inputCaseName("Case Automation");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//    }
//
//    @Test
//    @Description("TCSC_018 - Edit case name in Active pipelines")
//    public void TCSC_018() {
//        scorecardBetaPage.clickCaseNameDropdown("Case Automation");
//        scorecardBetaPage.clickEditCaseDetails();
//        scorecardBetaPage.editCaseName("Case Test Automation");
//        scorecardBetaPage.clickEditCaseSave();
//        scorecardBetaPage.verifyCaseNewName("Case Test Automation");
//    }
//
//    @Test
//    @Description("TCSC_019 - View Case Details in Active pipelines")
//    public void TCSC_019() {
//        scorecardBetaPage.clickCaseNameDropdown("Case Test Automation");
//        scorecardBetaPage.clickViewCaseDetails();
//        scorecardBetaPage.verifyCaseDetailsName("Case Test Automation");
//    }
//
//    @Test
//    @Description("TCSC_020 - View Contact Record in Active pipelines")
//    public void TCSC_020() {
//        scorecardBetaPage.clickAddContact();
//        scorecardBetaPage.fillContact("Auto", "Test");
//        scorecardBetaPage.clickAddNewCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test");
//        scorecardBetaPage.clickViewContactRecord();
//        scorecardBetaPage.verifyContactRecordDetails("Auto", "Test");
//    }
//
//    @Test
//    @Description("TCSC_021 - Add Case Contact to Score Card Calendar in Active pipelines")
//    public void TCSC_021() {
//        scorecardBetaPage.clickAddContact();
//        scorecardBetaPage.fillContact("Auto21E", "Test21F");
//        scorecardBetaPage.clickAddNewCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test21D");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test21D");
//        scorecardBetaPage.clickAddToScoreCardCalendar();
//        scorecardBetaPage.clickAddToScoreCardCalendarConfirm();
//        scorecardBetaPage.clickCalendar();
//        scorecardBetaPage.verifyScorecardAddedToDate(DateUtils.getCurrentDateAndTime("yyyy-MM-dd"), "Case Auto Test21D");
//    }
//
//    @Test
//    @Description("TCSC_022 - Add notes in Active pipelines")
//    public void TCSC_022() {
//        scorecardBetaPage.clickAddContact();
//        scorecardBetaPage.fillContact("Auto22", "Test22");
//        scorecardBetaPage.clickAddNewCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test22");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test22");
//        scorecardBetaPage.clickAddNotes();
//        scorecardBetaPage.inputNotes("Case Automation Test 22");
//        scorecardBetaPage.saveNotes();
//        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test22");
//        scorecardBetaPage.clickViewCaseDetails();
//        scorecardBetaPage.verifySavedCaseNote();
//    }
//
//    @Test
//    @Description("TCSC_023 - Send to Pitch and Miss in Active pipelines")
//    public void TCSC_023() {
//        scorecardBetaPage.clickAddContact();
//        scorecardBetaPage.fillContact("Auto23", "Test23");
//        scorecardBetaPage.clickAddNewCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test23");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test23");
//        scorecardBetaPage.clickSendToPitchAndMiss();
//        scorecardBetaPage.clickConfirm();
//        scorecardBetaPage.clickPipelinePitchAndMiss();
//        scorecardBetaPage.verifyCaseNewName("Case Auto Test23");
//    }
//
//    @Test
//    @Description("TCSC_024 - Close Case in Active pipelines")
//    public void TCSC_024() {
//        scorecardBetaPage.clickAddContact();
//        scorecardBetaPage.fillContact("Auto24", "Test24");
//        scorecardBetaPage.clickAddNewCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test24");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test24");
//        scorecardBetaPage.clickCloseCase();
//        scorecardBetaPage.inputProduct("Test Automation");
//        scorecardBetaPage.clickSave();
//        scorecardBetaPage.clickPipelineDealsClosed();
//        scorecardBetaPage.verifyClosedDeals("Case Auto Test24");
//    }
//
//    @Test
//    @Description("TCSC_025 - Archive Case in Active pipelines")
//    public void TCSC_025() {
//        scorecardBetaPage.clickAddContact();
//        scorecardBetaPage.fillContact("Auto25", "Test25");
//        scorecardBetaPage.clickAddNewCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test25");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test25");
//        scorecardBetaPage.clickArchivedCase();
//        scorecardBetaPage.clickConfirm();
//        scorecardBetaPage.clickPipelineArchived();
//        scorecardBetaPage.verifyArchivedDeals("Case Auto Test25");
//    }
//
//    @Test
//    @Description("TCSC_029- Close Existing case in Pitch and Miss")
//    public void TCSC_029() {
//        scorecardBetaPage.clickAddContact();
//        scorecardBetaPage.fillContact("Auto29", "Test29");
//        scorecardBetaPage.clickAddNewCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test29");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test29");
//        scorecardBetaPage.clickCloseCase();
//        scorecardBetaPage.inputCloseCaseAmount("150");
//        scorecardBetaPage.inputCloseCaseProduct("Test");
//        scorecardBetaPage.clickSave();
//    }
//
//    @Test
//    @Description("TCSC_030 - Load All data in Pipeline Closed deals")
//    public void TCSC_030() {
//        scorecardBetaPage.clickPipelineDealsClosed();
//        scorecardBetaPage.clickLoadAllData();
//    }
//
//    @Test
//    @Description("TCSC_036 - Validate Scorecards - Contacts All - Advanced Feature")
//    public void TCSC_036() {
//        scorecardBetaPage.validateContactsAdvanced();
//    }

//    @Test
//    @Description("TCSC_037 - Validate Scorecards - Contacts All - Search First Name Feature")
//    public void TCSC_037() {
//        scorecardBetaPage.searchContactFirstName("Auto");
//        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
//    }
//
//    @Test
//    @Description("TCSC_038 - Validate Scorecards - Contacts All - Search Last Name Feature")
//    public void TCSC_038() {
//        scorecardBetaPage.searchContactLastName("Test");
//        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
//    }
//
//    @Test
//    @Description("TCSC_039 - Validate Scorecards - Contacts All - Search Company Name Feature")
//    public void TCSC_039() {
//        scorecardBetaPage.searchContactCompanyName("Auto");
//        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
//    }
//
//    @Test
//    @Description("TCSC_040 - Validate Scorecards - Contacts All - Search Email Address Feature")
//    public void TCSC_040() {
//        scorecardBetaPage.searchContactEmail("Auto");
//        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
//    }

//    @Test
//    @Description("TCSC_041 - Validate Scorecards - Contacts All - Search Tags - with any of these tags")
//    public void TCSC_041() {
//        scorecardBetaPage.selectTags("with any of these tags");
//        scorecardBetaPage.selectTagsCategory("Category: ");
//        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
//    }
//
//    @Test
//    @Description("TCSC_042 - Validate Scorecards - Contacts All - Search Tags - with all of these tags")
//    public void TCSC_042() {
//        scorecardBetaPage.selectTags("with all of these tags");
//        scorecardBetaPage.selectTagsCategory("Category: ");
//        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
//    }
//
//    @Test
//    @Description("TCSC_043 - Validate Scorecards - Contacts All - Search Tags - doesn't have any of these tags")
//    public void TCSC_043() {
//        scorecardBetaPage.selectTags("with all of these tags");
//        scorecardBetaPage.selectTagsCategory("Category: Student");
//        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
//    }
//
//    @Test
//    @Description("TCSC_044 - Validate Scorecards - Contacts All - Search Tags - doesn't have all of these tags")
//    public void TCSC_044() {
//        scorecardBetaPage.selectTags("doesn't have all of these tags");
//        scorecardBetaPage.selectTagsCategory("Category: Student");
//        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
//    }
//
//    @Test
//    @Description("TCSC_045 - Validate Scorecard - Contacts All - Add Contact")
//    public void TCSC_045() {
//        scorecardBetaPage.clickAddContact();
//        scorecardBetaPage.fillContact("Auto", "Test");
//        scorecardBetaPage.clickAddNewCase();
//        scorecardBetaPage.inputCaseName("Case Automation");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//    }
//
//    @Test
//    @Description("TCSC_046 - Validate Scorecards - Contacts All - View Contact - Cases")
//    public void TCSC_046() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//    }
//
//    @Test
//    @Description("TCSC_047 - Validate Scorecards - Contacts All - View Contact - Attempts")
//    public void TCSC_047() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsAttempts();
//        scorecardBetaPage.validateContactRecordAttemptsView();
//    }
//
//    @Test
//    @Description("TCSC_048 - Validate Scorecards - Contacts All - View Contact - Cadences")
//    public void TCSC_048() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsCadences();
//        scorecardBetaPage.validateContactRecordCadencesView();
//    }
//
//    @Test
//    @Description("TCSC_049 - Validate Scorecards - Contacts All - View Contact - Emails")
//    public void TCSC_049() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsEmails();
//        scorecardBetaPage.validateContactRecordEmailsView();
//    }
//
//    @Test
//    @Description("TCSC_050 - Validate Scorecards - Contacts All - View Contact - Texts")
//    public void TCSC_050() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsTexts();
//        scorecardBetaPage.validateContactRecordTextsView();
//    }
//
//    @Test
//    @Description("TCSC_051 - Validate Scorecards - Contacts All - View Contact - Activity")
//    public void TCSC_051() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsActivity();
//        scorecardBetaPage.validateContactRecordActivityView();
//    }
//
//    @Test
//    @Description("TCSC_052 - Validate Scorecards - View Contact - Cases - Add Case")
//    public void TCSC_052() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactViewAddCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test2");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//    }
//
//    @Test
//    @Description("TCSC_053 - Validate Scorecards - View Contact - Cases - Search cases")
//    public void TCSC_053() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.contactsAdvancedSearch("casenametest");
//        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
//    }
//
//    @Test
//    @Description("TCSC_054 - Validate Scorecards - View Contact - Cases - Load All Data")
//    public void TCSC_054() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickLoadAllData();
//    }
//
//    @Test
//    @Description("TCSC_055 - Validate Scorecards - View Contact - Cases - Add Notes")
//    public void TCSC_055() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactViewAddNote();
//        scorecardBetaPage.inputNotes("Test Notes");
//        scorecardBetaPage.clickAdd();
//    }
//
//    @Test
//    @Description("TCSC_056 - Validate Scorecards - View Contact - Cases - View Case")
//    public void TCSC_056() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactCaseNameDropdown("casenametest");
//        scorecardBetaPage.selectCaseOption("View Case Details");
//        scorecardBetaPage.validateCaseDetailView();
//    }
//
//    @Test
//    @Description("TCSC_057 - Validate Scorecards Cases - View Case - Edit Details")
//    public void TCSC_057() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("Auto29");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactCaseNameDropdown("Case Test Automation");
//        scorecardBetaPage.selectCaseOption("Edit Case Details");
//        scorecardBetaPage.editCaseName("Case Auto Test 29");
//        scorecardBetaPage.clickEditCaseSave();
//        scorecardBetaPage.verifyCaseNewName("Case Auto Test 29");
//    }
//
//    @Test
//    @Description("TCSC_058 - Validate Scorecards Cases - View Case - Transfer Case")
//    public void TCSC_058() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactViewAddCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test5");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//        scorecardBetaPage.contactsAdvancedSearch("Case Auto Test5");
//        scorecardBetaPage.clickContactCaseNameDropdown("Case Auto Test5");
//        scorecardBetaPage.selectCaseOption("View Case Details");
//        scorecardBetaPage.clickTransferCase();
//        scorecardBetaPage.selectSalesPerson("Auto Auto");
//        scorecardBetaPage.clickTransfer();
//    }
//
//    @Test
//    @Description("TCSC_059 - Validate Scorecards Cases - View Case - Add new Case")
//    public void TCSC_059() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("test123");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactCaseNameDropdown("casenametest");
//        scorecardBetaPage.selectCaseOption("View Case Details");
//        scorecardBetaPage.clickCaseDetailsAddCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//    }
//
//    @Test
//    @Description("TCSC_060 - Validate Scorecards Cases - View Case - Transfer Case")
//    public void TCSC_060() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("Auto29");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactViewAddCase();
//        scorecardBetaPage.inputCaseName("Case Auto Test4");
//        scorecardBetaPage.clickAddNewContactSave();
//        scorecardBetaPage.verifyAddNewContactSuccess();
//        scorecardBetaPage.confirmAddContact();
//        scorecardBetaPage.contactsAdvancedSearch("Case Auto Test4");
//        scorecardBetaPage.clickContactCaseNameDropdown("Case Auto Test4");
//        scorecardBetaPage.selectCaseOption("View Case Details");
//        scorecardBetaPage.clickTransferCase();
//        scorecardBetaPage.selectSalesPerson("Auto21a Test21b");
//        scorecardBetaPage.clickTransfer();
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.contactsAdvancedSearch("Auto21a");
//        scorecardBetaPage.clickContactRecordView("Auto21a");
//        scorecardBetaPage.validateContactCaseExists("Case Auto Test4");
//    }
//
//    @Test
//    @Description("TCSC_061 - Validate Scorecards - View Contact - Attempts - Add Attempts")
//    public void TCSC_061() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("Auto29");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsAttempts();
//        scorecardBetaPage.clickAddAttempt();
//        scorecardBetaPage.inputAttemptDate("12/20/2023");
//        scorecardBetaPage.clickAdd();
//    }
//
//    @Test
//    @Description("TCSC_062 - Validate Scorecards - View Contact - Attempts - Search Attempts")
//    public void TCSC_062() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("Auto29");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsAttempts();
//        scorecardBetaPage.contactsAdvancedSearch("Automatic Email");
//        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
//    }
//
//    @Test
//    @Description("TCSC_063 - Validate Scorecards - View Contact - Attempts - View Attempts")
//    public void TCSC_063() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("Auto29");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsAttempts();
//        scorecardBetaPage.contactsAdvancedSearch("Manual Email");
//        scorecardBetaPage.clickContactRecordView("Manual Email");
//    }
//
//    @Test
//    @Description("TCSC_064 - Validate Scorecards - View Contact - Attempts - Delete Attempt")
//    public void TCSC_064() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("Auto29");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsAttempts();
//        scorecardBetaPage.contactsAdvancedSearch("Automatic Email");
//        scorecardBetaPage.deleteAttempt();
//        scorecardBetaPage.clickConfirm();
//    }
//
//    @Test
//    @Description("TCSC_065 - Validate Scorecards - View Contact - Attempts - Add Notes")
//    public void TCSC_065() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("Auto29");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsAttempts();
//        scorecardBetaPage.contactsAdvancedSearch("Manual Email");
//        scorecardBetaPage.clickContactRecordView("Manual Email");
//        scorecardBetaPage.clickContactViewAddNote();
//        scorecardBetaPage.inputNotes("Case Automation Test 29");
//        scorecardBetaPage.clickAdd();
//    }
//
//    @Test
//    @Description("TCSC_066 - Validate Scorecards - View Contact - Cadences - Add Cadence")
//    public void TCSC_066() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("Auto29");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsCadences();
//        scorecardBetaPage.clickAddCaseHereLink();
//        scorecardBetaPage.selectCadenceName("Automation_Test_2");
//        scorecardBetaPage.clickAdd();
//    }
//
//    @Test
//    @Description("TCSC_067 - Validate Scorecards - View Contact - Cadences - View Cadence")
//    public void TCSC_067() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("Auto29");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsCadences();
//        scorecardBetaPage.clickContactRecordView("Automation_Test_2");
//        scorecardBetaPage.validateContactRecordCadencesView();
//    }
//
//    @Test
//    @Description("TCSC_068 - Validate Scorecards - View Contact - Cadences - Pause Cadence")
//    public void TCSC_068() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAdvanced();
//        scorecardBetaPage.clickContactRecordView("Auto29");
//        scorecardBetaPage.validateContactRecordCasesView();
//        scorecardBetaPage.clickContactRecordsCadences();
//        scorecardBetaPage.clickContactCaseNameDropdown("Automation_Test_2");
//        scorecardBetaPage.clickPauseCadence();
//        scorecardBetaPage.clickConfirm();
//    }

    @Test
    @Description("TCSC_069 - Validate Scorecards - View Contact - Cadences - Activate Cadence")
    public void TCSC_069() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsCadences();
        scorecardBetaPage.clickContactCaseNameDropdown("Automation_Test_2");
        scorecardBetaPage.clickActivateCadence();
        scorecardBetaPage.clickConfirm();
    }

    @Test
    @Description("TCSC_070 - Validate Scorecards - View Contact - Cadences - Remove Cadence")
    public void TCSC_070() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsCadences();
        scorecardBetaPage.clickContactCaseNameDropdown("Automation_Test_2");
        scorecardBetaPage.clickRemoveCadence();
        scorecardBetaPage.clickConfirm();
    }

    @Test
    @Description("TCSC_071 - Validate Scorecards - View Contact - Activity")
    public void TCSC_071() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsActivity();
        scorecardBetaPage.validateContactRecordActivityView();
    }

    @Test
    @Description("TCSC_072 - Validate Scorecards - View Contact - Attempts - Add Attempts - Automatic Email")
    public void TCSC_072() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsAttempts();
        scorecardBetaPage.clickAddAttempt();
        scorecardBetaPage.selectAttemptType("Automatic Email");
        scorecardBetaPage.inputAttemptDate("12/20/2023");
        scorecardBetaPage.clickAdd();
    }

    @Test
    @Description("TCSC_073 - Validate Scorecards - View Contact - Attempts - Add Attempts - Phone Call")
    public void TCSC_073() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsAttempts();
        scorecardBetaPage.clickAddAttempt();
        scorecardBetaPage.selectAttemptType("Phone Call");
        scorecardBetaPage.inputAttemptDate("12/20/2023");
        scorecardBetaPage.clickAdd();
    }

    @Test
    @Description("TCSC_074 - Validate Scorecards - View Contact - Attempts - Add Attempts - LinkedIn - Send a Connection Request")
    public void TCSC_074() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsAttempts();
        scorecardBetaPage.clickAddAttempt();
        scorecardBetaPage.selectAttemptType("LinkedIn - Send a Connection Request");
        scorecardBetaPage.inputAttemptDate("12/20/2023");
        scorecardBetaPage.clickAdd();
    }

    @Test
    @Description("TCSC_075 - Validate Scorecards - View Contact - Attempts - Add Attempts - LinkedIn - Send Message")
    public void TCSC_075() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsAttempts();
        scorecardBetaPage.clickAddAttempt();
        scorecardBetaPage.selectAttemptType("LinkedIn - Send Message");
        scorecardBetaPage.inputAttemptDate("12/20/2023");
        scorecardBetaPage.clickAdd();
    }

    @Test
    @Description("TCSC_076 - Validate Scorecards - View Contact - Attempts - Add Attempts - LinkedIn - View Profile")
    public void TCSC_076() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsAttempts();
        scorecardBetaPage.clickAddAttempt();
        scorecardBetaPage.selectAttemptType("LinkedIn - View Profile");
        scorecardBetaPage.inputAttemptDate("12/20/2023");
        scorecardBetaPage.clickAdd();
    }

    @Test
    @Description("TCSC_077 - Validate Scorecards - View Contact - Attempts - Add Attempts - LinkedIn - Interaction")
    public void TCSC_077() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsAttempts();
        scorecardBetaPage.clickAddAttempt();
        scorecardBetaPage.selectAttemptType("LinkedIn - Interaction");
        scorecardBetaPage.inputAttemptDate("12/20/2023");
        scorecardBetaPage.clickAdd();
    }

    @Test
    @Description("TCSC_078 - Validate Scorecards - View Contact - Attempts - Add Attempts - Text Message")
    public void TCSC_078() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsAttempts();
        scorecardBetaPage.clickAddAttempt();
        scorecardBetaPage.selectAttemptType("Text Message");
        scorecardBetaPage.inputAttemptDate("12/20/2023");
        scorecardBetaPage.clickAdd();
    }

    @Test
    @Description("TCSC_079 - Validate Scorecards - View Contact - Attempts - Add Attempts - Other Task")
    public void TCSC_079() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("Auto29");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsAttempts();
        scorecardBetaPage.clickAddAttempt();
        scorecardBetaPage.selectAttemptType("Other Task");
        scorecardBetaPage.inputAttemptDate("12/20/2023");
        scorecardBetaPage.clickAdd();
    }


//    @Test
//    public void Bug_049() {
//        scorecardBetaPage.test();
//    }
}
