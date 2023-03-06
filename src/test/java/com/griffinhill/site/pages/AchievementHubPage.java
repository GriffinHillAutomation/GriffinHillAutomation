package com.griffinhill.site.pages;

import com.griffinhill.enums.PageNavigation;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.griffinhill.site.pages.BasePageObject.click;
import static com.griffinhill.site.pages.BasePageObject.waitUntilPageIsLoaded;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;

public class AchievementHubPage {

    @FindBy(xpath = "(//*[@ng-if='tool.btn_image'])[1]")
    private static WebElement learning;
    @FindBy(xpath = "(//*[@ng-if='tool.btn_image'])[2]")
    private static WebElement scoreCard;
    @FindBy(xpath = "(//*[@ng-if='tool.btn_image'])[3]")
    private static WebElement highPerformanceJournal;
    @FindBy(xpath = "(//*[@ng-if='tool.btn_image'])[4]")
    private static WebElement priorityAlignmentTool;
    @FindBy(xpath = "(//*[@ng-if='tool.btn_image'])[5]")
    private static WebElement goalAchiever;
    @FindBy(xpath = "(//*[@ng-if='tool.btn_image'])[6]")
    private static WebElement iLasso;

    public void checkOpenedPage() {
        checkElementsEnabled(learning, priorityAlignmentTool, highPerformanceJournal, goalAchiever, iLasso, scoreCard);
    }

    public void navigateTo(PageNavigation page) {
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
                //try {
                    click(iLasso);
                //}
                //catch (NoSuchElementException e){
                //    waitUntilPageIsLoaded();
                //}

                break;
            case SCORE_CARD:
                click(scoreCard);
                break;
        }
    }
}
