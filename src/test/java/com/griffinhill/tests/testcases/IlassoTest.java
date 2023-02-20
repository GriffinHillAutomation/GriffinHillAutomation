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
    /* Test Case: Search functionality in Cadence Page (iLasso -> Cadences) */
    public void Ilasso_TC_001() {
        ilassoPage.searchCadence("Test-CadenceNew");
        ilassoPage.verifySearchResult("Test-CadenceNew");
    }

    @Test
    /* Test Case: Load all data function in Cadence Page (iLasso -> Cadences) */
    public void Ilasso_TC_002() {
        ilassoPage.loadAllData();
        ilassoPage.verifySearchResultTableIsNotEmpty();
    }

    @Test
    /* Test Case: Show # of Rows function in Cadence Page (iLasso -> Cadences) */
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
    /* Test Case: Add New Cadence (iLasso -> Cadence) */
    public void Ilasso_TC_004() {
        ilassoPage.addCadence("New", "AutomationTest-Cadence");
        ilassoPage.verifySuccessMsg();
        ilassoPage.verifySearchResult("AutomationTest-Cadence");
    }

    @Test
    /* Test Case: Delete Cadence (iLasso -> Cadence) */
    public void Ilasso_TC_005() {
        ilassoPage.deleteLatestCadenceRecord();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Cadence Record - Arrow button - View Cadence */
    public void Ilasso_TC_006() {
        ilassoPage.clickCadenceViewOption("VIEW_CADENCE");
        viewCadencePage.checkOpenedPage();
        viewCadencePage.validateViewCadenceButtons();
    }

    @Test
    /* Test Case: Cadence Record - Arrow button - Edit Cadence Name */
    public void Ilasso_TC_007() {
        ilassoPage.clickCadenceViewOption("EDIT_CADENCE_NAME");
        editCadenceName.checkEditCadenceModal();
        editCadenceName.editCadenceName("Automation_Test_2");
    }

    @Test
    /* Test Case: Cadence Record - Arrow button - Organize Steps */
    public void Ilasso_TC_008() {
        ilassoPage.clickCadenceViewOption("ORGANIZE_STEP");
        organizeSteps.checkOrganizeStepsModal();
    }

    @Test
    /* Test Case: Cadence Record - Arrow button - Deactivate Cadence */
    public void Ilasso_TC_009() {
        ilassoPage.clickCadenceViewOption("DEACTIVATE_CADENCE");
        cadenceStatus.checkCadenceStatusModal("Deactivating a Cadence will pause all steps and activities within the Cadence. You will be able to turn it back to active once you've set it as inactive.");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Cadence Record - Arrow button - Activate Cadence */
    public void Ilasso_TC_010() {
        ilassoPage.activateCadence();
        cadenceStatus.checkCadenceStatusModal("Turning a Cadence to active will resume all steps and activities within the Cadence. You will be able to turn it back to inactive once you've set it as active.");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Cadence Record - Arrow button - Delete Cadence */
    public void Ilasso_TC_011() {
        ilassoPage.clickCadenceViewOption("DELETE_CADENCE");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Cadence Record - Inactive Status */
    public void Ilasso_TC_012() {
        ilassoPage.clickCadenceViewOption("DEACTIVATE_CADENCE");
        cadenceStatus.checkCadenceStatusModal("Deactivating a Cadence will pause all steps and activities within the Cadence. You will be able to turn it back to active once you've set it as inactive.");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
        ilassoPage.validateCadenceStatus("Inactive");
    }

    @Test
    /* Test Case: Cadence Record - Active Status */
    public void Ilasso_TC_013() {
        ilassoPage.clickCadenceViewOption("DEACTIVATE_CADENCE");
        cadenceStatus.checkCadenceStatusModal("Turning a Cadence to active will resume all steps and activities within the Cadence. You will be able to turn it back to inactive once you've set it as active.");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
        ilassoPage.validateCadenceStatus("Active");
    }

    @Test
    /* Test Case: Edit Cadence (Cadence Record -> Edit) */
    public void Ilasso_TC_014() {
        ilassoPage.clickCadenceViewOption("EDIT_CADENCE_NAME");
        editCadenceName.checkEditCadenceModal();
        editCadenceName.editCadenceName("Automation_Test_3");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Delay Timer - Email - Manual (Cadence Record -> Add Step) */
    public void Ilasso_TC_015() {
       // ilassoPage.addCadence("New", "AutomationTest-Cadence");
       // ilassoPage.verifySuccessMsg();
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.writeNotes("Timer: Delay | Step type: Email | Step Action: Manual");
        ilassoPage.clickSave();
        ilassoPage.fillEmailTemplate(
                "Test-Automation",
                "Send Email Testing",
                "Compose Email here");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Date Timer - Email - Manual (Cadence Record -> Add Step) */
    public void Ilasso_TC_016() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.writeNotes("Timer: Date | Step type: Email | Step Action: Manual");
        ilassoPage.clickSave();
        ilassoPage.fillEmailTemplate(
                "Test-Automation",
                "Send Email Testing",
                "Compose Email here");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Field Timer - Email - Manual (Cadence Record -> Add Step) */
    public void Ilasso_TC_017() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.writeNotes("Timer: Field | Step type: Email | Step Action: Manual");
        ilassoPage.clickSave();
    }

    @Test
    /* Test Case: Add Step - Delay Timer - Email - Automatic (Cadence Record -> Add Step) */
    public void Ilasso_TC_018() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectStepAction("Automatic");
        ilassoPage.clickNext();
        ilassoPage.clickSave();
        ilassoPage.fillEmailTemplate(
                "Test-Automation",
                "Send Email Testing",
                "Compose Email here");
        ilassoPage.verifySuccessMsg();
    }
}
