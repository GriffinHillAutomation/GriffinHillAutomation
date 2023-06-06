package com.griffinhill.tests.testcases;

import com.griffinhill.entities.LoginInfo;
import com.griffinhill.tests.TestsInit;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import reports.AllureListener;

import static com.griffinhill.enums.PageNavigation.CADENCES;
import static com.griffinhill.enums.PageNavigation.ILASSO;
import static com.griffinhill.site.pages.LoginPage.login;
import static testdata.LoginDetails.loginCredentials;

@Listeners({AllureListener.class})
public class IlassoBetaTest extends TestsInit {

    LoginInfo user = loginCredentials();

    @BeforeMethod
    public void before() {
        try {
            login(user);
            achievementHubPage.navigateTo(ILASSO);
            ilassoBetaPage.checkOpenedPage();
            ilassoBetaPage.navigateTo(CADENCES);
            waitUntilPageIsLoaded();
        }
        catch (Exception e)
        {
            //driver.close();
            //driver.quit();
            System.out.println("FAIL");
        }

    }

    @Test
    @Description("Test Case: Search functionality in Cadence Page (iLasso -> Cadences)")
    public void IlassoBeta_TC_001() {
        ilassoBetaPage.searchCadence("Test-CadenceNew");
        ilassoBetaPage.verifySearchResult("Test-CadenceNew");
    }

    @Test
    @Description("Test Case: Load all data function in Cadence Page (iLasso -> Cadences)")
    public void IlassoBeta_TC_002() {
        ilassoBetaPage.loadAllData();
        ilassoBetaPage.verifySearchResultTableIsNotEmpty();
    }

    @Test
    @Description("Test Case: Show # of Rows function in Cadence Page (iLasso -> Cadences) ")
    public void IlassoBeta_TC_003() {
        ilassoBetaPage.showCadenceList(10);
        ilassoBetaPage.verifySearchResults(10);
        ilassoBetaPage.showCadenceList(20);
        ilassoBetaPage.verifySearchResults(20);
        ilassoBetaPage.showCadenceList(30);
        ilassoBetaPage.verifySearchResults(30);
        ilassoBetaPage.showCadenceList(40);
        ilassoBetaPage.verifySearchResults(40);
        ilassoBetaPage.showCadenceList(50);
        ilassoBetaPage.verifySearchResults(50);
    }

    @Test
    @Description("Test Case: Add New Cadence (iLasso -> Cadence) ")
    public void IlassoBeta_TC_004() {
        ilassoBetaPage.addCadence("New", "AutomationTest-Cadence");
        ilassoBetaPage.verifySuccessMsg();
        ilassoBetaPage.verifySearchResult("AutomationTest-Cadence");
    }

    @Test
    @Description("Test Case: Delete Cadence (iLasso -> Cadence) ")
    public void IlassoBeta_TC_005() {
        ilassoBetaPage.deleteLatestCadenceRecord();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - View Cadence")
    public void IlassoBeta_TC_006() {
        ilassoBetaPage.clickCadenceViewOption("VIEW_CADENCE");
        viewCadencePage.checkOpenedPage();
        viewCadencePage.validateViewCadenceButtons();
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - Edit Cadence Name")
    public void IlassoBeta_TC_007() {
        ilassoBetaPage.clickCadenceViewOption("EDIT_CADENCE_NAME");
        editCadenceName.checkEditCadenceModal();
        editCadenceName.editCadenceName("Automation_Test_2");
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - Organize Steps")
    public void IlassoBeta_TC_008() {
        ilassoBetaPage.clickCadenceViewOption("ORGANIZE_STEP");
        organizeSteps.checkOrganizeStepsModal();
    }
}
