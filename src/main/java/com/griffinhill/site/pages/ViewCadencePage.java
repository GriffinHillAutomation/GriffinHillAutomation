package com.griffinhill.site.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.griffinhill.utils.PageUtils.checkElementsEnabled;

public class ViewCadencePage {

    @FindBy(xpath = "//a[@data-rb-event-key='cadence-flow']")
    private static WebElement cadenceFlow;
    @FindBy(xpath = "//a[@data-rb-event-key='reports']")
    private static WebElement reports;
    @FindBy(xpath = "//a[@data-rb-event-key='contacts']")
    private static WebElement contacts;
    @FindBy(xpath = "//a[@data-rb-event-key='integrations']")
    private static WebElement integration;
    @FindBy(xpath = "//a[@data-rb-event-key='settings']")
    private static WebElement settings;
    @FindBy(css = "div.TallyBox:nth-child(1)")
    private static WebElement steps;
    @FindBy(css = "div.TallyBox:nth-child(2)")
    private static WebElement days;
    @FindBy(css = "div.TallyBox:nth-child(3)")
    private static WebElement prospects;
    @FindBy(css = "div.AddIconLabel")
    private static WebElement addStep;
    @FindBy(css = "div.FloatingButton.circle")
    private static WebElement needHelp;

    public void checkOpenedPage() {
        checkElementsEnabled(cadenceFlow, reports, contacts, integration, settings);
    }

    public void validateViewCadenceButtons() {
        checkElementsEnabled(steps, days, prospects, addStep, needHelp);
    }
}
