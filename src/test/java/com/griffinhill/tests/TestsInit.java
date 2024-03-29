package com.griffinhill.tests;

import com.griffinhill.modals.DeactivateActivateCadenceModal;
import com.griffinhill.modals.EditCadenceNameModal;
import com.griffinhill.modals.OrganizeStepsModal;
import com.griffinhill.site.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.CommandLineArgs.CONFIG_FAILURE_POLICY;

public class TestsInit extends BasePageObject {
    /*legacy tools
    boyddev.griffinhill.com (staging) -> beta-legacy.griffinhill.com (beta) -> members.griffinhill.com (prod)

    v2 tools
    phplaravel-144553-1687977.cloudwaysapps.com (staging) -> beta.griffinhill.com (beta)  -> member.griffinhill.com (prod)*/

    //private final String GRIFFIN_HILL_URL = "https://beta-legacy.griffinhill.com/login/";
    //private final String GRIFFIN_HILL_URL = "https://beta.griffinhill.com/";
    //private final String GRIFFIN_HILL_URL = "https://members.griffinhill.com/";
    private String GRIFFIN_HILL_URL;
    private String env;

    public TestsInit() {

        Properties prop = new Properties();
        try (InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            prop.load(resourceAsStream);
            GRIFFIN_HILL_URL = (String) prop.get("url");
            env = (String) prop.get("env");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public LoginPage loginPage;

    public AchievementHubPage achievementHubPage;
    public IlassoPage ilassoPage;
    public ViewCadencePage viewCadencePage;
    public EditCadenceNameModal editCadenceName;
    public OrganizeStepsModal organizeSteps;
    public DeactivateActivateCadenceModal cadenceStatus;
    public ScorecardLegacyPage scorecardPage;
    public ScorecardBetaPage scorecardBetaPage;
    public IlassoBetaPage ilassoBetaPage;
    //public BasePageObject basePageObject;


    @BeforeMethod(alwaysRun = true)
    public void beforeMethodTestsInit() throws InterruptedException {
        setup();
        initPage();
        //checkOpenedPage();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethodTestsInit() {
        driver.close();
        driver.quit();
    }

    private void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phoebs\\Desktop\\test\\GriffinHillAutomation\\drivers\\chromedriver.exe");
//        WebDriverManager.edgedriver().setup();
//        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        EdgeOptions options = new EdgeOptions();
        options.setCapability(CONFIG_FAILURE_POLICY, "continue");
        //configfailurepolicy
        //	skip|continue
        driver = new ChromeDriver(options);
//        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        Thread.sleep(2000);
        //driver.get(GRIFFIN_HILL_URL);
    }

    public WebDriver getDriver() {
        return this.driver;
    }
    private void initPage() {

        //driver = getDriver();
        //basePageObject = new BasePageObject();
            loginPage = new LoginPage();
            achievementHubPage = new com.griffinhill.site.pages.AchievementHubPage();
            ilassoPage = new com.griffinhill.site.pages.IlassoPage();
            viewCadencePage = new com.griffinhill.site.pages.ViewCadencePage();
            scorecardPage = new ScorecardLegacyPage();
            scorecardBetaPage = new ScorecardBetaPage();
            ilassoBetaPage = new IlassoBetaPage();
            PageFactory.initElements(driver, loginPage);
            PageFactory.initElements(driver, achievementHubPage);
            PageFactory.initElements(driver, ilassoPage);
            PageFactory.initElements(driver, viewCadencePage);
            PageFactory.initElements(driver, scorecardPage);
            PageFactory.initElements(driver, ilassoBetaPage);

            PageFactory.initElements(driver, scorecardBetaPage);
        editCadenceName = new com.griffinhill.modals.EditCadenceNameModal();
        organizeSteps = new com.griffinhill.modals.OrganizeStepsModal();
        cadenceStatus = new com.griffinhill.modals.DeactivateActivateCadenceModal();
        PageFactory.initElements(driver, editCadenceName);
        PageFactory.initElements(driver, organizeSteps);
        PageFactory.initElements(driver, cadenceStatus);
    }
}
