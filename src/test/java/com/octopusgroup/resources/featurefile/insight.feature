Feature: Insight page features
  @Smoke
  Scenario: User can see the header Insight when navigates to Insight page
    Given User is on the Insight page
    Then User can see the heading "Insights"

  @Smoke
  Scenario: User can navigate to various business type successfully
    Given User is on the Insight page
    When User clicks on filter by business and selects the business type using value "octopus-energy"
    Then User can see the results filtered by Octopus Energy and see the text "Octopus Energy" displayed in the results

  @Sanity
  Scenario: User can navigate to CEO's blog page successfully
    Given User is on the Insight page
    When User clicks on the blog link
    Then User successfully navigate to blog page and verifies the text"Simon says"

  @Sanity
  Scenario: User can search in the search bar
    Given User is on the Insight page
    When User clicks on the search link
    And User enters the text to search for "Octopus Real estate"
    Then User can see search results and sees the text displayed ""

  @Regression
  Scenario: User can access the full article by clicking on read more tab
    Given User is on the Insight page
    When User clicks on read more tab
    Then User is navigating to the page with complete article and sees the heading "Octopus calls for a nation of entrepreneurs to rebuild UK economy"

  @Regression
  Scenario: User can click on feedback tab and see the various option to sent
    Given  User is on the Insight page
    When User clicks on feedback tab
    Then User is able to see some text"Not using Hotjar?"