package com.griffinhill.site.pages;

import com.griffinhill.enums.PageNavigation;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.griffinhill.site.pages.BasePageObject.*;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;

public class AchievementHubPage {

    @FindBy(xpath = "(//*[@ng-if='tool.btn_image'])[1]")
    private static WebElement learning;
    @FindBy(xpath = "//h4[text()='ScoreCard']|//div[*[text()='ScoreCard']]")
    private static WebElement scoreCard;
    @FindBy(xpath = "(//*[@ng-if='tool.btn_image'])[3]")
    private static WebElement highPerformanceJournal;
    @FindBy(xpath = "(//*[@ng-if='tool.btn_image'])[4]")
    private static WebElement priorityAlignmentTool;
    @FindBy(xpath = "(//*[@ng-if='tool.btn_image'])[5]")
    private static WebElement goalAchiever;
    @FindBy(xpath = "//h4[text()='iLasso']")
    private static WebElement iLasso;

    public void checkOpenedPage() {
        checkElementsEnabled(new WebElement[]{learning, priorityAlignmentTool, highPerformanceJournal, goalAchiever, iLasso, scoreCard});
    }

    public void navigateTo(PageNavigation page) {

        //waitForPageLoad();
        //checkOpenedPage();
        switch (page) {
            case LEARNING:
                click(learning);
                break;
            case PRIORITY_ALIGNMENT_TOOL:
                click(priorityAlignmentTool);
                break;
            case HIGH_PERFORMANCE_JOURNAL:
                click(highPerformanceJournal);
                break;
            case GOAL_ACHIEVER:
                click(goalAchiever);
                break;
            case ILASSO:
                try {
                    click("//h4[text()='iLasso']/parent::div/parent::div/parent::div/parent::div");
                }
                catch (Exception e){
                    waitUntilPageIsLoaded();
                    click("//h4[text()='iLasso']/parent::div/parent::div/parent::div/parent::div");
                }
                break;
            case ILASSO_BETA:
                click("//span[text()='iLasso']/parent::div/parent::li");
                break;
            case SCORE_CARD:
                click(scoreCard);
                break;
        }
    }
}
