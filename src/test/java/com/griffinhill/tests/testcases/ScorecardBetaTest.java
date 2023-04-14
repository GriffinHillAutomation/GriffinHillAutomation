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
    public void Scorecard_TC_017() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto", "Test");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Automation");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
    }

    @Test
    public void Scorecard_TC_018() {
        scorecardBetaPage.clickCaseNameDropdown("Case Automation");
        scorecardBetaPage.clickEditCaseDetails();
        scorecardBetaPage.editCaseName("Case Test Automation");
        scorecardBetaPage.clickEditCaseSave();
        scorecardBetaPage.verifyCaseNewName("Case Test Automation");
    }

    @Test
    public void Scorecard_TC_019() {
        scorecardBetaPage.clickCaseNameDropdown("Case Test Automation");
        scorecardBetaPage.clickViewCaseDetails();
        scorecardBetaPage.verifyCaseDetailsName("Case Test Automation");
    }

    @Test
    public void Scorecard_TC_020() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Auto", "Test");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case Auto Test");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
        scorecardBetaPage.clickCaseNameDropdown("Case Auto Test");
        scorecardBetaPage.verifyContactRecordDetails("Auto", "Test");
    }
}
