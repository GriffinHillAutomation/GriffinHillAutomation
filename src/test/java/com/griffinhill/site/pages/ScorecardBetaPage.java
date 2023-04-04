package com.griffinhill.site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.griffinhill.site.pages.BasePageObject.*;
import static com.griffinhill.utils.PageUtils.checkElementsEnabled;

public class ScorecardBetaPage {

    @FindBy(xpath = "//li/a[text()='Pipeline']")
    private static WebElement pipeline;
    @FindBy(xpath = "//li/a[text()='Reports']")
    private static WebElement reports;
    @FindBy(xpath = "//li/a[text()='Contacts']")
    private static WebElement contacts;
    @FindBy(xpath = "//li/a[text()='Calendar']")
    private static WebElement calendar;
    @FindBy(xpath = "//li/a[text()='Active']")
    private static WebElement active;
    @FindBy(xpath = "//li/a[text()='Pitch & Miss']")
    private static WebElement pitchAndMiss;
    @FindBy(xpath = "//li/a[text()='Closed Deals']")
    private static WebElement closedDeals;
    @FindBy(xpath = "//li/a[text()='All']")
    private static WebElement all;
    @FindBy(xpath = "//li/a[text()='Archived']")
    private static WebElement archived;
    @FindBy(xpath = "//li/a[text()='Prospects']")
    private static WebElement prospects;
    @FindBy(xpath = "//li/a[text()='Suspects']")
    private static WebElement suspects;
    @FindBy(xpath = "//li/a[text()='Overview']")
    private static WebElement overview;
    @FindBy(xpath = "//li/a[text()='Productivity']")
    private static WebElement productivity;
    @FindBy(xpath = "//li/a[text()='Proficiency']")
    private static WebElement proficiency;
    @FindBy(xpath = "//li/a[text()='Performance']")
    private static WebElement performance;
    @FindBy(css = "div.GriffinTable")
    private static WebElement activePipelineTable;
    @FindBy(xpath = "//input[@placeholder='Search for...']")
    private static WebElement searchBar;
    @FindBy(xpath = "//div[@class='Table']//button[text()='Search']")
    private static WebElement searchButton;
    @FindBy(css = "div.Table img.add-new-prospect-case")
    private static WebElement pipelineActiveAddButton;
    @FindBy(xpath = "//button[text()='Load All Data']")
    private static WebElement loadAllData;
    @FindBy(css = "div.ColumnFilter")
    private static WebElement pipelineActiveColumn;
    @FindBy(css = "div.active.btn-view")
    private static WebElement pipelineActiveView;
    @FindBy(css = "div.Contact table")
    private static WebElement contactsTable;
    @FindBy(xpath = "//button[text()='Advanced']")
    private static WebElement advanced;
    @FindBy(xpath = "//span[text()='Import']/parent::div/parent::button")
    private static WebElement importButton;
    @FindBy(css = "div.Pagination")
    private static WebElement pagination;
    @FindBy(css = "div.EventCalendar")
    private static WebElement calendarView;
    @FindBy(xpath = "//div[@class='Panel calendar-case-detail EventDetailPanel']")
    private static WebElement calendarEventPanel;
    @FindBy(css = "input[name='title']")
    private static WebElement title;
    @FindBy(css = "input[name='start_date']")
    private static WebElement startDate;
    @FindBy(css = "input[name='end_date']")
    private static WebElement endDate;
    @FindBy(xpath = "//label[text()='Start Time']/parent::div//input")
    private static WebElement startTime;
    @FindBy(xpath = "//label[text()='End Time']/parent::div//input")
    private static WebElement endTime;
    @FindBy(xpath = "//label[text()='Timezone']/parent::div//div[@class='input-group']")
    private static WebElement timeZone;
    @FindBy(xpath = "//ul[@class='input-tag-lists']")
    private static WebElement guests;
    @FindBy(xpath = "//button[text()='Add Location or Video Conference']")
    private static WebElement addLocationOrVideoConference;
    @FindBy(css = "textarea[name='description']")
    private static WebElement description;
    @FindBy(css = "input[type='checkbox']")
    private static WebElement sendCalendarInvitationCheckbox;
    @FindBy(xpath = "//button[text()='Add']")
    private static WebElement add;
    @FindBy(xpath = "//button[text()='Cancel']")
    private static WebElement cancel;
    @FindBy(css = "button[title='day view']")
    private static WebElement dayView;
    @FindBy(css = "button[title='week view']")
    private static WebElement weekView;
    @FindBy(css = "button[title='month view']")
    private static WebElement monthView;
    @FindBy(css = "button[title='Next month']")
    private static WebElement nextMonthButton;
    @FindBy(css = "button[title='Previous month']")
    private static WebElement previousMonthButton;
    @FindBy(css = "div.OverviewReportTabs")
    private static WebElement reportsOverview;
    @FindBy(css = "div.col-lg-12:nth-child(1) div.OverviewCharts")
    private static WebElement reportsOverviewCard;
    @FindBy(xpath = "//div[@class='ReportCard']//div[text()='Total Active Cases']")
    private static WebElement overviewTotalActiveCases;
    @FindBy(xpath = "//div[@class='ReportCard']//div[text()='Total Points by Events']")
    private static WebElement overviewTotalPointsByEvents;
    @FindBy(xpath = "//div[@class='ReportCard']//div[text()='Total Closed Revenue']")
    private static WebElement overviewTotalClosedRevenue;
    @FindBy(xpath = "div.col-lg-12:nth-child(2) div.OverviewCharts")
    private static WebElement overviewGoalAnalysis;
    @FindBy(xpath = "//div[@class='ReportCard']//div[text()='Points per Close']")
    private static WebElement pointsPerClose;
    @FindBy(xpath = "//div[@class='ReportCard']//div[text()='Revenue per Close']")
    private static WebElement revenuePerClose;
    @FindBy(xpath = "//div[@class='ReportCard']//div[text()='Revenue per Point']")
    private static WebElement revenuePerPoint;
    @FindBy(xpath = "//div[@class='OverviewCharts']//div[text()='Points by Events']/parent::div/parent::div")
    private static WebElement pointsByEvents;
    @FindBy(xpath = "//div[@class='OverviewCharts']//div[text()='Active Cases Count']/parent::div/parent::div")
    private static WebElement activeCasesCount;
    @FindBy(xpath = "//div[@class='OverviewCharts']//div[text()='Ratio by Needs Audit (NA)']/parent::div/parent::div")
    private static WebElement ratioByNeedsAudit;
    @FindBy(xpath = "//div[@class='OverviewCharts']//div[text()='Pipeline Advancement Counts']/parent::div/parent::div")
    private static WebElement pipelineAdvancementCounts;
    @FindBy(xpath = "//div[@class='ReportMetrics']")
    private static WebElement reportMetrics;
    @FindBy(xpath = "//span[text()='Attempts']/parent::div/parent::a")
    private static WebElement productivityAttempts;
    @FindBy(xpath = "//span[text()='Demo']/parent::div/parent::a")
    private static WebElement productivityDemo;
    @FindBy(xpath = "//span[text()='Points by Events']/parent::div/parent::a")
    private static WebElement productivityPointsByEvents;
    @FindBy(xpath = "//span[text()='Active Cases Count']/parent::div/parent::a")
    private static WebElement productivityActiveCasesCount;
    @FindBy(xpath = "//span[text()='Active Cases Percent']/parent::div/parent::a")
    private static WebElement productivityActiveCasesPercent;
    @FindBy(xpath = "//span[text()='Point Trends by Week']/parent::div/parent::a")
    private static WebElement productivityPointTrendsByWeek;
    @FindBy(xpath = "//span[text()='Point Trends by Day of the Week']/parent::div/parent::a")
    private static WebElement productivityPointTrendsByDayOfTheWeek;
    @FindBy(css = "input[name='filters[0].from']")
    private static WebElement filterDateFrom;
    @FindBy(css = "input[name='filters[0].to']")
    private static WebElement filterDateTo;
    @FindBy(xpath = "//button[text()='Year to Date']")
    private static WebElement yearToDate;
    @FindBy(xpath = "//button[text()='Month to Date']")
    private static WebElement monthToDate;
    @FindBy(xpath = "//button[text()='Last Year']")
    private static WebElement lastYear;
    @FindBy(xpath = "//button[text()='Last Quarter']")
    private static WebElement lastQuarter;
    @FindBy(xpath = "//button[text()='Last Month']")
    private static WebElement lastMonth;
    @FindBy(xpath = "//button[text()='Last Week']")
    private static WebElement lastWeek;
    @FindBy(xpath = "//button[text()='Yesterday']")
    private static WebElement yesterday;
    @FindBy(xpath = "//button[text()='Submit']")
    private static WebElement submit;
    @FindBy(css = "label.InputTag")
    private static WebElement filterByLabel;
    @FindBy(xpath = "//button[text()='Apply']")
    private static WebElement apply;
    @FindBy(xpath = "//button[text()='Export Sheet']")
    private static WebElement exportSheet;
    @FindBy(xpath = "//button[text()='Export PDF']")
    private static WebElement exportPdf;
    @FindBy(xpath = "//button[text()='Compare']")
    private static WebElement compare;
    @FindBy(xpath = "//div[@class='chart-container undefined']")
    private static WebElement reportsChart;
    @FindBy(xpath = "//span[text()='Ratios - By NA']/parent::div/parent::a")
    private static WebElement proficiencyRatiosByNa;
    @FindBy(xpath = "//span[text()='Ratios - By SP']/parent::div/parent::a")
    private static WebElement proficiencyRatiosBySp;
    @FindBy(xpath = "//span[text()='Ratios - By AS']/parent::div/parent::a")
    private static WebElement proficiencyRatiosByAs;
    @FindBy(xpath = "//span[text()='Ratios - By CL']/parent::div/parent::a")
    private static WebElement proficiencyRatiosByCl;
    @FindBy(xpath = "//span[text()='Pipeline Advancement Counts']/parent::div/parent::a")
    private static WebElement proficiencyPipelineAdvancementCounts;
    @FindBy(xpath = "//span[text()='Pipeline Advancement Percent']/parent::div/parent::a")
    private static WebElement proficiencyPipelineAdvancementPercent;
    @FindBy(xpath = "//span[text()='Goal Analysis']/parent::div/parent::a")
    private static WebElement performanceGoalAnalysis;
    @FindBy(xpath = "//span[text()='Closed Revenue']/parent::div/parent::a")
    private static WebElement performanceClosedRevenue;
    @FindBy(xpath = "//span[text()='Closes']/parent::div/parent::a")
    private static WebElement performanceCloses;
    @FindBy(xpath = "//div[@class='chart-container white']//div[text()='Points per Close']/parent::div")
    private static WebElement reportChartPointsPerClose;
    @FindBy(xpath = "//div[@class='chart-container white']//div[text()='Revenue per Close']/parent::div")
    private static WebElement reportChartRevenuePerClose;
    @FindBy(xpath = "//div[@class='chart-container white']//div[text()='Revenue per Point']/parent::div")
    private static WebElement reportChartRevenuePerPoint;

