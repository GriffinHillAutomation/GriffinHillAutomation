package com.griffinhill.tests.testcases;

import com.griffinhill.entities.LoginInfo;
import com.griffinhill.tests.TestsInit;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.griffinhill.enums.PageNavigation.SCORE_CARD;
import static com.griffinhill.site.pages.LoginPage.login;
import static testdata.LoginDetails.loginCredentials;

public class ScorecardBetaTest extends TestsInit{

    LoginInfo user = loginCredentials();

    @BeforeMethod
    public void before() {
        //try {
            login(user);
            achievementHubPage.navigateTo(SCORE_CARD);
            waitUntilPageIsLoaded();
            scorecardPage.checkOpenedPage();
        //}
        //catch (Exception e)
        //{
            //driver.close();
            //driver.quit();
            //System.out.println("FAIL");
        //}//
    }
    @Test
    public void TCSC_001() {
        scorecardPage.validateScorecardPiplelineActive();
    }
    @Test
    public void TCSC_002() {
        scorecardPage.clickContacts();
        scorecardPage.validateContactsAll();
    }

    @Test
    public void TCSC_003() {
        scorecardPage.clickCalendar();
        scorecardPage.validateCalendar();
    }

    @Test
    public void TCSC_004() {
        scorecardPage.clickReports();
        scorecardPage.validateReportsOverview();
    }

    @Test
    public void TCSC_005() {
        scorecardPage.validateScorecardPiplelineActive();
    }

    @Test
    public void TCSC_006() {
        scorecardPage.clickPitchAndMiss();
        scorecardPage.validatePiplelinePitchAndMiss();
    }

    @Test
    public void TCSC_007() {
        scorecardPage.clickClosedDeals();
        scorecardPage.validatePiplelineClosedDeals();
    }

    @Test
    public void TCSC_008() {
        scorecardPage.clickPipelineAll();
        scorecardPage.validatePiplelineAll();
    }

    @Test
    public void TCSC_009() {
        scorecardPage.clickArchived();
        scorecardPage.validatePipelineArchived();
    }

    @Test
    public void TCSC_010() {
        scorecardPage.clickContacts();
        scorecardPage.validateContactsAll();
    }

    @Test
    public void TCSC_011() {
        scorecardPage.clickContacts();
        scorecardPage.clickProspects();
        scorecardPage.validateContactsProspects();
    }

    @Test
    public void TCSC_012() {
        scorecardPage.clickContacts();
        scorecardPage.clickSuspects();
        scorecardPage.validateContactsSuspects();
    }

    @Test
    public void TCSC_013() {
        scorecardPage.clickReports();
        scorecardPage.validateReportsOverview();
    }

    @Test
    public void TCSC_014() {
        scorecardPage.clickReports();
        scorecardPage.clickProductivity();
        scorecardPage.validateReportsProductivity();
    }

    @Test
    public void TCSC_015() {
        scorecardPage.clickReports();
        scorecardPage.clickProficiency();
        scorecardPage.validateReportsProficiency();
    }

    @Test
    public void TCSC_016() {
        scorecardPage.clickReports();
        scorecardPage.clickPerformance();
        scorecardPage.validateReportsPerfomance();
    }
 /*   @Test
    @Description("TCSC_001 - Verify Access in Scorecard Pipelines")
    public void Scorecard_TC_001() {
        scorecardBetaPage.quickAdd();
        scorecardBetaPage.fillProspect("TestFirst", "TestLast", "");
        scorecardBetaPage.clickSaveProspect();
    }

    @Test
    @Description("TCSC_002 - Verify Access in Scorecard Contacts")
    public void Scorecard_TC_002() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.fillProspect("TestFirst", "TestLast", "");
        scorecardBetaPage.clickSaveProspect();
    }

    @Test
    public void Scorecard_TC_003() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsView();
    }

    @Test
    public void Scorecard_TC_004() {
        scorecardBetaPage.clickAttempts();
        scorecardBetaPage.validateAttemptForm();
    }

    @Test
    public void Scorecard_TC_005() {
        scorecardBetaPage.clickPipelineDealsClosed();
        scorecardBetaPage.validateDealsClosedView();
    }

    @Test
    public void Scorecard_TC_006() {
        scorecardBetaPage.clickPipelinePitchAndMiss();
        scorecardBetaPage.validatePitchAndMiss();
    }

    @Test
    public void Scorecard_TC_007() {
        scorecardBetaPage.validatePipelineAll();
        scorecardBetaPage.validatePitchAndMiss();
    }

    @Test
    public void Scorecard_TC_008() {
        scorecardBetaPage.clickPipelineArchived();
        scorecardBetaPage.validatePipelineArchived();
    }

    @Test
    public void Scorecard_TC_009() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsProspect();
    }

    @Test
    public void Scorecard_TC_010() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsSuspect();
    }

    @Test
    public void Scorecard_TC_011() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsLead();
    }

    @Test
    public void Scorecard_TC_012() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAll();
    }

    @Test
    public void Scorecard_TC_013() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProductivity();
    }

    @Test
    public void Scorecard_TC_014() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProficiency();
    }

    @Test
    public void Scorecard_TC_015() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsPerformance();
    }*/

