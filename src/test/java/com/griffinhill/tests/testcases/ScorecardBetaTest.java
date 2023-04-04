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
        scorecardBetaPage.validateScorecardPiplelineActive();
    }

    @Test
    public void TCSC_002() {
        scorecardBetaPage.clickContacts();
        scorecardBetaPage.validateContactsAll();
    }

    @Test
    public void TCSC_003() {
        scorecardBetaPage.clickCalendar();
        scorecardBetaPage.validateCalendar();
    }

    @Test
    public void TCSC_004() {
        scorecardBetaPage.clickReports();
        scorecardBetaPage.validateReportsOverview();
    }

    @Test
    public void TCSC_005() {
        scorecardBetaPage.clickPitchAndMiss();
        scorecardBetaPage.validatePiplelinePitchAndMiss();
    }

    @Test
    public void TCSC_006() {
        scorecardBetaPage.clickClosedDeals();
        scorecardBetaPage.validatePiplelineClosedDeals();
    }
}
