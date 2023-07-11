package com.griffinhill.tests.testcases.Legacy;

import com.griffinhill.entities.LoginInfo;
import com.griffinhill.tests.TestsInit;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.griffinhill.enums.PageNavigation.SCORE_CARD;
import static com.griffinhill.site.pages.LoginPage.login;
import static testdata.LoginDetails.loginCredentials;

public class ScorecardLegacyTest extends TestsInit{

    LoginInfo user = loginCredentials();

    @BeforeMethod
    public void before() {
        //try {
            driver.get("https://beta-legacy.griffinhill.com/login/");
        login(user);
            achievementHubPage.navigateTo(SCORE_CARD);
            waitUntilPageIsLoaded();
            scorecardBetaPage.checkOpenedPage();
        //}
        //catch (Exception e)
        //{
            //driver.close();
            //driver.quit();
            //System.out.println("FAIL");
        //}//
    }
    @Test
    @Description("TCSC_001 - Verify Access in Scorecard Pipelines")
    public void Scorecard_TC_001() {
        scorecardBetaPage.quickAdd();
        scorecardBetaPage.fillProspect("TestFirst", "TestLast", "");
        scorecardBetaPage.clickSaveProspect();
    }

    @Test
    @Description("TCSC_002 - Verify Access in Scorecard Contacts")
    public void Scorecard_TC_002() {
        scorecardBetaPage.clickContactsAddSuspect();
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
    }

    @Test
    public void Scorecard_TC_016() {
        scorecardBetaPage.clickAttempts();
        scorecardBetaPage.clickAttemptsAddContact();
        scorecardBetaPage.attemptFillContact("Auto", "Test");
        scorecardBetaPage.clickAttemptContactSave();
    }

    @Test
    public void Scorecard_TC_017() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsSuspect();
        scorecardBetaPage.clickAddSuspect();
        scorecardBetaPage.fillProspect("TestFirst", "TestLast", "");
        scorecardBetaPage.clickSaveProspect();
    }

    @Test
    public void Scorecard_TC_018() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsLead();
        scorecardBetaPage.clickAddSuspect();
        scorecardBetaPage.fillProspect("TestFirst", "TestLast", "");
        scorecardBetaPage.clickSaveProspect();
    }

    @Test
    public void Scorecard_TC_019() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsLead();
        scorecardBetaPage.clickAddLead();
        scorecardBetaPage.fillLead("TestFirst", "TestLast");
        scorecardBetaPage.clickAddLeadSave();
    }

    @Test
    public void Scorecard_TC_020() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAll();
        scorecardBetaPage.clickAddSuspect();
        scorecardBetaPage.fillProspect("TestFirst", "TestLast", "");
        scorecardBetaPage.clickSaveProspect();
    }

    @Test
    public void Scorecard_TC_021() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProductivity();
        scorecardBetaPage.validateProductivityAttemptsAndPoints();
    }

    @Test
    public void Scorecard_TC_022() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProductivity();
        scorecardBetaPage.validateProductivityDemo();
    }

    @Test
    public void Scorecard_TC_023() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProductivity();
        scorecardBetaPage.validateReportsPointsByEvent();
    }

    @Test
    public void Scorecard_TC_024() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProductivity();
        scorecardBetaPage.validateReportsActiveCasesCount();
    }

    @Test
    public void Scorecard_TC_025() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProductivity();
        scorecardBetaPage.validateReportsActiveCasesPercent();
    }

    @Test
    public void Scorecard_TC_026() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProductivity();
        scorecardBetaPage.validateReportsPointTrends();
    }

    @Test
    public void Scorecard_TC_027() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProductivity();
        scorecardBetaPage.validateReportsPointTrendsDOW();
    }

    @Test
    public void Scorecard_TC_028() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProficiency();
        scorecardBetaPage.validateReportsProficiencyRatioNA();
    }

    @Test
    public void Scorecard_TC_029() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProficiency();
        scorecardBetaPage.validateReportsProficiencyRatioSP();
    }

    @Test
    public void Scorecard_TC_030() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProficiency();
        scorecardBetaPage.validateReportsProficiencyRatioAS();
    }

    @Test
    public void Scorecard_TC_031() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProficiency();
        scorecardBetaPage.validateReportsProficiencyPipelineAdvancementCounts();
    }

    @Test
    public void Scorecard_TC_032() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsProficiency();
        scorecardBetaPage.validateReportsProficiencyPipelineAdvancementPercent();
    }

    @Test
    public void Scorecard_TC_033() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsPerformance();
        scorecardBetaPage.validateReportsPerformanceGoalAnalysis();
    }

    @Test
    public void Scorecard_TC_034() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsPerformance();
        scorecardBetaPage.validateReportsPerformanceClosedRevenue();
    }

    @Test
    public void Scorecard_TC_035() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsPerformance();
        scorecardBetaPage.validateReportsPerformanceClosed();
    }

}
