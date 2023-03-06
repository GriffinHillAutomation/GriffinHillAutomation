package com.griffinhill.tests;

import com.griffinhill.modals.DeactivateActivateCadenceModal;
import com.griffinhill.modals.EditCadenceNameModal;
import com.griffinhill.modals.OrganizeStepsModal;
import com.griffinhill.site.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.testng.CommandLineArgs.CONFIG_FAILURE_POLICY;

public class TestsInit extends BasePageObject {

    private final String GRIFFIN_HILL_URL = "https://beta-legacy.griffinhill.com/";
    //private final String GRIFFIN_HILL_URL = "https://beta.griffinhill.com/";
    //private final String GRIFFIN_HILL_URL = "https://members.griffinhill.com/";

    public TestsInit() {
    }

    public LoginPage loginPage;
    public AchievementHubPage achievementHubPage;
    public IlassoPage ilassoPage;
    public ViewCadencePage viewCadencePage;
    public EditCadenceNameModal editCadenceName;
    public OrganizeStepsModal organizeSteps;
    public DeactivateActivateCadenceModal cadenceStatus;
    //public BasePageObject basePageObject;


    @BeforeMethod(alwaysRun = true)
    public void beforeMethodTestsInit() {
        setup();
        initPage();
        //checkOpenedPage();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethodTestsInit() {
        //driver.close();
        driver.quit();
    }

    private void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setCapability(CONFIG_FAILURE_POLICY, "continue");
        //configfailurepolicy
        //	skip|continue
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.get(GRIFFIN_HILL_URL);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    private void initPage() {
        //driver = getDriver();
        //basePageObject = new BasePageObject();
        loginPage = new LoginPage();
        PageFactory.initElements(driver, loginPage);
        achievementHubPage = new AchievementHubPage();
        PageFactory.initElements(driver, achievementHubPage);
        ilassoPage = new IlassoPage();
        PageFactory.initElements(driver, ilassoPage);
        viewCadencePage = new ViewCadencePage();
        PageFactory.initElements(driver, viewCadencePage);
        editCadenceName = new EditCadenceNameModal();
        PageFactory.initElements(driver, editCadenceName);
        organizeSteps = new OrganizeStepsModal();
        PageFactory.initElements(getDriver(), organizeSteps);
        cadenceStatus = new DeactivateActivateCadenceModal();
        PageFactory.initElements(getDriver(), cadenceStatus);
    }
}