    @Test
    public void TCSC_017() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto", "Test");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Automation");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
    }

    @Test
    public void TCSC_018() {
        scorecardBetaPage.clickCaseNameDropdown("Case Automation");
        scorecardBetaPage.clickEditCaseDetails();
        scorecardBetaPage.editCaseName("Case Test Automation");
        scorecardBetaPage.clickEditCaseSave();
        scorecardBetaPage.verifyCaseNewName("Case Test Automation");
    }

    @Test
    public void TCSC_019() {
        scorecardBetaPage.clickCaseNameDropdown("Case Test Automation");
        scorecardBetaPage.clickViewCaseDetails();
        scorecardBetaPage.verifyCaseDetailsName("Case Test Automation");
    }

    @Test
    public void TCSC_020() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto", "Test");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Auto Test");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test");
        scorecardBetaPage.clickViewContactRecord();
        scorecardBetaPage.verifyContactRecordDetails("Auto", "Test");
    }

    @Test
    public void TCSC_021() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto21a", "Test21b");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Auto Test21b");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test21b");
        scorecardBetaPage.clickAddToScoreCardCalendar();
        scorecardBetaPage.clickAddToScoreCardCalendarConfirm();
        scorecardBetaPage.clickCalendar();
        scorecardBetaPage.verifyScorecardAddedToDate("2023-04-18", "Case Auto Test21b");
    }

    @Test
    public void TCSC_022() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto22", "Test22");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Auto Test22");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test22");
        scorecardBetaPage.clickAddNotes();
        scorecardBetaPage.inputNotes("Case Automation Test 22");
        scorecardBetaPage.saveNotes();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test22");
        scorecardBetaPage.clickViewCaseDetails();
        scorecardBetaPage.verifySavedCaseNote();
    }

    @Test
    public void TCSC_023() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto23", "Test23");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Auto Test23");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test23");
        scorecardBetaPage.clickSendToPitchAndMiss();
        scorecardBetaPage.clickConfirm();
        scorecardBetaPage.clickPipelinePitchAndMiss();
        scorecardBetaPage.verifyCaseNewName("Case Auto Test23");
    }

    @Test
    public void TCSC_024() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto24", "Test24");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Auto Test24");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test24");
        scorecardBetaPage.clickCloseCase();
        scorecardBetaPage.inputProduct("Test Automation");
        scorecardBetaPage.clickSave();
        scorecardBetaPage.clickPipelineDealsClosed();
        scorecardBetaPage.verifyClosedDeals("Case Auto Test24");
    }

    @Test
    public void TCSC_025() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto25", "Test25");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Auto Test25");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test25");
        scorecardBetaPage.clickArchivedCase();
        scorecardBetaPage.clickConfirm();
        scorecardBetaPage.clickPipelineArchived();
        scorecardBetaPage.verifyArchivedDeals("Case Auto Test25");
    }

    @Test
    public void TCSC_029() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto29", "Test29");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Auto Test29");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test29");
        scorecardBetaPage.clickCloseCase();
        scorecardBetaPage.inputCloseCaseAmount("150");
        scorecardBetaPage.inputCloseCaseProduct("Test");
        scorecardBetaPage.clickSave();
    }

    @Test
    public void TCSC_030() {
        scorecardBetaPage.clickPipelineDealsClosed();
        scorecardBetaPage.clickLoadAllData();
    }

    @Test
    public void TCSC_036() {
        scorecardBetaPage.validateContactsAdvanced();
    }

    @Test
    public void TCSC_037() {
        scorecardBetaPage.searchContactFirstName("Auto");
        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
    }

    @Test
    public void TCSC_038() {
        scorecardBetaPage.searchContactLastName("Auto");
        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
    }

    @Test
    public void TCSC_039() {
        scorecardBetaPage.searchContactCompanyName("Auto");
        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
    }

    @Test
    public void TCSC_040() {
        scorecardBetaPage.searchContactEmail("Auto");
        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
    }

    @Test
    public void TCSC_041() {
        scorecardBetaPage.selectTags("with any of these tags");
        scorecardBetaPage.selectTagsCategory("Category: ");
        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
    }

    @Test
    public void TCSC_042() {
        scorecardBetaPage.selectTags("with all of these tags");
        scorecardBetaPage.selectTagsCategory("Category: ");
        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
    }

    @Test
    public void TCSC_043() {
        scorecardBetaPage.selectTags("with all of these tags");
        scorecardBetaPage.selectTagsCategory("Category: Student");
        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
    }

    @Test
    public void TCSC_044() {
        scorecardBetaPage.selectTags("doesn't have all of these tags");
        scorecardBetaPage.selectTagsCategory("Category: Student");
        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
    }

    @Test
    public void TCSC_045() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto", "Test");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Automation");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
    }

    @Test
    public void TCSC_046() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickViewContactRecord();
        scorecardBetaPage.clickContactRecordView("test123");
        scorecardBetaPage.validateContactRecordCasesView();
    }

    @Test
    public void TCSC_047() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickViewContactRecord();
        scorecardBetaPage.clickContactRecordView("test123");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsAttempts();
        scorecardBetaPage.validateContactRecordAttemptsView();
    }

    @Test
    public void TCSC_048() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickViewContactRecord();
        scorecardBetaPage.clickContactRecordView("test123");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsCadences();
        scorecardBetaPage.validateContactRecordCadencesView();
    }

    @Test
    public void TCSC_049() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickViewContactRecord();
        scorecardBetaPage.clickContactRecordView("test123");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsEmails();
        scorecardBetaPage.validateContactRecordEmailsView();
    }

    @Test
    public void TCSC_050() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickViewContactRecord();
        scorecardBetaPage.clickContactRecordView("test123");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsTexts();
        scorecardBetaPage.validateContactRecordTextsView();
    }

    @Test
    public void TCSC_051() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickViewContactRecord();
        scorecardBetaPage.clickContactRecordView("test123");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactRecordsActivity();
        scorecardBetaPage.validateContactRecordActivityView();
    }

    @Test
    public void TCSC_052() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickViewContactRecord();
        scorecardBetaPage.clickContactRecordView("test123");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickAddCaseHereLink();
        scorecardBetaPage.inputCaseName("Case Auto Test");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test");
        scorecardBetaPage.clickViewContactRecord();
        scorecardBetaPage.verifyContactRecordDetails("Auto", "Test");
    }

    @Test
    public void TCSC_053() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("test123");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.contactsAdvancedSearch("casenametest");
        scorecardBetaPage.validateSearchResultTableIsNotEmpty();
    }

    @Test
    public void TCSC_054() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("test123");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickLoadAllData();
    }

    @Test
    public void TCSC_055() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAdvanced();
        scorecardBetaPage.clickContactRecordView("test123");
        scorecardBetaPage.validateContactRecordCasesView();
        scorecardBetaPage.clickContactViewAddNote();
        scorecardBetaPage.inputNotes("Test Notes");
        scorecardBetaPage.saveNotes();
    }

//    @Test
//    public void Bug_049() {
//        scorecardBetaPage.test();
//    }
}
