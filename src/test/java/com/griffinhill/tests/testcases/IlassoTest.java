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
public class IlassoTest extends TestsInit {

    LoginInfo user = loginCredentials();

    @BeforeMethod
    public void before() {
        try {
            login(user);
            achievementHubPage.navigateTo(ILASSO);
            ilassoPage.checkOpenedPage();
            ilassoPage.navigateTo(CADENCES);
            waitUntilPageIsLoaded();
        }
       catch (Exception e)
        {
            //driver.close();
            //driver.quit();
            System.out.println("FAIL");
       }
        /*try {
            if (!ilassoPage.validateSearchResultTableIsNotEmpty()) {
                ilassoPage.addCadence("New", "AutomationTest-Cadence");
            }
        }
        catch (Exception e)
        {
            ilassoPage.addCadence("New", "AutomationTest-Cadence");
        }*/

    }

    @Test
    @Description("Test Case: Search functionality in Cadence Page (iLasso -> Cadences)")
    public void Ilasso_TC_001() {
        ilassoPage.searchCadence("Test-CadenceNew");
        ilassoPage.verifySearchResult("Test-CadenceNew");
    }

    @Test
    @Description("Test Case: Load all data function in Cadence Page (iLasso -> Cadences)")
    public void Ilasso_TC_002() {
        ilassoPage.loadAllData();
        ilassoPage.verifySearchResultTableIsNotEmpty();
    }

    @Test
    @Description("Test Case: Show # of Rows function in Cadence Page (iLasso -> Cadences) ")
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
    @Description("Test Case: Add New Cadence (iLasso -> Cadence) ")
    public void Ilasso_TC_004() {
        ilassoPage.addCadence("New", "AutomationTest-Cadence");
        ilassoPage.verifySuccessMsg();
        ilassoPage.verifySearchResult("AutomationTest-Cadence");
    }

