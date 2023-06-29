package com.griffinhill.tests.testcases.Beta;

import com.griffinhill.entities.LoginInfo;
import com.griffinhill.tests.TestsInit;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import reports.AllureListener;

import static com.griffinhill.enums.PageNavigation.CADENCES;
import static com.griffinhill.enums.PageNavigation.ILASSO_BETA;
import static com.griffinhill.site.pages.LoginPage.login;
import static testdata.LoginDetails.loginCredentials;

@Listeners({AllureListener.class})
public class IlassoBetaTest extends TestsInit {

    LoginInfo user = loginCredentials();

    @BeforeMethod(alwaysRun = true)
    public void before() {
        //try {
        driver.get("https://beta.griffinhill.com/login");

        login(user);
            achievementHubPage.navigateTo(ILASSO_BETA);
            ilassoBetaPage.checkOpenedPage();
            try {
                ilassoBetaPage.navigateTo(CADENCES);
            }
            catch (Exception e)
            {
                try {
                    driver.navigate().refresh();
                    ilassoBetaPage.navigateTo(CADENCES);
                }
                catch (Exception ef)
                {
                    System.out.println("fak");
                }
            }
            waitUntilPageIsLoaded();
        /*}
        catch (Exception e)
        {
            //driver.close();
            //driver.quit();
            System.out.println("FAIL");
        }*/

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

    @Test
    @Description("Test Case: Cadence Record - Arrow button - Deactivate Cadence")
    public void IlassoBeta_TC_009() {
        ilassoBetaPage.clickCadenceViewOption("DEACTIVATE_CADENCE");
        cadenceStatus.checkCadenceStatusModal("Deactivating a Cadence will pause all steps and activities within the Cadence. You will be able to turn it back to active once you've set it as inactive.");
        cadenceStatus.confirm();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - Activate Cadence")
    public void IlassoBeta_TC_010() {
        ilassoBetaPage.activateCadence();
        cadenceStatus.checkCadenceStatusModal("Turning a Cadence to active will resume all steps and activities within the Cadence. You will be able to turn it back to inactive once you've set it as active.");
        cadenceStatus.confirm();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Cadence Record - Arrow button - Delete Cadence")
    public void IlassoBeta_TC_011() {
        ilassoBetaPage.clickCadenceViewOption("DELETE_CADENCE");
        cadenceStatus.confirm();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Cadence Record - Inactive Status")
    public void IlassoBeta_TC_012() {
        ilassoBetaPage.clickCadenceViewOption("DEACTIVATE_CADENCE");
        cadenceStatus.checkCadenceStatusModal("Deactivating a Cadence will pause all steps and activities within the Cadence. You will be able to turn it back to active once you've set it as inactive.");
        cadenceStatus.confirm();
        ilassoBetaPage.verifySuccessMsg();
        ilassoBetaPage.validateCadenceStatus("Inactive");
    }

    @Test
    @Description("Test Case: Cadence Record - Active Status")
    public void IlassoBeta_TC_013() {
        ilassoBetaPage.clickCadenceViewOption("DEACTIVATE_CADENCE");
        cadenceStatus.checkCadenceStatusModal("Turning a Cadence to active will resume all steps and activities within the Cadence. You will be able to turn it back to inactive once you've set it as active.");
        cadenceStatus.confirm();
        ilassoBetaPage.verifySuccessMsg();
        ilassoBetaPage.validateCadenceStatus("Active");
    }

    @Test
    @Description("Test Case: Edit Cadence (Cadence Record -> Edit)")
    public void IlassoBeta_TC_014() {
        ilassoBetaPage.clickCadenceViewOption("EDIT_CADENCE_NAME");
        editCadenceName.checkEditCadenceModal();
        editCadenceName.editCadenceName("Automation_Test_3");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Email - Manual (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_015() {
        ilassoBetaPage.addCadence("New", "AutomationTest-Cadence");
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: Email | Step Action: Manual");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.fillEmailTemplate(
                "Test-Automation",
                "Send Email Testing",
                "Compose Email here");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Email - Manual (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_016() {
        ilassoBetaPage.addCadence("New", "AutomationTest-Cadence");

        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.writeNotes("Timer: Date | Step type: Email | Step Action: Manual");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.fillEmailTemplate(
                "Test-Automation",
                "Send Email Testing",
                "Compose Email here");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Email - Manual (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_017() {
        ilassoBetaPage.addCadence("New", "AutomationTest-Cadence");

        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: Email | Step Action: Manual");
        ilassoBetaPage.clickSave();
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Email - Automatic (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_018() {
        ilassoBetaPage.addCadence("New", "AutomationTest-Cadence");

        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectStepAction("Automatic");
        ilassoBetaPage.clickNext();
        ilassoBetaPage.clickSave();
        ilassoBetaPage.fillEmailTemplate(
                "Test-Automation",
                "Send Email Testing",
                "Compose Email here");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Text Message - Manual (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_019() {
        ilassoBetaPage.addCadence("New", "AutomationTest-Cadence");

        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectStepType("Text Message");
        ilassoBetaPage.selectStepAction("Manual");
        ilassoBetaPage.clickNext();
        ilassoBetaPage.clickSave();
        ilassoBetaPage.fillTextMessageTemplate(
                "Test-Automation-TextMessage",
                "Compose Message here");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Text Message - Automatic (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_020() {
        ilassoBetaPage.addCadence("New", "AutomationTest-Cadence");

        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectStepType("Text Message");
        ilassoBetaPage.selectStepAction("Automatic");
        ilassoBetaPage.clickNext();
        ilassoBetaPage.clickSave();
        ilassoBetaPage.fillTextMessageTemplate(
                "Test-Automation-TextMessage-Automatic",
                "Compose Message here");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Text Message - Manual (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_021() {
        ilassoBetaPage.addCadence("New", "AutomationTest-Cadence");

        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("Text Message");
        ilassoBetaPage.selectStepAction("Manual");
        ilassoBetaPage.clickNext();
        ilassoBetaPage.clickSave();
        ilassoBetaPage.fillTextMessageTemplate(
                "Test-Automation-TextMessage-Automatic",
                "Compose Message here");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Text Message - Automatic (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_022() {
        ilassoBetaPage.addCadence("New", "AutomationTest-Cadence");

        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("Text Message");
        ilassoBetaPage.selectStepAction("Automatic");
        ilassoBetaPage.clickNext();
        ilassoBetaPage.clickSave();
        ilassoBetaPage.fillTextMessageTemplate(
                "Test-Automation-TextMessage-Automatic",
                "Compose Message here");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Text Message - Manual (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_023() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("Text Message");
        ilassoBetaPage.selectStepAction("Manual");
        ilassoBetaPage.clickNext();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Text Message - Automatic (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_024() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("Text Message");
        ilassoBetaPage.selectStepAction("Automatic");
        ilassoBetaPage.clickNext();
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Phone Call - Introductory Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_025() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: Phone Call | Step Action: Introductory Call");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Phone Call - Introductory Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_026() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.writeNotes("Timer: Date | Step type: Phone Call | Step Action: Introductory Call");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Phone Call - Introductory Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_027() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: Phone Call | Step Action: Introductory Call");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Phone Call - Demo Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_028() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Demo Call");
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: Phone Call | Step Action: Demo Call");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Phone Call - Demo Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_029() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Demo Call");
        ilassoBetaPage.writeNotes("Timer: Date | Step type: Phone Call | Step Action: Demo Call");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Phone Call - Demo Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_030() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Demo Call");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: Phone Call | Step Action: Demo Call");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Phone Call - Follow-up Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_031() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Delay timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Follow-up Call");
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: Phone Call | Step Action: Follow-up Call");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Phone Call - Follow-up Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_032() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Follow-up Call");
        ilassoBetaPage.writeNotes("Timer: Date | Step type: Phone Call | Step Action: Follow-up Call");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Phone Call - Follow-up Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_033() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Follow-up Call");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: Phone Call | Step Action: Follow-up Call");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Phone Call - Supporting Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_034() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Delay timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Supporting Call");
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: Phone Call | Step Action: Supporting Call");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Phone Call - Supporting Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_035() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Supporting Call");
        ilassoBetaPage.writeNotes("Timer: Date | Step type: Phone Call | Step Action: Supporting Call");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Phone Call - Supporting Call (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_036() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Supporting Call");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: Phone Call | Step Action: Supporting Call");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - Phone Call - Others (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_037() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Delay timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Others");
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: Phone Call | Step Action: Others");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - Phone Call - Others (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_038() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Others");
        ilassoBetaPage.writeNotes("Timer: Date | Step type: Phone Call | Step Action: Others");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - Phone Call - Others (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_039() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("Phone Call");
        ilassoBetaPage.selectStepAction("Others");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: Phone Call | Step Action: Others");
    }

    @Test
    /* Test Case: Add Step - Delay Timer - LinkedIn - Send a Connection Request (Cadence Record -> Add Step) */
    public void IlassoBeta_TC_040() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Delay timer");
        ilassoBetaPage.selectStepType("LinkedIn - Send a Connection Request");
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: LinkedIn - Send a Connection Request");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.fillLinkedTemplate(
                "Test-Automation-LinkedIn",
                "Compose Message here");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - LinkedIn - Send a Connection Request (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_041() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("LinkedIn - Send a Connection Request");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: LinkedIn - Send a Connection Request");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - LinkedIn - Send Message (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_042() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Delay timer");
        ilassoBetaPage.selectStepType("LinkedIn - Send Message");
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: LinkedIn - Send Message");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.fillLinkedTemplate(
                "Test-Automation-LinkedIn - Send Message",
                "Compose Message here");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - LinkedIn - Send Message (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_043() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("LinkedIn - Send Message");
        ilassoBetaPage.writeNotes("Timer: Date | Step type: LinkedIn - Send Message");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.fillLinkedTemplate(
                "Test-Automation-LinkedIn - Send Message",
                "Compose Message here");
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - LinkedIn - Send Message (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_044() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("LinkedIn - Send Message");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: LinkedIn - Send Message");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - LinkedIn - View Profile (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_045() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Delay timer");
        ilassoBetaPage.selectStepType("LinkedIn - View Profile");
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: LinkedIn - View Profile");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Date Timer - LinkedIn - View Profile (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_046() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("LinkedIn - View Profile");
        ilassoBetaPage.writeNotes("Timer: Date | Step type: LinkedIn - View Profile");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    @Description("Test Case: Add Step - Field Timer - LinkedIn - View Profile (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_047() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("LinkedIn - View Profile");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: LinkedIn - View Profile");
    }

    @Test
    @Description("Test Case: Add Step - Delay Timer - LinkedIn - Interaction (Cadence Record -> Add Step)")
    public void IlassoBeta_TC_048() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Delay timer");
        ilassoBetaPage.selectStepType("LinkedIn - Interaction");
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: LinkedIn - Interaction");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Date Timer - LinkedIn - Interaction (Cadence Record -> Add Step) */
    public void IlassoBeta_TC_049() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("LinkedIn - Interaction");
        ilassoBetaPage.writeNotes("Timer: Date | Step type: LinkedIn - Interaction");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Field Timer - LinkedIn - Interaction (Cadence Record -> Add Step) */
    public void IlassoBeta_TC_050() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("LinkedIn - Interaction");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: LinkedIn - Interaction");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Delay Timer - Other Task (Cadence Record -> Add Step) */
    public void IlassoBeta_TC_051() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Delay timer");
        ilassoBetaPage.selectStepType("Other Task");
        ilassoBetaPage.inputOtherTaskName("Other Task - Delay");
        ilassoBetaPage.writeNotes("Timer: Delay | Step type: Other Task");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Date Timer - Other Task (Cadence Record -> Add Step) */
    public void IlassoBeta_TC_052() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Date timer");
        ilassoBetaPage.selectStepType("Other Task");
        ilassoBetaPage.inputOtherTaskName("Other Task - Date");
        ilassoBetaPage.writeNotes("Timer: Date | Step type: Other Task");
        ilassoBetaPage.clickSave();
        ilassoBetaPage.verifySuccessMsg();
    }

    @Test
    /* Test Case: Add Step - Field Timer - Other Task (Cadence Record -> Add Step) */
    public void IlassoBeta_TC_053() {
        ilassoBetaPage.clickCadence("AutomationTest-Cadence");
        ilassoBetaPage.clickAddStep();
        ilassoBetaPage.selectTimer("Field timer");
        ilassoBetaPage.selectStepType("Other Task");
        ilassoBetaPage.inputOtherTaskName("Other Task - Field");
        ilassoBetaPage.writeNotes("Timer: Field | Step type: Other Task");
    }
}
