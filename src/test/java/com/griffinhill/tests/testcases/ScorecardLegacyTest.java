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
}
