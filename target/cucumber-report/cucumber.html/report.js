$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/octopusgroup/resources/featurefile/insight.feature");
formatter.feature({
  "line": 1,
  "name": "Insight page features",
  "description": "",
  "id": "insight-page-features",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8065264000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User can see the header Insight when navigates to Insight page",
  "description": "",
  "id": "insight-page-features;user-can-see-the-header-insight-when-navigates-to-insight-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on the Insight page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User can see the heading \"Insights\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InsightSteps.userIsOnTheInsightPage()"
});
formatter.result({
  "duration": 238739300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Insights",
      "offset": 26
    }
  ],
  "location": "InsightSteps.userCanSeeTheHeading(String)"
});
formatter.result({
  "duration": 117373400,
  "status": "passed"
});
formatter.after({
  "duration": 702623300,
  "status": "passed"
});
formatter.before({
  "duration": 6832262300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User can navigate to various business type successfully",
  "description": "",
  "id": "insight-page-features;user-can-navigate-to-various-business-type-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is on the Insight page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User clicks on filter by business and selects the business type using value \"octopus-energy\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User can see the results filtered by Octopus Energy and see the text \"Octopus Energy\" displayed in the results",
  "keyword": "Then "
});
formatter.match({
  "location": "InsightSteps.userIsOnTheInsightPage()"
});
formatter.result({
  "duration": 37200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "octopus-energy",
      "offset": 77
    }
  ],
  "location": "InsightSteps.userClicksOnFilterByBusinessAndSelectsTheBusinessTypeUsingValue(String)"
});
formatter.result({
  "duration": 399270300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Octopus Energy",
      "offset": 70
    }
  ],
  "location": "InsightSteps.userCanSeeTheResultsFilteredByOctopusEnergyAndSeeTheTextDisplayedInTheResults(String)"
});
formatter.result({
  "duration": 563135100,
  "status": "passed"
});
formatter.after({
  "duration": 703629500,
  "status": "passed"
});
formatter.before({
  "duration": 6704394600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User can navigate to CEO\u0027s blog page successfully",
  "description": "",
  "id": "insight-page-features;user-can-navigate-to-ceo\u0027s-blog-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on the Insight page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User clicks on the blog link",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User successfully navigate to blog page and verifies the text\"Simon says\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InsightSteps.userIsOnTheInsightPage()"
});
formatter.result({
  "duration": 35800,
  "status": "passed"
});
formatter.match({
  "location": "InsightSteps.userClicksOnTheBlogLink()"
});
formatter.result({
  "duration": 312377600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Simon says",
      "offset": 62
    }
  ],
  "location": "InsightSteps.userSuccessfullyNavigateToBlogPageAndVerifiesTheText(String)"
});
formatter.result({
  "duration": 317009200,
  "status": "passed"
});
formatter.after({
  "duration": 665504200,
  "status": "passed"
});
formatter.before({
  "duration": 6654900800,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User can search in the search bar",
  "description": "",
  "id": "insight-page-features;user-can-search-in-the-search-bar",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is on the Insight page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User clicks on the search link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User enters the text to search for \"Octopus Real estate\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User can see search results and sees the text displayed \"\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InsightSteps.userIsOnTheInsightPage()"
});
formatter.result({
  "duration": 54400,
  "status": "passed"
});
formatter.match({
  "location": "InsightSteps.userClicksOnTheSearchLink()"
});
formatter.result({
  "duration": 146317100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Octopus Real estate",
      "offset": 36
    }
  ],
  "location": "InsightSteps.userEntersTheTextToSearchFor(String)"
});
formatter.result({
  "duration": 484387300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 57
    }
  ],
  "location": "InsightSteps.userCanSeeSearchResultsAndSeesTheTextDisplayed(String)"
});
formatter.result({
  "duration": 119752000,
  "status": "passed"
});
formatter.after({
  "duration": 666667500,
  "status": "passed"
});
formatter.before({
  "duration": 6664922000,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User can access the full article by clicking on read more tab",
  "description": "",
  "id": "insight-page-features;user-can-access-the-full-article-by-clicking-on-read-more-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "User is on the Insight page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "User clicks on read more tab",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User is navigating to the page with complete article and sees the heading \"Octopus calls for a nation of entrepreneurs to rebuild UK economy\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InsightSteps.userIsOnTheInsightPage()"
});
formatter.result({
  "duration": 28900,
  "status": "passed"
});
formatter.match({
  "location": "InsightSteps.userClicksOnReadMoreTab()"
});
formatter.result({
  "duration": 546239800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Octopus calls for a nation of entrepreneurs to rebuild UK economy",
      "offset": 75
    }
  ],
  "location": "InsightSteps.userIsNavigatingToThePageWithCompleteArticleAndSeesTheHeading(String)"
});
formatter.result({
  "duration": 10214889800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//section[@class\u003d\u0027section section--no-spacing\u0027]//h3[@class\u003d\u0027card-itemTitle\u0027]//a\"}\n  (Session info: chrome\u003d84.0.4147.125)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-U7IA4UC\u0027, ip: \u0027192.168.0.22\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.125, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\mehul\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:55022}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f51d99e3e18b430f92e3d1c20712a39e\n*** Element info: {Using\u003dxpath, value\u003d//section[@class\u003d\u0027section section--no-spacing\u0027]//h3[@class\u003d\u0027card-itemTitle\u0027]//a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\r\n\tat com.octopusgroup.utility.UtilMethods.verifyText(UtilMethods.java:76)\r\n\tat com.octopusgroup.pages.InsightPage.verifyArticleHeading(InsightPage.java:129)\r\n\tat com.octopusgroup.cucumber.stepdefs.InsightSteps.userIsNavigatingToThePageWithCompleteArticleAndSeesTheHeading(InsightSteps.java:66)\r\n\tat ✽.Then User is navigating to the page with complete article and sees the heading \"Octopus calls for a nation of entrepreneurs to rebuild UK economy\"(src/test/java/com/octopusgroup/resources/featurefile/insight.feature:30)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2504571800,
  "status": "passed"
});
formatter.before({
  "duration": 6778695200,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User can click on feedback tab and see the various option to sent",
  "description": "",
  "id": "insight-page-features;user-can-click-on-feedback-tab-and-see-the-various-option-to-sent",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User is on the Insight page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "User clicks on feedback tab",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User is able to see some text\"Not using Hotjar?\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InsightSteps.userIsOnTheInsightPage()"
});
formatter.result({
  "duration": 139100,
  "status": "passed"
});
formatter.match({
  "location": "InsightSteps.userClicksOnFeedbackTab()"
});
formatter.result({
  "duration": 309501400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Not using Hotjar?",
      "offset": 30
    }
  ],
  "location": "InsightSteps.userIsAbleToSeeSomeText(String)"
});
formatter.result({
  "duration": 97491500,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cNot using Hotjar[ yet]?\u003e but was:\u003cNot using Hotjar[]?\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.octopusgroup.utility.UtilMethods.verifyText(UtilMethods.java:76)\r\n\tat com.octopusgroup.pages.InsightPage.verifyTextOnFeedbackBar(InsightPage.java:145)\r\n\tat com.octopusgroup.cucumber.stepdefs.InsightSteps.userIsAbleToSeeSomeText(InsightSteps.java:76)\r\n\tat ✽.Then User is able to see some text\"Not using Hotjar?\"(src/test/java/com/octopusgroup/resources/featurefile/insight.feature:36)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1609021200,
  "status": "passed"
});
});