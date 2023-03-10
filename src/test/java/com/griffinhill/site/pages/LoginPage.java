package com.griffinhill.site.pages;

import com.griffinhill.entities.LoginInfo;
import io.qameta.allure.Step;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.griffinhill.site.pages.BasePageObject.*;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;

public class LoginPage{

    @FindBy(xpath = "//input[@name='username']")
    private static WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    private static WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement login;
    @FindBy(xpath = "//a[contains(text(), 'Forgot your password?')]")
    private static WebElement forgotPassword;
    @FindBy(xpath = "//a[contains(text(), 'Terms of Service |    ')]")
    private static WebElement termsOfService;
    @FindBy(xpath = "//a[contains(text(), 'Privacy Policy | ')]")
    private static WebElement privacyPolicy;
    @FindBy(xpath = "//a[contains(text(), 'Integration Information')]")
    private static WebElement integrationInformation;


    public static void checkOpenedPage() {
        checkElementsEnabled(new WebElement[]{username, password, login});// forgotPassword, termsOfService, privacyPolicy, integrationInformation);
    }

    @Step("log in")
    public static void login(LoginInfo loginInfo) {
        try {
            checkOpenedPage();
            sendKeys(username, loginInfo.getEmail());
            sendKeys(password, loginInfo.getPassword());
            click(login);
        }
        catch (ElementNotInteractableException e)
        {
            waitForPageLoad();
        }

        waitUntilPageIsLoaded();
    }
}
