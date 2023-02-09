package com.griffinhill.tests.testcases;

import com.griffinhill.entities.LoginInfo;
import com.griffinhill.tests.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.griffinhill.enums.PageNavigation.CADENCES;
import static com.griffinhill.enums.PageNavigation.ILASSO;
import static com.griffinhill.site.pages.LoginPage.login;
import static testdata.LoginDetails.loginCredentials;
import static utils.DriverUtils.waitUntilPageIsLoaded;

public class IlassoTest extends TestsInit {

    LoginInfo user = loginCredentials();

    @BeforeMethod
    public void before() {
        login(user);
        achievementHubPage.navigateTo(ILASSO);
        ilassoPage.checkOpenedPage();
        ilassoPage.navigateTo(CADENCES);
        waitUntilPageIsLoaded();
    }

    @Test
    public void Ilasso_TC_001() {
        ilassoPage.searchCadence("Test-CadenceNew");
        ilassoPage.verifySearchResult("Test-CadenceNew");
    }

    @Test
    public void Ilasso_TC_002() {
        ilassoPage.loadAllData();
        ilassoPage.verifySearchResultTableIsNotEmpty();
    }

    @Test
    public void Ilasso_TC_003() {
        ilassoPage.showCadenceList(10);
        ilassoPage.verifySearchResults(10);
        ilassoPage.showCadenceList(20);
        ilassoPage.verifySearchResults(20);
        ilassoPage.showCadenceList(30);
        ilassoPage.verifySearchResults(30);
        ilassoPage.showCadenceList(40);
        ilassoPage.verifySearchResults(40);
        ilassoPage.showCadenceList(50);
        ilassoPage.verifySearchResults(50);
    }

    @Test
    public void Ilasso_TC_004() {
        ilassoPage.addCadence("New", "AutomationTest-Cadence");
        ilassoPage.verifySuccessMsg();
        ilassoPage.verifySearchResult("AutomationTest-Cadence");
    }

    @Test
    public void Ilasso_TC_005() {
        ilassoPage.deleteLatestCadenceRecord();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    public void Ilasso_TC_006() {
        ilassoPage.clickCadenceViewOption("VIEW_CADENCE");
        viewCadencePage.checkOpenedPage();
        viewCadencePage.validateViewCadenceButtons();
    }

    @Test
    public void Ilasso_TC_007() {
        ilassoPage.clickCadenceViewOption("EDIT_CADENCE_NAME");
        editCadenceName.checkEditCadenceModal();
        editCadenceName.editCadenceName("Automation_Test_2");
    }

    @Test
    public void Ilasso_TC_008() {
        ilassoPage.clickCadenceViewOption("ORGANIZE_STEP");
        organizeSteps.checkOrganizeStepsModal();
    }

    @Test
    public void Ilasso_TC_009() {
        ilassoPage.clickCadenceViewOption("DEACTIVATE_CADENCE");
        cadenceStatus.checkCadenceStatusModal("Deactivating a Cadence will pause all steps and activities within the Cadence. You will be able to turn it back to active once you've set it as inactive.");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    public void Ilasso_TC_010() {
        ilassoPage.activateCadence();
        cadenceStatus.checkCadenceStatusModal("Turning a Cadence to active will resume all steps and activities within the Cadence. You will be able to turn it back to inactive once you've set it as active.");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
    }


}