    public void checkOpenedPage() {
        checkElementsEnabled(new WebElement[]{pipeline, contacts, calendar, reports});
    }

    public void validateScorecardPiplelineActive() {
        checkElementsEnabled(new WebElement[]{activePipelineTable, pipelineActiveAddButton, loadAllData,
                pipelineActiveColumn, pipelineActiveView, pagination});
    }

    public void clickContacts() {
        click(contacts);
    }

    public void validateContactsAll() {
        checkElementsEnabled(new WebElement[]{contactsTable, searchButton, advanced,
                loadAllData, importButton, pagination});
    }

    public void clickCalendar() {
        click(calendar);
    }

    public void validateCalendar() {
        checkElementsEnabled(new WebElement[]{calendarView, calendarEventPanel, title,
                startDate, endDate, startTime, endTime, dayView, weekView,
                timeZone, guests, addLocationOrVideoConference, description,
                sendCalendarInvitationCheckbox, add, cancel,
                monthView, nextMonthButton, previousMonthButton});
    }

    public void clickReports() {
        click(reports);
    }

    public void validateReportsOverview() {
        checkElementsEnabled(new WebElement[]{reportsOverview, reportsOverviewCard, overviewTotalActiveCases,
                overviewTotalPointsByEvents, overviewTotalClosedRevenue, overviewGoalAnalysis,
                pointsPerClose, revenuePerClose, revenuePerPoint, pointsByEvents, activeCasesCount,
                ratioByNeedsAudit, pipelineAdvancementCounts, reportMetrics});
    }

