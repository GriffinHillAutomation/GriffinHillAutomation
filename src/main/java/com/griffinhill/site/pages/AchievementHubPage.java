package com.griffinhill.site.pages;

import com.griffinhill.enums.PageNavigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.griffinhill.site.pages.BasePageObject.click;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;

public class AchievementHubPage {

    @FindBy(css = "ul.menu-lists li:nth-child(1)")
    private static WebElement learning;
    @FindBy(css = "ul.menu-lists li:nth-child(2)")
    private static WebElement priorityAlignmentTool;
    @FindBy(css = "ul.menu-lists li:nth-child(3)")
    private static WebElement highPerformanceJournal;
    @FindBy(css = "ul.menu-lists li:nth-child(4)")
    private static WebElement goalAchiever;
    @FindBy(css = "ul.menu-lists li:nth-child(5)")
    private static WebElement iLasso;
    @FindBy(css = "ul.menu-lists li:nth-child6)")
    private static WebElement scoreCard;

    public static void checkOpenedPage() {
        checkElementsEnabled(learning, priorityAlignmentTool, highPerformanceJournal, goalAchiever, iLasso, scoreCard);
    }

    public static void navigateTo(PageNavigation page) {
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
                click(iLasso);
                break;
            case SCORE_CARD:
                click(scoreCard);
                break;
        }
    }
}
