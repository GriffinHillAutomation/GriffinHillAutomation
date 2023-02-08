package com.griffinhill.tests;

import com.griffinhill.modals.DeactivateActivateCadenceModal;
import com.griffinhill.modals.EditCadenceNameModal;
import com.griffinhill.modals.OrganizeStepsModal;
import com.griffinhill.site.pages.*;
import com.griffinhill.site.pages.BasePageObject;
import com.griffinhill.site.pages.AchievementHubPage;
import com.griffinhill.site.pages.IlassoPage;
import com.griffinhill.site.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestsInit {

    public static WebDriver driver;
    private final String GRIFFIN_HILL_URL = "https://beta.griffinhill.com/login";

    public LoginPage loginPage;
    public AchievementHubPage achievementHubPage;
    public IlassoPage ilassoPage;
    public ViewCadencePage viewCadencePage;
    public EditCadenceNameModal editCadenceName;
    public OrganizeStepsModal organizeSteps;
    public DeactivateActivateCadenceModal cadenceStatus;
    public BasePageObject basePageObject;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodTestsInit() {
        setup();
        initPage();
        loginPage.checkOpenedPage();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethodTestsInit() {
        driver.quit();
    }

    private void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.get(GRIFFIN_HILL_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    private void initPage() {
        basePageObject = new BasePageObject(getDriver());
        loginPage = new LoginPage();
        PageFactory.initElements(getDriver(), loginPage);
        achievementHubPage = new AchievementHubPage();
        PageFactory.initElements(getDriver(), achievementHubPage);
        ilassoPage = new IlassoPage();
        PageFactory.initElements(getDriver(), ilassoPage);
        viewCadencePage = new ViewCadencePage();
        PageFactory.initElements(getDriver(), viewCadencePage);
        editCadenceName = new EditCadenceNameModal();
        PageFactory.initElements(getDriver(), editCadenceName);
        organizeSteps = new OrganizeStepsModal();
        PageFactory.initElements(getDriver(), organizeSteps);
        cadenceStatus = new DeactivateActivateCadenceModal();
        PageFactory.initElements(getDriver(), cadenceStatus);
    }
}
