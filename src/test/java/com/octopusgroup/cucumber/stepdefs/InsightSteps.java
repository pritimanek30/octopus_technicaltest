package com.octopusgroup.cucumber.stepdefs;

import com.octopusgroup.pages.InsightPage;
import com.sun.corba.se.impl.protocol.INSServerRequestDispatcher;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InsightSteps {
    @Given("^User is on the Insight page$")
    public void userIsOnTheInsightPage() {
    }

    @Then("^User can see the heading \"([^\"]*)\"$")
    public void userCanSeeTheHeading(String text) {
       new InsightPage().verifyInsighHeading(text);
    }
    @When("^User clicks on filter by business and selects the business type using value \"([^\"]*)\"$")
    public void userClicksOnFilterByBusinessAndSelectsTheBusinessTypeUsingValue(String value)  {
        new InsightPage().selectBusinessType(value);
    }


    @Then("^User can see the results filtered by Octopus Energy and see the text \"([^\"]*)\" displayed in the results$")
    public void userCanSeeTheResultsFilteredByOctopusEnergyAndSeeTheTextDisplayedInTheResults(String text)  {
      new InsightPage().verifyFilterResults(text);
    }


    @When("^User clicks on the blog link$")
    public void userClicksOnTheBlogLink() {
        new InsightPage().navigateToBlogPage();
    }


    @Then("^User successfully navigate to blog page and verifies the text\"([^\"]*)\"$")
    public void userSuccessfullyNavigateToBlogPageAndVerifiesTheText(String text) {
       new InsightPage().verifyTheBlogPageHeading(text);
    }

    @When("^User clicks on the search link$")
    public void userClicksOnTheSearchLink() {
        new InsightPage().clickOnSearchBar();
    }

    @And("^User enters the text to search for \"([^\"]*)\"$")
    public void userEntersTheTextToSearchFor(String text)  {
        new InsightPage().typingTextForSearch(text);

    }

    @Then("^User can see search results and sees the text displayed \"([^\"]*)\"$")
    public void userCanSeeSearchResultsAndSeesTheTextDisplayed(String text) {
        new InsightPage().verifySearchResults(text);
    }

    @When("^User clicks on read more tab$")
    public void userClicksOnReadMoreTab() {
        new InsightPage().clickOnReadMoreTab();
    }

    @Then("^User is navigating to the page with complete article and sees the heading \"([^\"]*)\"$")
    public void userIsNavigatingToThePageWithCompleteArticleAndSeesTheHeading(String text) {
        new InsightPage().verifyArticleHeading(text);
    }

    @When("^User clicks on feedback tab$")
    public void userClicksOnFeedbackTab() {
        new InsightPage().clickOnFeedback();
    }

    @Then("^User is able to see some text\"([^\"]*)\"$")
    public void userIsAbleToSeeSomeText(String text)  {
        new InsightPage().verifyTextOnFeedbackBar(text);

    }
}

