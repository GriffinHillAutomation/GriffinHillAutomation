package com.griffinhill.site.pages;

import com.griffinhill.entities.LoginInfo;
import com.relevantcodes.extentreports.model.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.griffinhill.site.pages.BasePageObject.click;
import static com.griffinhill.site.pages.BasePageObject.sendKeys;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;

public class LoginPage {

    @FindBy(xpath = "//input[@name='email']")
    private static WebElement email;
    @FindBy(xpath = "//input[@label='Password']")
    private static WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement login;
    @FindBy(xpath = "//a[contains(text(), 'Forgot password')]")
    private static WebElement forgotPassword;
    @FindBy(xpath = "//a[contains(text(), 'Terms of Service | ')]")
    private static WebElement termsOfService;
    @FindBy(xpath = "//a[contains(text(), 'Privacy Policy | ')]")
    private static WebElement privacyPolicy;
    @FindBy(xpath = "//a[contains(text(), 'Integration Information')]")
    private static WebElement integrationInformation;


    public static void checkOpenedPage() {
        checkElementsEnabled(email, password, login, forgotPassword, termsOfService, privacyPolicy, integrationInformation);
    }

    public static void login(LoginInfo loginInfo) {
        sendKeys(email, loginInfo.getEmail());
        sendKeys(password, loginInfo.getPassword());
        click(login);
    }
}
