package com.octopusgroup.cucumber;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

//Junit runs this class as a Cucumber test
@RunWith(Cucumber.class)
@CucumberOptions(
        //feature file path
        features = ".",
        //creates json report/cucumber default report/creates extent report
        plugin = {"json:target/RunCuke/cucumber.json", "pretty", "html:target/cucumber-report/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"},
        //monochrome value set to true makes console output more readable
        monochrome = true,
        //assists in creating different test packs and execute them individually or simultaneously
        tags = {"@Sanity,@Smoke,@Regression"}

)


//Cucumber runner class
public class CukeTest {
    @AfterClass
    public static void setUp() {
        String projectPath = System.getProperty("user.dir");
        //generates Extent report
        String reportConfigPath = projectPath + "\\src\\test\\java\\com\\octopusgroup\\resources\\extentreport\\extent-report.xml";
        //using the Reporter from cucumber.Listener
        //This will load the extent configurations from extent-config XML and write the report in the desired path
        Reporter.loadXMLConfig(reportConfigPath);
        //set system name into the Extent report
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        //get system time zone into the Extent report
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        //set local machines info into the Extent report
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        //set Selenium version info into the Extent report
        Reporter.setSystemInfo("Selenium Version", "3.141.59");
        //Maven version info into the Extent report
        Reporter.setSystemInfo("Maven Version", "3.5.2");
        //Java version info into the Extent report
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }
}