    public void clickPitchAndMiss() {
        click(pitchAndMiss);
    }

    public void validatePiplelinePitchAndMiss() {
        checkElementsEnabled(new WebElement[]{activePipelineTable, searchBar, searchButton,
                pipelineActiveAddButton, loadAllData,
                pipelineActiveColumn, pipelineActiveView, pagination});
    }

    public void clickClosedDeals() {
        click(closedDeals);
    }

    public void validatePiplelineClosedDeals() {
        checkElementsEnabled(new WebElement[]{activePipelineTable, searchBar, searchButton,
                pipelineActiveAddButton, loadAllData,
                pipelineActiveColumn, pipelineActiveView, pagination});
    }

    public void clickPipelineAll() {
        click(all);
    }

    public void validatePiplelineAll() {
        checkElementsEnabled(new WebElement[]{activePipelineTable, searchBar, searchButton,
                pipelineActiveAddButton, loadAllData,
                pipelineActiveColumn, pipelineActiveView, pagination});
    }

    public void clickArchived() {
        click(archived);
    }

    public void validatePipelineArchived() {
        checkElementsEnabled(new WebElement[]{activePipelineTable, searchBar, searchButton,
                pipelineActiveAddButton, loadAllData,
                pipelineActiveColumn, pipelineActiveView, pagination});
    }

