package com.octopusgroup.pages;

import com.cucumber.listener.Reporter;
import com.octopusgroup.utility.UtilMethods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsightPage extends UtilMethods {



    //Displays class name in the logs
    private static final Logger log = LogManager.getLogger(InsightPage.class.getName());

    //Page Factory annotation used to find elements
    @FindBy(xpath = "//h1[contains(text(),'Insights')]")
    WebElement insightHeading;

    @FindBy(xpath = "//select[@class='select-css']")
    WebElement filterByBusiness;

    @FindBy(xpath = "//div[4]//article[1]//div[1]//div[1]")
    WebElement filterResults;

    @FindBy(xpath = "//a[@class='wp-block-button__link']")
    WebElement blogLink;

    @FindBy(xpath = "//h1[contains(text(),'Simon says')]")
    WebElement blogPageText;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    WebElement searchBarLink;

    @FindBy(xpath = "//input[@placeholder='What are you looking for?']")
    WebElement searchBar;


    @FindBy(xpath = "//div[@class='modal-header--form deepsea-form']//i[@class='search-submit']")
    WebElement searchResults;

    @FindBy(xpath = "//section[@class='section section--no-spacing']//h3[@class='card-itemTitle']//a")
    WebElement readMore;

    @FindBy(xpath = "//h1[@class='h2']")
    WebElement articleHeading;

    @FindBy(xpath = "//div[@class='_hj-f5b2a1eb-9b07_feedback_minimized_label_text']")
    WebElement feedabackTab;

    @FindBy(id="_hj-f5b2a1eb-9b07_hotjar_branding")
    WebElement feedbackText;


    //Method to verify the Insight Heading
    public void verifyInsighHeading(String text) {
        Reporter.addStepLog("Verifying the heading Insights when user navigates to https://octopusgroup.com/insights/" + insightHeading + "<br>");
        verifyText(insightHeading, text);
        log.info("Verifying the heading Insights when user navigates to https://octopusgroup.com/insights/");
    }

    // Method to filter the business type from the dropdown menu

    public void selectBusinessType(String value) {
        Reporter.addStepLog("Selecting the business type from the dropdown menu using value" + filterByBusiness + "<br>");
        selectByValueFromDropDown(filterByBusiness, value);
        log.info("Selecting the business type from the dropdown menu using value");
    }
    //Method to verify filter results

    public void verifyFilterResults(String text) {
        Reporter.addStepLog("Verifying filter results" + filterResults + "<br>");
        verifyText(filterResults, text);
    }

    //Method to navigate to CEO's blog

    public void navigateToBlogPage() {
        Reporter.addStepLog("Clicking on the blog link by Simon Rogerson" + blogLink + "<br>");
        clickOnElement(blogLink);
        log.info("Clicking on the blog link by Simon Rogerson");

    }
    //Method to verify the blog page heading

    public void verifyTheBlogPageHeading(String text) {
        Reporter.addStepLog("Verifying the heading on the blog page" + blogPageText + "<br>");
        verifyText(blogPageText, text);
        log.info("Verifying the heading on the blog page");
    }

    //Method to click on search bar on top right side

    public void clickOnSearchBar() {
        Reporter.addStepLog("Clicking on the search bar" + searchBarLink + "<br>");
        clickOnElement(searchBarLink);
        log.info("Clicking on the search bar");
    }

    // Method to type in the search bar

    public void typingTextForSearch(String text) {
        Reporter.addStepLog("Entering the text we want to search for" + searchBar + "<br>");
        sendTextToElement(searchBar, text);
        log.info("Entering the text we want to search for");
    }

    //Method to verify the search results

    public void verifySearchResults(String text) {
        Reporter.addStepLog("Verifying the search results for octopus real estate on search result page"+searchResults+"<br>");
        verifyText(searchResults, text);
        log.info("Verifying the search results for octopus real estate on search result page");
    }
    //Method to click on read more tab

    public void clickOnReadMoreTab(){
        Reporter.addStepLog("Clicking on read more tab and navigating to the article page"+readMore+"<br>");
        waitUntilElementToBeClickable(readMore,10);
        clickOnElement(readMore);
        log.info("Clicking on read more tab and navigating to the article page");
    }

    //Method to verify the heading of the article

    public void verifyArticleHeading(String text) {
        Reporter.addStepLog("Verifying the heading of the article");
        verifyText(readMore, text);
        log.info("Verifying the heading of the article");
    }

    //Method to click on feedback tab

    public void clickOnFeedback(){
        Reporter.addStepLog("Clicking on feedback tab"+feedabackTab+"<br>");
        clickOnElement(feedabackTab);
        log.info("Clicking on feedback tab");
    }

    //Verifying the text on feedback bar

    public void verifyTextOnFeedbackBar(String text){
        Reporter.addStepLog("Verifying the feedback bar text"+feedbackText+"<br>");
        verifyText(feedbackText,text);
        log.info("Verifying the feedback bar text");
    }
}
