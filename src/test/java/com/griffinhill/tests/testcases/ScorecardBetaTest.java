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

    @Test
    public void Scorecard_TC_001() {
        scorecardBetaPage.quickAdd();
        scorecardBetaPage.fillProspect("TestFirst", "TestLast", "TestCompanyName");
        scorecardBetaPage.clickSaveProspect();
    }

    @Test
    public void Scorecard_TC_002() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.fillProspect("TestFirst", "TestLast", "TestCompanyName");
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
    public void Scorecard_TC_017() {
        scorecardBetaPage.clickAddContact();
        scorecardBetaPage.fillContact("Test", "20230407");
        scorecardBetaPage.clickAddNewCase();
        scorecardBetaPage.inputCaseName("Case 20230407");
        scorecardBetaPage.clickAddNewContactSave();
        scorecardBetaPage.verifyAddNewContactSuccess();
        scorecardBetaPage.confirmAddContact();
    }
}