    public void clickProspects() {
        click(prospects);
    }

    public void validateContactsProspects() {
        checkElementsEnabled(new WebElement[]{contactsTable, searchButton, advanced,
                loadAllData, importButton, pagination});
    }

    public void clickSuspects() {
        click(suspects);
    }

    public void validateContactsSuspects() {
        checkElementsEnabled(new WebElement[]{contactsTable, searchButton, advanced,
                loadAllData, importButton, pagination});
    }

    public void clickProductivity() {
        click(productivity);
    }

    public void validateReportsProductivity() {
        checkElementsEnabled(new WebElement[]{productivityAttempts, productivityAttempts,
                productivityDemo, productivityPointsByEvents, productivityActiveCasesCount,
                productivityActiveCasesPercent, productivityPointTrendsByWeek,
                productivityPointTrendsByDayOfTheWeek, filterDateFrom,
                filterDateTo, yearToDate, monthToDate, lastYear,
                lastQuarter, lastMonth, lastWeek, yesterday,
                submit, filterByLabel, apply, exportSheet, exportPdf, compare,
                reportsChart, searchBar, advanced, loadAllData, pagination});
    }

    public void clickProficiency() {
        click(productivity);
    }

    public void validateReportsProficiency() {
        checkElementsEnabled(new WebElement[]{proficiencyRatiosByNa ,proficiencyRatiosBySp, proficiencyRatiosByAs,
                proficiencyRatiosByCl, proficiencyPipelineAdvancementCounts,
                proficiencyPipelineAdvancementPercent, filterDateFrom,
                filterDateTo, yearToDate, monthToDate, lastYear,
                lastQuarter, lastMonth, lastWeek, yesterday,
                submit, filterByLabel, apply, exportSheet, exportPdf, compare,
                reportsChart, searchBar, advanced, loadAllData, pagination});
    }

    public void clickPerformance() {
        click(performance);
    }

    public void validateReportsPerfomance() {
        checkElementsEnabled(new WebElement[]{reportChartPointsPerClose, reportChartRevenuePerClose,
                reportChartRevenuePerPoint, filterDateFrom,
                filterDateTo, yearToDate, monthToDate, lastYear,
                lastQuarter, lastMonth, lastWeek, yesterday,
                submit, filterByLabel, apply, exportSheet, exportPdf, compare,
                reportsChart, searchBar, advanced, loadAllData, pagination});
    }
}
