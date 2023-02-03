package com.griffinhill.tests;

import com.griffinhill.site.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestsInit {

    public static WebDriver driver;
    private final String GRIFFIN_HILL_URL = "https://beta.griffinhill.com/login";

    public LoginPage loginPage;
    public AchievementHubPage achievementHubPage;
    public IlassoPage ilassoPage;
    public BasePageObject basePageObject;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodTestsInit() {
        setup();
        initPage();
        loginPage.checkOpenedPage();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethodTestsInit() { driver.quit(); }

    private void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(GRIFFIN_HILL_URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
    }
}
