package com.griffinhill.tests.testcases;

import com.griffinhill.entities.LoginInfo;
import com.griffinhill.tests.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.griffinhill.enums.PageNavigation.*;
import static com.griffinhill.site.pages.LoginPage.login;
import static testdata.LoginDetails.loginCredentials;

public class ScorecardLegacyTest extends TestsInit{

    LoginInfo user = loginCredentials();

    @BeforeMethod
    public void before() {
        try {
            login(user);
            achievementHubPage.navigateTo(SCORE_CARD);
            waitUntilPageIsLoaded();
            scorecardPage.checkOpenedPage();
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
        scorecardPage.quickAdd();
        scorecardPage.fillProspect("TestFirst", "TestLast", "TestCompanyName");
        scorecardPage.clickSaveProspect();
    }

    @Test
    public void Scorecard_TC_002() {
        scorecardPage.clickContacts();
        scorecardPage.fillProspect("TestFirst", "TestLast", "TestCompanyName");
        scorecardPage.clickSaveProspect();
    }

    @Test
    public void Scorecard_TC_003() {
        scorecardPage.clickReports();
        scorecardPage.validateReportsView();
    }

    @Test
    public void Scorecard_TC_004() {
        scorecardPage.clickAttempts();
        scorecardPage.validateAttemptForm();
    }

    @Test
    public void Scorecard_TC_005() {
        scorecardPage.clickPipelineDealsClosed();
        scorecardPage.validateDealsClosedView();
    }

    @Test
    public void Scorecard_TC_006() {
        scorecardPage.clickPipelinePitchAndMiss();
        scorecardPage.validatePitchAndMiss();
    }

    @Test
    public void Scorecard_TC_007() {
        scorecardPage.validatePipelineAll();
        scorecardPage.validatePitchAndMiss();
    }

    @Test
    public void Scorecard_TC_008() {
        scorecardPage.clickPipelineArchived();
        scorecardPage.validatePipelineArchived();
    }

    @Test
    public void Scorecard_TC_009() {
        scorecardPage.clickContacts();
        scorecardPage.validateContactsProspect();
    }

    @Test
    public void Scorecard_TC_010() {
        scorecardPage.clickContacts();
        scorecardPage.validateContactsSuspect();
    }

    @Test
    public void Scorecard_TC_011() {
        scorecardPage.clickContacts();
        scorecardPage.validateContactsLead();
    }

    @Test
    public void Scorecard_TC_012() {
        scorecardPage.clickContacts();
        scorecardPage.validateContactsAll();
    }

    @Test
    public void Scorecard_TC_013() {
        scorecardPage.clickReports();
        scorecardPage.validateReportsProductivity();
    }

    @Test
    public void Scorecard_TC_014() {
        scorecardPage.clickReports();
        scorecardPage.validateReportsProficiency();
    }

    @Test
    public void Scorecard_TC_015() {
        scorecardPage.clickReports();
        scorecardPage.validateReportsPerformance();
    }
}
