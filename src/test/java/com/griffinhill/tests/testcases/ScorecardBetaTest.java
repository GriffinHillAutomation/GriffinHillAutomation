package com.griffinhill.tests.testcases;

import com.griffinhill.entities.LoginInfo;
import com.griffinhill.tests.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.griffinhill.enums.PageNavigation.SCORE_CARD;
import static com.griffinhill.site.pages.LoginPage.login;
import static testdata.LoginDetails.loginCredentials;

public class ScorecardBetaTest extends TestsInit{

    LoginInfo user = loginCredentials();

    @BeforeMethod
    public void before() {
        try {
            login(user);
            achievementHubPage.navigateTo(SCORE_CARD);
            waitUntilPageIsLoaded();
            scorecardBetaPage.checkOpenedPage();
        }
        catch (Exception e)
        {
            //driver.close();
            //driver.quit();
            System.out.println("FAIL");
        }
    }

//    @Test
//    public void Scorecard_TC_001() {
//        scorecardPage.quickAdd();
//        scorecardPage.fillProspect("TestFirst", "TestLast", "TestCompanyName");
//        scorecardPage.clickSaveProspect();
//    }

//    @Test
//    public void Scorecard_TC_002() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.fillProspect("TestFirst", "TestLast", "TestCompanyName");
//        scorecardBetaPage.clickSaveProspect();
//    }
//
//    @Test
//    public void Scorecard_TC_003() {
//        scorecardBetaPage.clickReports();
//        scorecardBetaPage.validateReportsView();
//    }
//
//    @Test
//    public void Scorecard_TC_004() {
//        scorecardBetaPage.clickAttempts();
//        scorecardBetaPage.validateAttemptForm();
//    }
//
//    @Test
//    public void Scorecard_TC_005() {
//        scorecardBetaPage.clickPipelineDealsClosed();
//        scorecardBetaPage.validateDealsClosedView();
//    }
//
//    @Test
//    public void Scorecard_TC_006() {
//        scorecardBetaPage.clickPipelinePitchAndMiss();
//        scorecardBetaPage.validatePitchAndMiss();
//    }
//
//    @Test
//    public void Scorecard_TC_007() {
//        scorecardBetaPage.validatePipelineAll();
//        scorecardBetaPage.validatePitchAndMiss();
//    }
//
//    @Test
//    public void Scorecard_TC_008() {
//        scorecardBetaPage.clickPipelineArchived();
//        scorecardBetaPage.validatePipelineArchived();
//    }
//
//    @Test
//    public void Scorecard_TC_009() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsProspect();
//    }
//
//    @Test
//    public void Scorecard_TC_010() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsSuspect();
//    }
//
//    @Test
//    public void Scorecard_TC_011() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsLead();
//    }
//
//    @Test
//    public void Scorecard_TC_012() {
//        scorecardBetaPage.clickContacts();
//        scorecardBetaPage.validateContactsAll();
//    }
//
//    @Test
//    public void Scorecard_TC_013() {
//        scorecardBetaPage.clickReports();
//        scorecardBetaPage.validateReportsProductivity();
//    }
//
//    @Test
//    public void Scorecard_TC_014() {
//        scorecardBetaPage.clickReports();
//        scorecardBetaPage.validateReportsProficiency();
//    }
//
//    @Test
//    public void Scorecard_TC_015() {
//        scorecardBetaPage.clickReports();
//        scorecardBetaPage.validateReportsPerformance();
//    }

    @Test
    public void Scorecard_TC_017() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto17", "Test17");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Automation17");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
    }

    @Test
    public void Scorecard_TC_018() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto18", "Test18");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Automation18");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Automation18");
        scorecardBetaPage.clickEditCaseDetails();
        scorecardBetaPage.editCaseName("Case Test Automation18");
        scorecardBetaPage.clickEditCaseSave();
        scorecardBetaPage.verifyCaseNewName("Case Test Automation18");
    }

    @Test
    public void Scorecard_TC_019() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto19", "Test19");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Automation19");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Automation19");
        scorecardBetaPage.clickViewCaseDetails();
        scorecardBetaPage.verifyCaseDetailsName("Case Test Automation");
    }

    @Test
    public void Scorecard_TC_020() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto20", "Test20");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Auto Test20");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test20");
        scorecardBetaPage.clickViewContactRecord();
        scorecardBetaPage.verifyContactRecordDetails("Auto20", "Test20");
    }

    @Test
    public void Scorecard_TC_021() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto21", "Test21");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Auto Test21");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test21");
        scorecardBetaPage.clickAddToScoreCardCalendar();
        scorecardBetaPage.clickAddToScoreCardCalendarConfirm();
        scorecardBetaPage.clickCalendar();
        scorecardBetaPage.verifyScorecardAddedToDate("2023-04-14", "Case Auto Test21");
    }

    @Test
    public void Scorecard_TC_022() {
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
}
