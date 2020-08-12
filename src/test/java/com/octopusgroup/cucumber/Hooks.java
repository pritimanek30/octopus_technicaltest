package com.octopusgroup.cucumber;

import com.cucumber.listener.Reporter;
import com.octopusgroup.basepage.BasePage;
import com.octopusgroup.browserselector.BrowserSelector;
import com.octopusgroup.loadproperty.LoadProperty;
import com.octopusgroup.utility.UtilMethods;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    //objects created
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    //getting values for keys from config.properties
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

   //Annotation used for code to run before each scenario
    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        Reporter.assignAuthor("Priti Manek");

    }
    //Annotation used for code to run after each scenario
    @After
    public void closeBrowser(Scenario scenario) {
        //capture screenshot and attach it to the report if the scenario fails
        if (scenario.isFailed()) {
            String screenshotpath = UtilMethods.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                //attaches the screenshot to the test
                Reporter.addScreenCaptureFromPath(screenshotpath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.quit();

    }
}