    @Test
    @Description("Test Case: Delete Cadence (iLasso -> Cadence) ")
    public void Ilasso_TC_005() {
        ilassoPage.deleteLatestCadenceRecord();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - View Cadence")
    public void Ilasso_TC_006() {
        ilassoPage.clickCadenceViewOption("VIEW_CADENCE");
        viewCadencePage.checkOpenedPage();
        viewCadencePage.validateViewCadenceButtons();
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - Edit Cadence Name")
    public void Ilasso_TC_007() {
        ilassoPage.clickCadenceViewOption("EDIT_CADENCE_NAME");
        editCadenceName.checkEditCadenceModal();
        editCadenceName.editCadenceName("Automation_Test_2");
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - Organize Steps")
    public void Ilasso_TC_008() {
        ilassoPage.clickCadenceViewOption("ORGANIZE_STEP");
        organizeSteps.checkOrganizeStepsModal();
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - Deactivate Cadence")
    public void Ilasso_TC_009() {
        ilassoPage.clickCadenceViewOption("DEACTIVATE_CADENCE");
        cadenceStatus.checkCadenceStatusModal("Deactivating a Cadence will pause all steps and activities within the Cadence. You will be able to turn it back to active once you've set it as inactive.");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - Activate Cadence")
    public void Ilasso_TC_010() {
        ilassoPage.activateCadence();
        cadenceStatus.checkCadenceStatusModal("Turning a Cadence to active will resume all steps and activities within the Cadence. You will be able to turn it back to inactive once you've set it as active.");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - Delete Cadence")
    public void Ilasso_TC_011() {
        ilassoPage.clickCadenceViewOption("DELETE_CADENCE");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Cadence Record - Inactive Status")
    public void Ilasso_TC_012() {
        ilassoPage.clickCadenceViewOption("DEACTIVATE_CADENCE");
        cadenceStatus.checkCadenceStatusModal("Deactivating a Cadence will pause all steps and activities within the Cadence. You will be able to turn it back to active once you've set it as inactive.");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
        ilassoPage.validateCadenceStatus("Inactive");
    }

    @Test
    @Description("Test Case: Cadence Record - Active Status")
    public void Ilasso_TC_013() {
        ilassoPage.clickCadenceViewOption("DEACTIVATE_CADENCE");
        cadenceStatus.checkCadenceStatusModal("Turning a Cadence to active will resume all steps and activities within the Cadence. You will be able to turn it back to inactive once you've set it as active.");
        cadenceStatus.confirm();
        ilassoPage.verifySuccessMsg();
        ilassoPage.validateCadenceStatus("Active");
    }

    @Test
    @Description("Test Case: Edit Cadence (Cadence Record -> Edit)")
    public void Ilasso_TC_014() {
        ilassoPage.clickCadenceViewOption("EDIT_CADENCE_NAME");
        editCadenceName.checkEditCadenceModal();
        editCadenceName.editCadenceName("Automation_Test_3");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Email - Manual (Cadence Record -> Add Step)")
    public void Ilasso_TC_015() {

        ilassoPage.addCadence("New", "AutomationTest-Cadence");

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
    @Description("Test Case: Add Step - Date Timer - Email - Manual (Cadence Record -> Add Step)")
    public void Ilasso_TC_016() {
        ilassoPage.addCadence("New", "AutomationTest-Cadence");

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
    @Description("Test Case: Add Step - Field Timer - Email - Manual (Cadence Record -> Add Step)")
    public void Ilasso_TC_017() {
        ilassoPage.addCadence("New", "AutomationTest-Cadence");

        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.writeNotes("Timer: Field | Step type: Email | Step Action: Manual");
        ilassoPage.clickSave();
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Email - Automatic (Cadence Record -> Add Step)")
    public void Ilasso_TC_018() {
        ilassoPage.addCadence("New", "AutomationTest-Cadence");

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

    @Test
    @Description("Test Case: Add Step - Delay Timer - Text Message - Manual (Cadence Record -> Add Step)")
    public void Ilasso_TC_019() {
        ilassoPage.addCadence("New", "AutomationTest-Cadence");

        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectStepType("Text Message");
        ilassoPage.selectStepAction("Manual");
        ilassoPage.clickNext();
        ilassoPage.clickSave();
        ilassoPage.fillTextMessageTemplate(
                "Test-Automation-TextMessage",
                "Compose Message here");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Text Message - Automatic (Cadence Record -> Add Step)")
    public void Ilasso_TC_020() {
        ilassoPage.addCadence("New", "AutomationTest-Cadence");

        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectStepType("Text Message");
        ilassoPage.selectStepAction("Automatic");
        ilassoPage.clickNext();
        ilassoPage.clickSave();
        ilassoPage.fillTextMessageTemplate(
                "Test-Automation-TextMessage-Automatic",
                "Compose Message here");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Text Message - Manual (Cadence Record -> Add Step)")
    public void Ilasso_TC_021() {
        ilassoPage.addCadence("New", "AutomationTest-Cadence");

        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.selectStepType("Text Message");
        ilassoPage.selectStepAction("Manual");
        ilassoPage.clickNext();
        ilassoPage.clickSave();
        ilassoPage.fillTextMessageTemplate(
                "Test-Automation-TextMessage-Automatic",
                "Compose Message here");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Text Message - Automatic (Cadence Record -> Add Step)")
    public void Ilasso_TC_022() {
        ilassoPage.addCadence("New", "AutomationTest-Cadence");

        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.selectStepType("Text Message");
        ilassoPage.selectStepAction("Automatic");
        ilassoPage.clickNext();
        ilassoPage.clickSave();
        ilassoPage.fillTextMessageTemplate(
                "Test-Automation-TextMessage-Automatic",
                "Compose Message here");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Text Message - Manual (Cadence Record -> Add Step)")
    public void Ilasso_TC_023() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.selectStepType("Text Message");
        ilassoPage.selectStepAction("Manual");
        ilassoPage.clickNext();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Text Message - Automatic (Cadence Record -> Add Step)")
    public void Ilasso_TC_024() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.selectStepType("Text Message");
        ilassoPage.selectStepAction("Automatic");
        ilassoPage.clickNext();
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Phone Call - Introductory Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_025() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.writeNotes("Timer: Delay | Step type: Phone Call | Step Action: Introductory Call");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Phone Call - Introductory Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_026() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.writeNotes("Timer: Date | Step type: Phone Call | Step Action: Introductory Call");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Phone Call - Introductory Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_027() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.writeNotes("Timer: Field | Step type: Phone Call | Step Action: Introductory Call");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Phone Call - Demo Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_028() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Demo Call");
        ilassoPage.writeNotes("Timer: Delay | Step type: Phone Call | Step Action: Demo Call");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Phone Call - Demo Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_029() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Demo Call");
        ilassoPage.writeNotes("Timer: Date | Step type: Phone Call | Step Action: Demo Call");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Phone Call - Demo Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_030() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Demo Call");
        ilassoPage.writeNotes("Timer: Field | Step type: Phone Call | Step Action: Demo Call");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Phone Call - Follow-up Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_031() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Delay timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Follow-up Call");
        ilassoPage.writeNotes("Timer: Delay | Step type: Phone Call | Step Action: Follow-up Call");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Phone Call - Follow-up Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_032() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Follow-up Call");
        ilassoPage.writeNotes("Timer: Date | Step type: Phone Call | Step Action: Follow-up Call");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Phone Call - Follow-up Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_033() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Follow-up Call");
        ilassoPage.writeNotes("Timer: Field | Step type: Phone Call | Step Action: Follow-up Call");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Phone Call - Supporting Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_034() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Delay timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Supporting Call");
        ilassoPage.writeNotes("Timer: Delay | Step type: Phone Call | Step Action: Supporting Call");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Phone Call - Supporting Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_035() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Supporting Call");
        ilassoPage.writeNotes("Timer: Date | Step type: Phone Call | Step Action: Supporting Call");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Phone Call - Supporting Call (Cadence Record -> Add Step)")
    public void Ilasso_TC_036() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Supporting Call");
        ilassoPage.writeNotes("Timer: Field | Step type: Phone Call | Step Action: Supporting Call");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Phone Call - Others (Cadence Record -> Add Step)")
    public void Ilasso_TC_037() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Delay timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Others");
        ilassoPage.writeNotes("Timer: Delay | Step type: Phone Call | Step Action: Others");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Phone Call - Others (Cadence Record -> Add Step)")
    public void Ilasso_TC_038() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Others");
        ilassoPage.writeNotes("Timer: Date | Step type: Phone Call | Step Action: Others");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Phone Call - Others (Cadence Record -> Add Step)")
    public void Ilasso_TC_039() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.selectStepType("Phone Call");
        ilassoPage.selectStepAction("Others");
        ilassoPage.writeNotes("Timer: Field | Step type: Phone Call | Step Action: Others");
    }

    @Test
    /* Test Case: Add Step - Delay Timer - LinkedIn - Send a Connection Request (Cadence Record -> Add Step) */
    public void Ilasso_TC_040() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Delay timer");
        ilassoPage.selectStepType("LinkedIn - Send a Connection Request");
        ilassoPage.writeNotes("Timer: Delay | Step type: LinkedIn - Send a Connection Request");
        ilassoPage.clickSave();
        ilassoPage.fillLinkedTemplate(
                "Test-Automation-LinkedIn",
                "Compose Message here");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Field Timer - LinkedIn - Send a Connection Request (Cadence Record -> Add Step) */
    public void Ilasso_TC_041() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.selectStepType("LinkedIn - Send a Connection Request");
        ilassoPage.writeNotes("Timer: Field | Step type: LinkedIn - Send a Connection Request");
    }

    @Test
    /* Test Case: Add Step - Delay Timer - LinkedIn - Send Message (Cadence Record -> Add Step) */
    public void Ilasso_TC_042() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Delay timer");
        ilassoPage.selectStepType("LinkedIn - Send Message");
        ilassoPage.writeNotes("Timer: Delay | Step type: LinkedIn - Send Message");
        ilassoPage.clickSave();
        ilassoPage.fillLinkedTemplate(
                "Test-Automation-LinkedIn - Send Message",
                "Compose Message here");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Date Timer - LinkedIn - Send Message (Cadence Record -> Add Step) */
    public void Ilasso_TC_043() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.selectStepType("LinkedIn - Send Message");
        ilassoPage.writeNotes("Timer: Date | Step type: LinkedIn - Send Message");
        ilassoPage.clickSave();
        ilassoPage.fillLinkedTemplate(
                "Test-Automation-LinkedIn - Send Message",
                "Compose Message here");
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Field Timer - LinkedIn - Send Message (Cadence Record -> Add Step) */
    public void Ilasso_TC_044() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.selectStepType("LinkedIn - Send Message");
        ilassoPage.writeNotes("Timer: Field | Step type: LinkedIn - Send Message");
    }

    @Test
    /* Test Case: Add Step - Delay Timer - LinkedIn - View Profile (Cadence Record -> Add Step) */
    public void Ilasso_TC_045() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Delay timer");
        ilassoPage.selectStepType("LinkedIn - View Profile");
        ilassoPage.writeNotes("Timer: Delay | Step type: LinkedIn - View Profile");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Date Timer - LinkedIn - View Profile (Cadence Record -> Add Step) */
    public void Ilasso_TC_046() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Date timer");
        ilassoPage.selectStepType("LinkedIn - View Profile");
        ilassoPage.writeNotes("Timer: Date | Step type: LinkedIn - View Profile");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Field Timer - LinkedIn - View Profile (Cadence Record -> Add Step) */
    public void Ilasso_TC_047() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Field timer");
        ilassoPage.selectStepType("LinkedIn - View Profile");
        ilassoPage.writeNotes("Timer: Field | Step type: LinkedIn - View Profile");
    }

    @Test
    /* Test Case: Add Step - Delay Timer - LinkedIn - Interaction (Cadence Record -> Add Step) */
    public void Ilasso_TC_048() {
        ilassoPage.clickCadence("AutomationTest-Cadence");
        ilassoPage.clickAddStep();
        ilassoPage.selectTimer("Delay timer");
        ilassoPage.selectStepType("LinkedIn - Interaction");
        ilassoPage.writeNotes("Timer: Delay | Step type: LinkedIn - Interaction");
        ilassoPage.clickSave();
        ilassoPage.verifySuccessMsg();
    }
    
}
